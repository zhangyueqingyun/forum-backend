package priv.zhangyueqingyun.usercenter.servelet.systemuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // This means that this class is a Controller
@RequestMapping(path="/system-user") // This means URL's start with /demo (after Application path)
public class SystemUserController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private SystemUserRepository systemUserRepository;

  @PostMapping(path="/add")
  public ZResponse addNewUser (
    @RequestParam("username") String username,
    @RequestParam("nickname") String nickname,
    @RequestParam("avatar") String avatar
  ) {
    SystemUser systemUser = new SystemUser();
    systemUser.setUsername(username);
    systemUser.setNickname(nickname);
    systemUser.setAvatar(avatar);
    systemUserRepository.save(systemUser);
    return response.addSuccess("系统用户", systemUser);
  }

  @GetMapping(path="/all")
  public Iterable<SystemUser> getAllUser() {
      return systemUserRepository.findAll();
  }
}
