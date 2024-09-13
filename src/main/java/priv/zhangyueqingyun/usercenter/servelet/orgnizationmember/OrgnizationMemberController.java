package priv.zhangyueqingyun.usercenter.servelet.orgnizationmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/orgnization-member") // This means URL's start with /demo (after Application path)
public class OrgnizationMemberController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private OrgnizationMemberRepository orgnizationMemberRepository;

  @PostMapping(path="/add")
  public ZResponse addNewUser (
    OrgnizationMember orgnizationMember
  ) {
    orgnizationMemberRepository.save(orgnizationMember);
    return response.addSuccess("组织成员", orgnizationMember);
  }

  @GetMapping(path="/all")
  public Iterable<OrgnizationMember> getAllUser() {
      return orgnizationMemberRepository.findAll();
  }
}