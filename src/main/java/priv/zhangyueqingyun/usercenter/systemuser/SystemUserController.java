package priv.zhangyueqingyun.usercenter.systemuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/system-user") // This means URL's start with /demo (after Application path)
public class SystemUserController {
  @Autowired
  private SystemUserRepository systemUserRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewUser (
    @RequestParam String username,
    @RequestParam String nickname,
    @RequestParam String avatar
  ) {
    SystemUser systemUser = new SystemUser();
    systemUser.setUsername(username);
    systemUser.setNickname(nickname);
    systemUser.setAvatar(avatar);
    systemUserRepository.save(systemUser);
    return "保存成功！";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<SystemUser> getAllUser() {
      return systemUserRepository.findAll();
  }
}
