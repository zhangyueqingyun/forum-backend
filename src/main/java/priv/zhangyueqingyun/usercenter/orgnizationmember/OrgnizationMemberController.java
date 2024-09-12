package priv.zhangyueqingyun.usercenter.orgnizationmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/orgnization-member") // This means URL's start with /demo (after Application path)
public class OrgnizationMemberController {
  @Autowired
  private OrgnizationMemberRepository orgnizationMemberRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewUser (
    @RequestParam String username,
    @RequestParam String nickname,
    @RequestParam String avatar
  ) {
    OrgnizationMember orgnizationMember = new OrgnizationMember();
    orgnizationMember.setUsername(username);
    orgnizationMember.setNickname(nickname);
    orgnizationMember.setAvatar(avatar);
    orgnizationMemberRepository.save(orgnizationMember);
    return "保存成功！";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<OrgnizationMember> getAllUser() {
      return orgnizationMemberRepository.findAll();
  }
}