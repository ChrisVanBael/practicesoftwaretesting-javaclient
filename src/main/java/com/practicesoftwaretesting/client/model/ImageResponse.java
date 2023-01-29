/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.1.0
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
import com.tesuqa.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ImageResponse
 */

@javax.annotation.Generated(value = "com.tesuqa.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-29T11:12:54.585Z[GMT]")
public class ImageResponse {
  @SerializedName("by_name")
  private String byName = null;

  @SerializedName("by_url")
  private String byUrl = null;

  @SerializedName("source_name")
  private String sourceName = null;

  @SerializedName("source_url")
  private String sourceUrl = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("id")
  private Integer id = null;

  public ImageResponse byName(String byName) {
    this.byName = byName;
    return this;
  }

   /**
   * Get byName
   * @return byName
  **/
  @Schema(description = "")
  public String getByName() {
    return byName;
  }

  public void setByName(String byName) {
    this.byName = byName;
  }

  public ImageResponse byUrl(String byUrl) {
    this.byUrl = byUrl;
    return this;
  }

   /**
   * Get byUrl
   * @return byUrl
  **/
  @Schema(description = "")
  public String getByUrl() {
    return byUrl;
  }

  public void setByUrl(String byUrl) {
    this.byUrl = byUrl;
  }

  public ImageResponse sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Get sourceName
   * @return sourceName
  **/
  @Schema(description = "")
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public ImageResponse sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @Schema(description = "")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public ImageResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ImageResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ImageResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(example = "2022-08-01 08:24:56", description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ImageResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageResponse imageResponse = (ImageResponse) o;
    return Objects.equals(this.byName, imageResponse.byName) &&
        Objects.equals(this.byUrl, imageResponse.byUrl) &&
        Objects.equals(this.sourceName, imageResponse.sourceName) &&
        Objects.equals(this.sourceUrl, imageResponse.sourceUrl) &&
        Objects.equals(this.fileName, imageResponse.fileName) &&
        Objects.equals(this.title, imageResponse.title) &&
        Objects.equals(this.createdAt, imageResponse.createdAt) &&
        Objects.equals(this.id, imageResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byName, byUrl, sourceName, sourceUrl, fileName, title, createdAt, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageResponse {\n");
    
    sb.append("    byName: ").append(toIndentedString(byName)).append("\n");
    sb.append("    byUrl: ").append(toIndentedString(byUrl)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
