package priv.zhangyueqingyun.usercenter.servelet.systemuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
@RequestMapping(path="/system-user")
public class SystemUserController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private SystemUserRepository systemUserRepository;

  @PostMapping
  public Object postUser (SystemUser user) {
    user.setUuid(UUID.randomUUID().toString());
    systemUserRepository.save(user);
    return response.postSuccess("系统用户");
  }

  @PutMapping
  public Object putUser (SystemUser user) {
    systemUserRepository.save(user);
    return response.putSuccess("系统用户");
  }

  @DeleteMapping
  public Object deleteUser (SystemUser user) {
    systemUserRepository.delete(user);;
    return response.deleteSuccess("系统用户");
  }

  @GetMapping(path="/all")
  public Iterable<SystemUser> getAllSystemUser() {
      return systemUserRepository.findAll();
  }

  @GetMapping(path="/{uuid}")
  public Object getUserById (SystemUser user) {
    SystemUser resultUser = systemUserRepository.findByUuid(user.getUuid());
    return response.findOne(resultUser);
  }
}
