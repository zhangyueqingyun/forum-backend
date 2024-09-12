package priv.zhangyueqingyun.usercenter.orgnizationmember;

import priv.zhangyueqingyun.usercenter.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
@Table(name = "user")
public class OrgnizationMember extends User {
  @Column(name = "orgnization_id")
  private String orgnizationId;
  
  @Column(name = "orgnization_name")
  private String orgnizationName;

  @Column(name = "job_number")
  private String jobNumber;

  @Column(name = "department_id")
  private String departmentId;

  @Column(name = "department_name")
  private String departmentName;
}
