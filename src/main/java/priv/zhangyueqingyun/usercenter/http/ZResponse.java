package priv.zhangyueqingyun.usercenter.http;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class ZResponse {
  private Integer code = 0;
  private String message = "请求成功";
  private Object data = new Object();
  private Boolean success = true;

  public ZResponse success(Object data) {
    success = true;
    code = 0;
    message = "请求成功";
    this.data = data;
    return this;
  }

  public ZResponse success(String message, Object data) {
    success = true;
    code = 0;
    this.message = message;
    this.data = data;
    return this;
  }

  public ZResponse success() {
    success = true;
    code = 0;
    message = "请求成功";
    this.data = null;
    return this;
  }

  public ZResponse findOne(Object data) {
    if(data == null) {
      success = true;
      code = 0;
      message = "未找到数据";
      this.data = data;
      return this;
    } else {
      success = true;
      code = 0;
      message = "请求成功";
      this.data = data;
      return this;
    }
  }

  public ZResponse findOne(String message, Object data) {
    if(data == null) {
      success = true;
      code = 1;
      this.message = message;
      this.data = data;
      return this;
    } else {
      success = true;
      code = 0;
      this.message = "请求成功";
      this.data = data;
      return this;
    }
  }

  public ZResponse postSuccess(String name) {
    success = true;
    code = 0;
    message = "添加" + name + "成功！";
    this.data = null;
    return this;
  }

  public ZResponse postSuccess(Object data) {
    success = true;
    code = 0;
    message = "新增成功！";
    this.data = data;
    return this;
  }

  public ZResponse postSuccess(String name, Object data) {
    success = true;
    code = 0;
    message = "添加" + name + "成功！";
    this.data = data;
    return this;
  }

  public ZResponse putSuccess(Object data) {
    success = true;
    code = 0;
    message = "修改成功！";
    this.data = data;
    return this;
  }

  public ZResponse putSuccess(String name, Object data) {
    success = true;
    code = 0;
    message = "修改" + name + "成功！";
    this.data = data;
    return this;
  }

  public ZResponse putSuccess(String name) {
    success = true;
    code = 0;
    message = "修改" + name + "成功！";
    this.data = null;
    return this;
  }

  public ZResponse deleteSuccess(String name) {
    success = true;
    code = 0;
    message = "删除" + name + "成功！";
    this.data = null;
    return this;
  }

  public ZResponse error() {
    success = false;
    this.code = 1;
    this.message = "服务错误，请联系开发人员。";
    this.data = null;
    return this;
  }

  public ZResponse error(Integer code) {
    success = false;
    this.code = code;
    this.message =  "服务错误，请联系开发人员。";
    this.data = null;
    return this;
  }

  public ZResponse error(Integer code, String message) {
    success = false;
    this.code = code;
    this.message = message;
    this.data = null;
    return this;
  }
  
  public ZResponse error(Integer code, String message, Object data) {
    success = false;
    this.code = code;
    this.message = message;
    this.data = data;
    return this;
  }
    
  public ZResponse error(Object data) {
    success = false;
    this.code = 1;
    this.message =  "服务错误，请联系开发人员。";
    this.data = data;
    return this;
  }

  public ZResponse serverError(Object data) {
    success = false;
    code = 50000;
    message = "服务器错误";
    this.data = data;
    return this;
  }

  public ZResponse clientError(Object data) {
    success = false;
    code = 40000;
    message = "客户端错误";
    this.data = data;
    return this;
  }

  public ZResponse() {
    this.success();
  }
}

