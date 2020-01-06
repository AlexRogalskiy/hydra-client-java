/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.40
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The userinfo response
 */
@ApiModel(description = "The userinfo response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T20:37:25.079908Z[GMT]")
public class UserinfoResponse {
  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private String birthdate;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EMAIL_VERIFIED = "email_verified";
  @SerializedName(SERIALIZED_NAME_EMAIL_VERIFIED)
  private Boolean emailVerified;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_VERIFIED = "phone_number_verified";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_VERIFIED)
  private Boolean phoneNumberVerified;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_PREFERRED_USERNAME = "preferred_username";
  @SerializedName(SERIALIZED_NAME_PREFERRED_USERNAME)
  private String preferredUsername;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_SUB = "sub";
  @SerializedName(SERIALIZED_NAME_SUB)
  private String sub;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Long updatedAt;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_ZONEINFO = "zoneinfo";
  @SerializedName(SERIALIZED_NAME_ZONEINFO)
  private String zoneinfo;


  public UserinfoResponse birthdate(String birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

   /**
   * End-User&#39;s birthday, represented as an ISO 8601:2004 [ISO8601‑2004] YYYY-MM-DD format. The year MAY be 0000, indicating that it is omitted. To represent only the year, YYYY format is allowed. Note that depending on the underlying platform&#39;s date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.
   * @return birthdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's birthday, represented as an ISO 8601:2004 [ISO8601‑2004] YYYY-MM-DD format. The year MAY be 0000, indicating that it is omitted. To represent only the year, YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.")

  public String getBirthdate() {
    return birthdate;
  }


  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }


  public UserinfoResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * End-User&#39;s preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322] addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322] addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserinfoResponse emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * True if the End-User&#39;s e-mail address has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this e-mail address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.
   * @return emailVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the End-User's e-mail address has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this e-mail address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.")

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public UserinfoResponse familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public UserinfoResponse gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * End-User&#39;s gender. Values defined by this specification are female and male. Other values MAY be used when neither of the defined values are applicable.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's gender. Values defined by this specification are female and male. Other values MAY be used when neither of the defined values are applicable.")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public UserinfoResponse givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Given name(s) or first name(s) of the End-User. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Given name(s) or first name(s) of the End-User. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public UserinfoResponse locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * End-User&#39;s locale, represented as a BCP47 [RFC5646] language tag. This is typically an ISO 639-1 Alpha-2 [ISO639‑1] language code in lowercase and an ISO 3166-1 Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash. For example, en-US or fr-CA. As a compatibility note, some implementations have used an underscore as the separator rather than a dash, for example, en_US; Relying Parties MAY choose to accept this locale syntax as well.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's locale, represented as a BCP47 [RFC5646] language tag. This is typically an ISO 639-1 Alpha-2 [ISO639‑1] language code in lowercase and an ISO 3166-1 Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash. For example, en-US or fr-CA. As a compatibility note, some implementations have used an underscore as the separator rather than a dash, for example, en_US; Relying Parties MAY choose to accept this locale syntax as well.")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public UserinfoResponse middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name(s) of the End-User. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Middle name(s) of the End-User. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public UserinfoResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * End-User&#39;s full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User&#39;s locale and preferences.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserinfoResponse nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Casual name of the End-User that may or may not be the same as the given_name. For instance, a nickname value of Mike might be returned alongside a given_name value of Michael.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Casual name of the End-User that may or may not be the same as the given_name. For instance, a nickname value of Mike might be returned alongside a given_name value of Michael.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public UserinfoResponse phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * End-User&#39;s preferred telephone number. E.164 [E.164] is RECOMMENDED as the format of this Claim, for example, +1 (425) 555-1212 or +56 (2) 687 2400. If the phone number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext&#x3D;5678.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End-User's preferred telephone number. E.164 [E.164] is RECOMMENDED as the format of this Claim, for example, +1 (425) 555-1212 or +56 (2) 687 2400. If the phone number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UserinfoResponse phoneNumberVerified(Boolean phoneNumberVerified) {
    
    this.phoneNumberVerified = phoneNumberVerified;
    return this;
  }

   /**
   * True if the End-User&#39;s phone number has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this phone number was controlled by the End-User at the time the verification was performed. The means by which a phone number is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating. When true, the phone_number Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format.
   * @return phoneNumberVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the End-User's phone number has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this phone number was controlled by the End-User at the time the verification was performed. The means by which a phone number is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating. When true, the phone_number Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format.")

  public Boolean getPhoneNumberVerified() {
    return phoneNumberVerified;
  }


  public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
  }


  public UserinfoResponse picture(String picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * URL of the End-User&#39;s profile picture. This URL MUST refer to an image file (for example, a PNG, JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the End-User, rather than an arbitrary photo taken by the End-User.
   * @return picture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the End-User's profile picture. This URL MUST refer to an image file (for example, a PNG, JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the End-User, rather than an arbitrary photo taken by the End-User.")

  public String getPicture() {
    return picture;
  }


  public void setPicture(String picture) {
    this.picture = picture;
  }


  public UserinfoResponse preferredUsername(String preferredUsername) {
    
    this.preferredUsername = preferredUsername;
    return this;
  }

   /**
   * Non-unique shorthand name by which the End-User wishes to be referred to at the RP, such as janedoe or j.doe. This value MAY be any valid JSON string including special characters such as @, /, or whitespace.
   * @return preferredUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Non-unique shorthand name by which the End-User wishes to be referred to at the RP, such as janedoe or j.doe. This value MAY be any valid JSON string including special characters such as @, /, or whitespace.")

  public String getPreferredUsername() {
    return preferredUsername;
  }


  public void setPreferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
  }


  public UserinfoResponse profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * URL of the End-User&#39;s profile page. The contents of this Web page SHOULD be about the End-User.
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the End-User's profile page. The contents of this Web page SHOULD be about the End-User.")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public UserinfoResponse sub(String sub) {
    
    this.sub = sub;
    return this;
  }

   /**
   * Subject - Identifier for the End-User at the IssuerURL.
   * @return sub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject - Identifier for the End-User at the IssuerURL.")

  public String getSub() {
    return sub;
  }


  public void setSub(String sub) {
    this.sub = sub;
  }


  public UserinfoResponse updatedAt(Long updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time the End-User&#39;s information was last updated. Its value is a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the End-User's information was last updated. Its value is a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time.")

  public Long getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UserinfoResponse website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * URL of the End-User&#39;s Web page or blog. This Web page SHOULD contain information published by the End-User or an organization that the End-User is affiliated with.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the End-User's Web page or blog. This Web page SHOULD contain information published by the End-User or an organization that the End-User is affiliated with.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public UserinfoResponse zoneinfo(String zoneinfo) {
    
    this.zoneinfo = zoneinfo;
    return this;
  }

   /**
   * String from zoneinfo [zoneinfo] time zone database representing the End-User&#39;s time zone. For example, Europe/Paris or America/Los_Angeles.
   * @return zoneinfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String from zoneinfo [zoneinfo] time zone database representing the End-User's time zone. For example, Europe/Paris or America/Los_Angeles.")

  public String getZoneinfo() {
    return zoneinfo;
  }


  public void setZoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserinfoResponse userinfoResponse = (UserinfoResponse) o;
    return Objects.equals(this.birthdate, userinfoResponse.birthdate) &&
        Objects.equals(this.email, userinfoResponse.email) &&
        Objects.equals(this.emailVerified, userinfoResponse.emailVerified) &&
        Objects.equals(this.familyName, userinfoResponse.familyName) &&
        Objects.equals(this.gender, userinfoResponse.gender) &&
        Objects.equals(this.givenName, userinfoResponse.givenName) &&
        Objects.equals(this.locale, userinfoResponse.locale) &&
        Objects.equals(this.middleName, userinfoResponse.middleName) &&
        Objects.equals(this.name, userinfoResponse.name) &&
        Objects.equals(this.nickname, userinfoResponse.nickname) &&
        Objects.equals(this.phoneNumber, userinfoResponse.phoneNumber) &&
        Objects.equals(this.phoneNumberVerified, userinfoResponse.phoneNumberVerified) &&
        Objects.equals(this.picture, userinfoResponse.picture) &&
        Objects.equals(this.preferredUsername, userinfoResponse.preferredUsername) &&
        Objects.equals(this.profile, userinfoResponse.profile) &&
        Objects.equals(this.sub, userinfoResponse.sub) &&
        Objects.equals(this.updatedAt, userinfoResponse.updatedAt) &&
        Objects.equals(this.website, userinfoResponse.website) &&
        Objects.equals(this.zoneinfo, userinfoResponse.zoneinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthdate, email, emailVerified, familyName, gender, givenName, locale, middleName, name, nickname, phoneNumber, phoneNumberVerified, picture, preferredUsername, profile, sub, updatedAt, website, zoneinfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserinfoResponse {\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerified: ").append(toIndentedString(phoneNumberVerified)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    zoneinfo: ").append(toIndentedString(zoneinfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

