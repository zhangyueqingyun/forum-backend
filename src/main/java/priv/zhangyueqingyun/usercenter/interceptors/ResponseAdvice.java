package priv.zhangyueqingyun.usercenter.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Component;

import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.Getter;
import lombok.Setter;
import priv.zhangyueqingyun.usercenter.base.ZResponse;

import java.util.LinkedHashMap;


@ResponseBody
@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {
  @Autowired
  private ZResponse response;

  @Override
  public boolean supports(
    MethodParameter methodParameter, 
    Class<? extends HttpMessageConverter<?>> converterType
  ) {
    return true;
  }

  @Override 
  public Object beforeBodyWrite(
    Object object, 
    MethodParameter methodParameter, 
    MediaType mediaType, 
    Class<? extends HttpMessageConverter<?>> selectedConverterType, 
    ServerHttpRequest serverHttpRequest, 
    ServerHttpResponse serverHttpResponse
  ) {
    try {
      if(object instanceof ZResponse || object instanceof String){
        return object;
      } else if (object instanceof LinkedHashMap) {
        LinkedHashMap<String, ?> linkedHashMap = (LinkedHashMap<String, ?>) object;
        Integer code = (Integer) linkedHashMap.get("status");
        if(code != null) {
          ObjectMapper objectMapper = new ObjectMapper();
          String errorContent = objectMapper.writeValueAsString(object);
          switch (code) {
            case 500:
              return response.serverError( errorContent);
            case 400:
              return response.clientError( errorContent);
            default:
              String error = (String) linkedHashMap.get("error");
              return response.error(code, error, errorContent);
          }
        }
      } 
      return response.success(object);
    } catch (JsonProcessingException e) {
    }
    return object;
  }
}