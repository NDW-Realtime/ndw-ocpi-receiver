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
import java.util.ArrayList;
import java.util.List;
import ocpi.model.EnergySource;
import ocpi.model.EnvironmentalImpact;
/**
 * EnergyMix
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T14:42:19.145134152+02:00[Europe/Amsterdam]")
public class EnergyMix {
  @JsonProperty("is_green_energy")
  private Boolean isGreenEnergy = null;

  @JsonProperty("energy_sources")
  private List<EnergySource> energySources = null;

  @JsonProperty("environ_impact")
  private List<EnvironmentalImpact> environImpact = null;

  @JsonProperty("supplier_name")
  private String supplierName = null;

  @JsonProperty("energy_product_name")
  private String energyProductName = null;

  public EnergyMix isGreenEnergy(Boolean isGreenEnergy) {
    this.isGreenEnergy = isGreenEnergy;
    return this;
  }

   /**
   * Get isGreenEnergy
   * @return isGreenEnergy
  **/
  @Schema(description = "")
  public Boolean isIsGreenEnergy() {
    return isGreenEnergy;
  }

  public void setIsGreenEnergy(Boolean isGreenEnergy) {
    this.isGreenEnergy = isGreenEnergy;
  }

  public EnergyMix energySources(List<EnergySource> energySources) {
    this.energySources = energySources;
    return this;
  }

  public EnergyMix addEnergySourcesItem(EnergySource energySourcesItem) {
    if (this.energySources == null) {
      this.energySources = new ArrayList<>();
    }
    this.energySources.add(energySourcesItem);
    return this;
  }

   /**
   * Get energySources
   * @return energySources
  **/
  @Schema(description = "")
  public List<EnergySource> getEnergySources() {
    return energySources;
  }

  public void setEnergySources(List<EnergySource> energySources) {
    this.energySources = energySources;
  }

  public EnergyMix environImpact(List<EnvironmentalImpact> environImpact) {
    this.environImpact = environImpact;
    return this;
  }

  public EnergyMix addEnvironImpactItem(EnvironmentalImpact environImpactItem) {
    if (this.environImpact == null) {
      this.environImpact = new ArrayList<>();
    }
    this.environImpact.add(environImpactItem);
    return this;
  }

   /**
   * Get environImpact
   * @return environImpact
  **/
  @Schema(description = "")
  public List<EnvironmentalImpact> getEnvironImpact() {
    return environImpact;
  }

  public void setEnvironImpact(List<EnvironmentalImpact> environImpact) {
    this.environImpact = environImpact;
  }

  public EnergyMix supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

   /**
   * Get supplierName
   * @return supplierName
  **/
  @Schema(description = "")
  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  public EnergyMix energyProductName(String energyProductName) {
    this.energyProductName = energyProductName;
    return this;
  }

   /**
   * Get energyProductName
   * @return energyProductName
  **/
  @Schema(description = "")
  public String getEnergyProductName() {
    return energyProductName;
  }

  public void setEnergyProductName(String energyProductName) {
    this.energyProductName = energyProductName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyMix energyMix = (EnergyMix) o;
    return Objects.equals(this.isGreenEnergy, energyMix.isGreenEnergy) &&
        Objects.equals(this.energySources, energyMix.energySources) &&
        Objects.equals(this.environImpact, energyMix.environImpact) &&
        Objects.equals(this.supplierName, energyMix.supplierName) &&
        Objects.equals(this.energyProductName, energyMix.energyProductName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGreenEnergy, energySources, environImpact, supplierName, energyProductName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyMix {\n");
    
    sb.append("    isGreenEnergy: ").append(toIndentedString(isGreenEnergy)).append("\n");
    sb.append("    energySources: ").append(toIndentedString(energySources)).append("\n");
    sb.append("    environImpact: ").append(toIndentedString(environImpact)).append("\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    energyProductName: ").append(toIndentedString(energyProductName)).append("\n");
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