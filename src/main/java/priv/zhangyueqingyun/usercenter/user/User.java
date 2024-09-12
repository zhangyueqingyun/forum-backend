package priv.zhangyueqingyun.usercenter.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.util.Date;

import priv.zhangyueqingyun.usercenter.systemuser.SystemUser;

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

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Boolean getPhoneNumberVerified() {
    return phoneNumberVerified;
  }

  public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getUnionid() {
    return unionid;
  }

  public void setUnionid(String unionid) {
    this.unionid = unionid;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getOauth() {
    return oauth;
  }

  public void setOauth(String oauth) {
    this.oauth = oauth;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
  
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }  

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }  

  public String getZoneInfo() {
    return zoneInfo;
  }

  public void setZoneInfo(String zoneInfo) {
    this.zoneInfo = zoneInfo;
  }  

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}