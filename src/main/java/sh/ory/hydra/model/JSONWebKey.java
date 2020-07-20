/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.6.0
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
import java.util.ArrayList;
import java.util.List;

/**
 * It is important that this model object is named JSONWebKey for \&quot;swagger generate spec\&quot; to generate only on definition of a JSONWebKey.
 */
@ApiModel(description = "It is important that this model object is named JSONWebKey for \"swagger generate spec\" to generate only on definition of a JSONWebKey.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-20T12:53:21.603130Z[GMT]")
public class JSONWebKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_D = "d";
  @SerializedName(SERIALIZED_NAME_D)
  private String d;

  public static final String SERIALIZED_NAME_DP = "dp";
  @SerializedName(SERIALIZED_NAME_DP)
  private String dp;

  public static final String SERIALIZED_NAME_DQ = "dq";
  @SerializedName(SERIALIZED_NAME_DQ)
  private String dq;

  public static final String SERIALIZED_NAME_E = "e";
  @SerializedName(SERIALIZED_NAME_E)
  private String e;

  public static final String SERIALIZED_NAME_K = "k";
  @SerializedName(SERIALIZED_NAME_K)
  private String k;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private String n;

  public static final String SERIALIZED_NAME_P = "p";
  @SerializedName(SERIALIZED_NAME_P)
  private String p;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private String q;

  public static final String SERIALIZED_NAME_QI = "qi";
  @SerializedName(SERIALIZED_NAME_QI)
  private String qi;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private String x;

  public static final String SERIALIZED_NAME_X5C = "x5c";
  @SerializedName(SERIALIZED_NAME_X5C)
  private List<String> x5c = null;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private String y;


  public JSONWebKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * The \&quot;alg\&quot; (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \&quot;JSON Web Signature and Encryption Algorithms\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.
   * @return alg
  **/
  @ApiModelProperty(example = "RS256", required = true, value = "The \"alg\" (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \"JSON Web Signature and Encryption Algorithms\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JSONWebKey crv(String crv) {
    
    this.crv = crv;
    return this;
  }

   /**
   * Get crv
   * @return crv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P-256", value = "")

  public String getCrv() {
    return crv;
  }


  public void setCrv(String crv) {
    this.crv = crv;
  }


  public JSONWebKey d(String d) {
    
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T_N8I-6He3M8a7X1vWt6TGIx4xB_GP3Mb4SsZSA4v-orvJzzRiQhLlRR81naWYxfQAYt5isDI6_C2L9bdWo4FFPjGQFvNoRX-_sBJyBI_rl-TBgsZYoUlAj3J92WmY2inbA-PwyJfsaIIDceYBC-eX-xiCu6qMqkZi3MwQAFL6bMdPEM0z4JBcwFT3VdiWAIRUuACWQwrXMq672x7fMuaIaHi7XDGgt1ith23CLfaREmJku9PQcchbt_uEY-hqrFY6ntTtS4paWWQj86xLL94S-Tf6v6xkL918PfLSOTq6XCzxvlFwzBJqApnAhbwqLjpPhgUG04EDRrqrSBc5Y1BLevn6Ip5h1AhessBp3wLkQgz_roeckt-ybvzKTjESMuagnpqLvOT7Y9veIug2MwPJZI2VjczRc1vzMs25XrFQ8DpUy-bNdp89TmvAXwctUMiJdgHloJw23Cv03gIUAkDnsTqZmkpbIf-crpgNKFmQP_EDKoe8p_PXZZgfbRri3NoEVGP7Mk6yEu8LjJhClhZaBNjuWw2-KlBfOA3g79mhfBnkInee5KO9mGR50qPk1V-MorUYNTFMZIm0kFE6eYVWFBwJHLKYhHU34DoiK1VP-svZpC2uAMFNA_UJEwM9CQ2b8qe4-5e9aywMvwcuArRkAB5mBIfOaOJao3mfukKAE", value = "")

  public String getD() {
    return d;
  }


  public void setD(String d) {
    this.d = d;
  }


  public JSONWebKey dp(String dp) {
    
    this.dp = dp;
    return this;
  }

   /**
   * Get dp
   * @return dp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "G4sPXkc6Ya9y8oJW9_ILj4xuppu0lzi_H7VTkS8xj5SdX3coE0oimYwxIi2emTAue0UOa5dpgFGyBJ4c8tQ2VF402XRugKDTP8akYhFo5tAA77Qe_NmtuYZc3C3m3I24G2GvR5sSDxUyAN2zq8Lfn9EUms6rY3Ob8YeiKkTiBj0", value = "")

  public String getDp() {
    return dp;
  }


  public void setDp(String dp) {
    this.dp = dp;
  }


  public JSONWebKey dq(String dq) {
    
    this.dq = dq;
    return this;
  }

   /**
   * Get dq
   * @return dq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s9lAH9fggBsoFR8Oac2R_E2gw282rT2kGOAhvIllETE1efrA6huUUvMfBcMpn8lqeW6vzznYY5SSQF7pMdC_agI3nG8Ibp1BUb0JUiraRNqUfLhcQb_d9GF4Dh7e74WbRsobRonujTYN1xCaP6TO61jvWrX-L18txXw494Q_cgk", value = "")

  public String getDq() {
    return dq;
  }


  public void setDq(String dq) {
    this.dq = dq;
  }


  public JSONWebKey e(String e) {
    
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AQAB", value = "")

  public String getE() {
    return e;
  }


  public void setE(String e) {
    this.e = e;
  }


  public JSONWebKey k(String k) {
    
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GawgguFyGrWKav7AX4VKUg", value = "")

  public String getK() {
    return k;
  }


  public void setK(String k) {
    this.k = k;
  }


  public JSONWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;kid\&quot; (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \&quot;kid\&quot; value is unspecified.  When \&quot;kid\&quot; values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \&quot;kid\&quot; values.  (One example in which different keys might use the same \&quot;kid\&quot; value is if they have different \&quot;kty\&quot; (key type) values but are considered to be equivalent alternatives by the application using them.)  The \&quot;kid\&quot; value is a case-sensitive string.
   * @return kid
  **/
  @ApiModelProperty(example = "1603dfe0af8f4596", required = true, value = "The \"kid\" (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \"kid\" value is unspecified.  When \"kid\" values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \"kid\" values.  (One example in which different keys might use the same \"kid\" value is if they have different \"kty\" (key type) values but are considered to be equivalent alternatives by the application using them.)  The \"kid\" value is a case-sensitive string.")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public JSONWebKey kty(String kty) {
    
    this.kty = kty;
    return this;
  }

   /**
   * The \&quot;kty\&quot; (key type) parameter identifies the cryptographic algorithm family used with the key, such as \&quot;RSA\&quot; or \&quot;EC\&quot;. \&quot;kty\&quot; values should either be registered in the IANA \&quot;JSON Web Key Types\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \&quot;kty\&quot; value is a case-sensitive string.
   * @return kty
  **/
  @ApiModelProperty(example = "RSA", required = true, value = "The \"kty\" (key type) parameter identifies the cryptographic algorithm family used with the key, such as \"RSA\" or \"EC\". \"kty\" values should either be registered in the IANA \"JSON Web Key Types\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \"kty\" value is a case-sensitive string.")

  public String getKty() {
    return kty;
  }


  public void setKty(String kty) {
    this.kty = kty;
  }


  public JSONWebKey n(String n) {
    
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vTqrxUyQPl_20aqf5kXHwDZrel-KovIp8s7ewJod2EXHl8tWlRB3_Rem34KwBfqlKQGp1nqah-51H4Jzruqe0cFP58hPEIt6WqrvnmJCXxnNuIB53iX_uUUXXHDHBeaPCSRoNJzNysjoJ30TIUsKBiirhBa7f235PXbKiHducLevV6PcKxJ5cY8zO286qJLBWSPm-OIevwqsIsSIH44Qtm9sioFikhkbLwoqwWORGAY0nl6XvVOlhADdLjBSqSAeT1FPuCDCnXwzCDR8N9IFB_IjdStFkC-rVt2K5BYfPd0c3yFp_vHR15eRd0zJ8XQ7woBC8Vnsac6Et1pKS59pX6256DPWu8UDdEOolKAPgcd_g2NpA76cAaF_jcT80j9KrEzw8Tv0nJBGesuCjPNjGs_KzdkWTUXt23Hn9QJsdc1MZuaW0iqXBepHYfYoqNelzVte117t4BwVp0kUM6we0IqyXClaZgOI8S-WDBw2_Ovdm8e5NmhYAblEVoygcX8Y46oH6bKiaCQfKCFDMcRgChme7AoE1yZZYsPbaG_3IjPrC4LBMHQw8rM9dWjJ8ImjicvZ1pAm0dx-KHCP3y5PVKrxBDf1zSOsBRkOSjB8TPODnJMz6-jd5hTtZxpZPwPoIdCanTZ3ZD6uRBpTmDwtpRGm63UQs1m5FWPwb0T2IF0", value = "")

  public String getN() {
    return n;
  }


  public void setN(String n) {
    this.n = n;
  }


  public JSONWebKey p(String p) {
    
    this.p = p;
    return this;
  }

   /**
   * Get p
   * @return p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6NbkXwDWUhi-eR55Cgbf27FkQDDWIamOaDr0rj1q0f1fFEz1W5A_09YvG09Fiv1AO2-D8Rl8gS1Vkz2i0zCSqnyy8A025XOcRviOMK7nIxE4OH_PEsko8dtIrb3TmE2hUXvCkmzw9EsTF1LQBOGC6iusLTXepIC1x9ukCKFZQvdgtEObQ5kzd9Nhq-cdqmSeMVLoxPLd1blviVT9Vm8-y12CtYpeJHOaIDtVPLlBhJiBoPKWg3vxSm4XxIliNOefqegIlsmTIa3MpS6WWlCK3yHhat0Q-rRxDxdyiVdG_wzJvp0Iw_2wms7pe-PgNPYvUWH9JphWP5K38YqEBiJFXQ", value = "")

  public String getP() {
    return p;
  }


  public void setP(String p) {
    this.p = p;
  }


  public JSONWebKey q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * Get q
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0A1FmpOWR91_RAWpqreWSavNaZb9nXeKiBo0DQGBz32DbqKqQ8S4aBJmbRhJcctjCLjain-ivut477tAUMmzJwVJDDq2MZFwC9Q-4VYZmFU4HJityQuSzHYe64RjN-E_NQ02TWhG3QGW6roq6c57c99rrUsETwJJiwS8M5p15Miuz53DaOjv-uqqFAFfywN5WkxHbraBcjHtMiQuyQbQqkCFh-oanHkwYNeytsNhTu2mQmwR5DR2roZ2nPiFjC6nsdk-A7E3S3wMzYYFw7jvbWWoYWo9vB40_MY2Y0FYQSqcDzcBIcq_0tnnasf3VW4Fdx6m80RzOb2Fsnln7vKXAQ", value = "")

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public JSONWebKey qi(String qi) {
    
    this.qi = qi;
    return this;
  }

   /**
   * Get qi
   * @return qi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GyM_p6JrXySiz1toFgKbWV-JdI3jQ4ypu9rbMWx3rQJBfmt0FoYzgUIZEVFEcOqwemRN81zoDAaa-Bk0KWNGDjJHZDdDmFhW3AN7lI-puxk_mHZGJ11rxyR8O55XLSe3SPmRfKwZI6yU24ZxvQKFYItdldUKGzO6Ia6zTKhAVRU", value = "")

  public String getQi() {
    return qi;
  }


  public void setQi(String qi) {
    this.qi = qi;
  }


  public JSONWebKey use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * Use (\&quot;public key use\&quot;) identifies the intended use of the public key. The \&quot;use\&quot; parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \&quot;sig\&quot; (signature) or \&quot;enc\&quot; (encryption).
   * @return use
  **/
  @ApiModelProperty(example = "sig", required = true, value = "Use (\"public key use\") identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \"sig\" (signature) or \"enc\" (encryption).")

  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }


  public JSONWebKey x(String x) {
    
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f83OJ3D2xF1Bg8vub9tLe1gHMzV76e8Tus9uPHvRVEU", value = "")

  public String getX() {
    return x;
  }


  public void setX(String x) {
    this.x = x;
  }


  public JSONWebKey x5c(List<String> x5c) {
    
    this.x5c = x5c;
    return this;
  }

  public JSONWebKey addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<String>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

   /**
   * The \&quot;x5c\&quot; (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.
   * @return x5c
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"x5c\" (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.")

  public List<String> getX5c() {
    return x5c;
  }


  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }


  public JSONWebKey y(String y) {
    
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "x_FEzRu9m36HLN_tue659LNpXW6pCyStikYjKIWI5a0", value = "")

  public String getY() {
    return y;
  }


  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONWebKey jsONWebKey = (JSONWebKey) o;
    return Objects.equals(this.alg, jsONWebKey.alg) &&
        Objects.equals(this.crv, jsONWebKey.crv) &&
        Objects.equals(this.d, jsONWebKey.d) &&
        Objects.equals(this.dp, jsONWebKey.dp) &&
        Objects.equals(this.dq, jsONWebKey.dq) &&
        Objects.equals(this.e, jsONWebKey.e) &&
        Objects.equals(this.k, jsONWebKey.k) &&
        Objects.equals(this.kid, jsONWebKey.kid) &&
        Objects.equals(this.kty, jsONWebKey.kty) &&
        Objects.equals(this.n, jsONWebKey.n) &&
        Objects.equals(this.p, jsONWebKey.p) &&
        Objects.equals(this.q, jsONWebKey.q) &&
        Objects.equals(this.qi, jsONWebKey.qi) &&
        Objects.equals(this.use, jsONWebKey.use) &&
        Objects.equals(this.x, jsONWebKey.x) &&
        Objects.equals(this.x5c, jsONWebKey.x5c) &&
        Objects.equals(this.y, jsONWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, crv, d, dp, dq, e, k, kid, kty, n, p, q, qi, use, x, x5c, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONWebKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

