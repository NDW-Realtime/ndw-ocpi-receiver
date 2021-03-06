/*
 * roaming-location-prd
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ocpi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnvironmentalImpact
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T14:42:19.145134152+02:00[Europe/Amsterdam]")
public class EnvironmentalImpact {
  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    NUCLEAR_WASTE("NUCLEAR_WASTE"),
    CARBON_DIOXIDE("CARBON_DIOXIDE");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("source")
  private SourceEnum source = null;

  @JsonProperty("amount")
  private Double amount = null;

  public EnvironmentalImpact source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public EnvironmentalImpact amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentalImpact environmentalImpact = (EnvironmentalImpact) o;
    return Objects.equals(this.source, environmentalImpact.source) &&
        Objects.equals(this.amount, environmentalImpact.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentalImpact {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
