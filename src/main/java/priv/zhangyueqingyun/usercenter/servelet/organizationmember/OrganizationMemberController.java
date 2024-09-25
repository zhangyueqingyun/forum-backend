package priv.zhangyueqingyun.usercenter.servelet.organizationmember;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import priv.zhangyueqingyun.usercenter.http.ZResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/organization-member") // This means URL's start with /demo (after Application path)
public class OrganizationMemberController {  
  @Autowired
  private ZResponse response;

  @Autowired
  private OrganizationMemberRepository organizationMemberRepository;


  @PostMapping
  public Object postOrganizationMember (OrganizationMember user) {
    user.setUuid(UUID.randomUUID().toString());
    organizationMemberRepository.save(user);
    return response.postSuccess("用户");
  }

  @PutMapping
  public Object putOrganizationMember (OrganizationMember user) {
    organizationMemberRepository.save(user);
    return response.putSuccess("用户");
  }

  @DeleteMapping
  public Object deleteOrganizationMember (OrganizationMember user) {
    organizationMemberRepository.delete(user);;
    return response.deleteSuccess("用户");
  }

  @GetMapping(path="/all")
  public Iterable<OrganizationMember> getAllOrganizationMember() {
      return organizationMemberRepository.findAll();
  }

  @GetMapping(path="/{uuid}")
  public Object getUserById (OrganizationMember user) {
    OrganizationMember resultUser = organizationMemberRepository.findByUuid(user.getUuid());
    return response.findOne(resultUser);
  }
}