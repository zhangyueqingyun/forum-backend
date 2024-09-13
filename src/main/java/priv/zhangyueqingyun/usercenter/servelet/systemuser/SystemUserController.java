package priv.zhangyueqingyun.usercenter.servelet.systemuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
@RequestMapping(path="/system-user")
public class SystemUserController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private SystemUserRepository systemUserRepository;

  @PostMapping(path="/add")
  public ZResponse addSystemUser (SystemUser systemUser) {
    systemUser.setUuid(UUID.randomUUID().toString());
    systemUserRepository.save(systemUser);
    return response.addSuccess("系统用户", systemUser);
  }

  @GetMapping(path="/all")
  public Iterable<SystemUser> getAllSystemUser() {
      return systemUserRepository.findAll();
  }
}
