package priv.zhangyueqingyun.usercenter.orgnizationmember;

import priv.zhangyueqingyun.usercenter.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name = "user")
public class OrgnizationMember extends User {
  private String orgnizationId;
  private String orgnizationName;
  private String jobNumber;
  private String departmentId;
  private String departmentName;
  private String role;
  
  
  public String getOrgnizationId() {
    return orgnizationId;
  }

  public void setOrgnizationId(String orgnizationId) {
    this.orgnizationId = orgnizationId;
  }

  public String getOrgnizationName() {
    return orgnizationName;
  }

  public void setOrgnizationName(String orgnizationName) {
    this.orgnizationName = orgnizationName;
  }

  public String getJobNumber() {
    return jobNumber;
  }

  public void setJobNumber(String jobNumber) {
    this.jobNumber = jobNumber;
  }

  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
