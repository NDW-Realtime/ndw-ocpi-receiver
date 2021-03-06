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
 * OcpiImage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T14:42:19.145134152+02:00[Europe/Amsterdam]")
public class OcpiImage {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    CHARGER("CHARGER"),
    ENTRANCE("ENTRANCE"),
    LOCATION("LOCATION"),
    NETWORK("NETWORK"),
    OPERATOR("OPERATOR"),
    EVSES("EVSEs"),
    OTHER("OTHER"),
    OWNER("OWNER");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("category")
  private CategoryEnum category = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  public OcpiImage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OcpiImage thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @Schema(description = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public OcpiImage category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(required = true, description = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public OcpiImage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OcpiImage width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OcpiImage height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcpiImage ocpiImage = (OcpiImage) o;
    return Objects.equals(this.url, ocpiImage.url) &&
        Objects.equals(this.thumbnail, ocpiImage.thumbnail) &&
        Objects.equals(this.category, ocpiImage.category) &&
        Objects.equals(this.type, ocpiImage.type) &&
        Objects.equals(this.width, ocpiImage.width) &&
        Objects.equals(this.height, ocpiImage.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, thumbnail, category, type, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcpiImage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
