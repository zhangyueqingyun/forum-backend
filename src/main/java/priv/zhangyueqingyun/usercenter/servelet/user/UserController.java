package priv.zhangyueqingyun.usercenter.servelet.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ZResponse response;

  @PostMapping
  public Object postUser (User user) {
    user.setUuid(UUID.randomUUID().toString());
    userRepository.save(user);
    return response.postSuccess("用户");
  }

  @PutMapping
  public Object putUser (User user) {
    userRepository.save(user);
    return response.putSuccess("用户");
  }

  @DeleteMapping
  public Object deleteUser (User user) {
    userRepository.delete(user);;
    return response.deleteSuccess("用户");
  }

  @GetMapping(path="/all")
  public Iterable<User> getAllUser() {
      return userRepository.findAll();
  }

  @GetMapping(path="/{uuid}")
  public Object getUserById (User user) {
    User resultUser = userRepository.findByUuid(user.getUuid());
    return response.findOne(resultUser);
  }
}