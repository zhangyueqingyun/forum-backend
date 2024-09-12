package priv.zhangyueqingyun.usercenter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewUser (
    @RequestParam String username,
    @RequestParam String nickname,
    @RequestParam String avatar
  ) {
    User user = new User();
    user.setUsername(username);
    user.setNickname(nickname);
    user.setAvatar(avatar);
    userRepository.save(user);
    return "保存成功！";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUser() {
      return userRepository.findAll();
  }
}