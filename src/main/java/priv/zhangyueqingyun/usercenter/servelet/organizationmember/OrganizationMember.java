package priv.zhangyueqingyun.usercenter.servelet.organizationmember;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import priv.zhangyueqingyun.usercenter.servelet.user.User;

@Getter
@Setter
@Entity 
@Table(name = "user")
public class OrganizationMember extends User {
  @Column(name = "organization_id")
  private String organizationId;
  
  @Column(name = "organization_name")
  private String organizationName;

  @Column(name = "job_number")
  private String jobNumber;

  @Column(name = "department_id")
  private String departmentId;

  @Column(name = "department_name")
  private String departmentName;
}
