package priv.zhangyueqingyun.usercenter.orgnizationmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.base.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path="/orgnization-member") // This means URL's start with /demo (after Application path)
public class OrgnizationMemberController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private OrgnizationMemberRepository orgnizationMemberRepository;

  @PostMapping(path="/add")
  public ZResponse addNewUser (
    @RequestParam("username") String username,
    @RequestParam("nickname") String nickname,
    @RequestParam("avatar") String avatar
  ) {
    OrgnizationMember orgnizationMember = new OrgnizationMember();
    orgnizationMember.setUsername(username);
    orgnizationMember.setNickname(nickname);
    orgnizationMember.setAvatar(avatar);
    orgnizationMemberRepository.save(orgnizationMember);
    return response.addSuccess("组织成员", orgnizationMember);
  }

  @GetMapping(path="/all")
  public Iterable<OrgnizationMember> getAllUser() {
      return orgnizationMemberRepository.findAll();
  }
}