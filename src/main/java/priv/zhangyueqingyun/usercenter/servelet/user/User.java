package priv.zhangyueqingyun.usercenter.servelet.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import priv.zhangyueqingyun.usercenter.servelet.systemuser.SystemUser;

import java.util.Date;

@Getter
@Setter
@Entity 
@Table(name = "user") 
public class User extends SystemUser {
  private String realname;
  private String email;

  @Column(name = "email_verified")
  private Boolean emailVerified;
  
  @Column(name = "phone_number")
  private String phoneNumber;
  
  @Column(name = "phone_number_verified")
  private Boolean phoneNumberVerified;

  private String qq;
  private String wechat;
  private String gender;
  private Date birthdate;
  private String address;
  private String unionid;
  private String openid;
  private String oauth;
  private String company;
  private String profile;
  private String website;

  @Column(name = "zone_info")
  private String zoneInfo;
  private String local;

  @Column(name = "street_address")
  private String streetAddress;

  private String locality;
  private String region;

  @Column(name = "postal_code")
  private String postalCode;

  private String city;
  private String province;
  private String country;
}