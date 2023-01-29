/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.3.0
 * Contact: info@testsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.practicesoftwaretesting.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ProductRequest
 */

@javax.annotation.Generated(value = "com.practicesoftwaretesting.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-29T11:45:28.552Z[GMT]")
public class ProductRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("category_id")
  private Integer categoryId = null;

  @SerializedName("brand_id")
  private Integer brandId = null;

  @SerializedName("product_image_id")
  private Integer productImageId = null;

  @SerializedName("is_location_offer")
  private Boolean isLocationOffer = null;

  @SerializedName("is_rental")
  private Boolean isRental = null;

  public ProductRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRequest price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(example = "1.99", description = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ProductRequest categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @Schema(example = "1", description = "")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public ProductRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @Schema(example = "1", description = "")
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public ProductRequest productImageId(Integer productImageId) {
    this.productImageId = productImageId;
    return this;
  }

   /**
   * Get productImageId
   * @return productImageId
  **/
  @Schema(example = "1", description = "")
  public Integer getProductImageId() {
    return productImageId;
  }

  public void setProductImageId(Integer productImageId) {
    this.productImageId = productImageId;
  }

  public ProductRequest isLocationOffer(Boolean isLocationOffer) {
    this.isLocationOffer = isLocationOffer;
    return this;
  }

   /**
   * Get isLocationOffer
   * @return isLocationOffer
  **/
  @Schema(example = "false", description = "")
  public Boolean isIsLocationOffer() {
    return isLocationOffer;
  }

  public void setIsLocationOffer(Boolean isLocationOffer) {
    this.isLocationOffer = isLocationOffer;
  }

  public ProductRequest isRental(Boolean isRental) {
    this.isRental = isRental;
    return this;
  }

   /**
   * Get isRental
   * @return isRental
  **/
  @Schema(example = "false", description = "")
  public Boolean isIsRental() {
    return isRental;
  }

  public void setIsRental(Boolean isRental) {
    this.isRental = isRental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequest productRequest = (ProductRequest) o;
    return Objects.equals(this.name, productRequest.name) &&
        Objects.equals(this.description, productRequest.description) &&
        Objects.equals(this.price, productRequest.price) &&
        Objects.equals(this.categoryId, productRequest.categoryId) &&
        Objects.equals(this.brandId, productRequest.brandId) &&
        Objects.equals(this.productImageId, productRequest.productImageId) &&
        Objects.equals(this.isLocationOffer, productRequest.isLocationOffer) &&
        Objects.equals(this.isRental, productRequest.isRental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, price, categoryId, brandId, productImageId, isLocationOffer, isRental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    productImageId: ").append(toIndentedString(productImageId)).append("\n");
    sb.append("    isLocationOffer: ").append(toIndentedString(isLocationOffer)).append("\n");
    sb.append("    isRental: ").append(toIndentedString(isRental)).append("\n");
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
