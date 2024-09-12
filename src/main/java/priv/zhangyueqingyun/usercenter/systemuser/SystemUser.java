package priv.zhangyueqingyun.usercenter.systemuser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.util.Date;

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

  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public Integer getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public Date getLastLogin() {
    return this.lastLogin;
  }

  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }

  public Boolean getSignedUp() {
    return this.signedUp;
  }

  public void setSignedUp(Boolean signedUp) {
    this.signedUp = signedUp;
  }

  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public String getLastIp() {
    return lastIp;
  }

  public void setLastIp(String lastIp) {
    this.lastIp = lastIp;
  }
  
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }
}