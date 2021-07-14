/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.3
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
 * RequestWasHandledResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T15:27:18.942684284Z[Etc/UTC]")
public class RequestWasHandledResponse {
  public static final String SERIALIZED_NAME_REDIRECT_TO = "redirect_to";
  @SerializedName(SERIALIZED_NAME_REDIRECT_TO)
  private String redirectTo;


  public RequestWasHandledResponse redirectTo(String redirectTo) {
    
    this.redirectTo = redirectTo;
    return this;
  }

   /**
   * Original request URL to which you should redirect the user if request was already handled.
   * @return redirectTo
  **/
  @ApiModelProperty(required = true, value = "Original request URL to which you should redirect the user if request was already handled.")

  public String getRedirectTo() {
    return redirectTo;
  }


  public void setRedirectTo(String redirectTo) {
    this.redirectTo = redirectTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestWasHandledResponse requestWasHandledResponse = (RequestWasHandledResponse) o;
    return Objects.equals(this.redirectTo, requestWasHandledResponse.redirectTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestWasHandledResponse {\n");
    sb.append("    redirectTo: ").append(toIndentedString(redirectTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

