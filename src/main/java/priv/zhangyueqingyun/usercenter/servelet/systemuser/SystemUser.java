package priv.zhangyueqingyun.usercenter.servelet.systemuser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity 
@Table(name = "user")
public class SystemUser {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  protected Integer id;
  
  @Column(name = "username")
  protected String username;

  @Column(name = "nickname")
  protected String nickname;
  protected String avatar;
  protected String status; 

  @Column(name = "create_at")
  protected Date createAt;
  
  @Column(name = "create_by")
  protected String createBy;
  
  @Column(name = "update_at")
  protected Date updateAt;
  
  @Column(name = "update_by")
  protected String updateBy;
  
  @Column(name = "login_count")
  protected Integer loginCount;
  
  @Column(name = "last_login")
  protected Date lastLogin;
  
  @Column(name = "signed_up")
  protected Boolean signedUp;

  protected Boolean blocked;
  
  @Column(name = "last_ip")
  protected String lastIp;
  
  protected String device;
  protected String browser;
}