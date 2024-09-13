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
  private Integer id;

  private String uuid;
  
  @Column(name = "username")
  private String username;

  @Column(name = "nickname")
  private String nickname;
  private String avatar;
  private String status; 

  @Column(name = "create_at")
  private Date createAt;
  
  @Column(name = "create_by")
  private String createBy;
  
  @Column(name = "update_at")
  private Date updateAt;
  
  @Column(name = "update_by")
  private String updateBy;
  
  @Column(name = "login_count")
  private Integer loginCount;
  
  @Column(name = "last_login")
  private Date lastLogin;
  
  @Column(name = "signed_up")
  private Boolean signedUp;

  private Boolean blocked;
  
  @Column(name = "last_ip")
  private String lastIp;
  
  private String device;
  private String browser;
}