package priv.zhangyueqingyun.usercenter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.base.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ZResponse response;

  @PostMapping(path="/add")
  public Object addNewUser (
    @RequestParam("username") String username,
    @RequestParam("nickname") String nickname,
    @RequestParam("avatar") String avatar
  ) {
    User user = new User();
    user.setUsername(username);
    user.setNickname(nickname);
    user.setAvatar(avatar);
    userRepository.save(user);
    return response.addSuccess("用户", user);
  }

  @GetMapping(path="/all")
  public Iterable<User> getAllUser() {
      return userRepository.findAll();
  }
}