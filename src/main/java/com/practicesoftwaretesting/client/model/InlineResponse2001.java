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
import com.practicesoftwaretesting.client.model.InvoiceResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2001
 */

@javax.annotation.Generated(value = "com.practicesoftwaretesting.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-29T11:45:28.552Z[GMT]")
public class InlineResponse2001 {
  @SerializedName("current_page")
  private Integer currentPage = null;

  @SerializedName("data")
  private List<InvoiceResponse> data = null;

  @SerializedName("next_page_url")
  private Integer nextPageUrl = null;

  @SerializedName("path")
  private Integer path = null;

  @SerializedName("per_page")
  private Integer perPage = null;

  @SerializedName("prev_page_url")
  private Integer prevPageUrl = null;

  @SerializedName("to")
  private Integer to = null;

  @SerializedName("total")
  private Integer total = null;

  public InlineResponse2001 currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @Schema(example = "1", description = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public InlineResponse2001 data(List<InvoiceResponse> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2001 addDataItem(InvoiceResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<InvoiceResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<InvoiceResponse> getData() {
    return data;
  }

  public void setData(List<InvoiceResponse> data) {
    this.data = data;
  }

  public InlineResponse2001 nextPageUrl(Integer nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @Schema(example = "1", description = "")
  public Integer getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(Integer nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public InlineResponse2001 path(Integer path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(example = "1", description = "")
  public Integer getPath() {
    return path;
  }

  public void setPath(Integer path) {
    this.path = path;
  }

  public InlineResponse2001 perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @Schema(example = "1", description = "")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public InlineResponse2001 prevPageUrl(Integer prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
    return this;
  }

   /**
   * Get prevPageUrl
   * @return prevPageUrl
  **/
  @Schema(example = "1", description = "")
  public Integer getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(Integer prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }

  public InlineResponse2001 to(Integer to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(example = "1", description = "")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public InlineResponse2001 total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(example = "1", description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.currentPage, inlineResponse2001.currentPage) &&
        Objects.equals(this.data, inlineResponse2001.data) &&
        Objects.equals(this.nextPageUrl, inlineResponse2001.nextPageUrl) &&
        Objects.equals(this.path, inlineResponse2001.path) &&
        Objects.equals(this.perPage, inlineResponse2001.perPage) &&
        Objects.equals(this.prevPageUrl, inlineResponse2001.prevPageUrl) &&
        Objects.equals(this.to, inlineResponse2001.to) &&
        Objects.equals(this.total, inlineResponse2001.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, data, nextPageUrl, path, perPage, prevPageUrl, to, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    prevPageUrl: ").append(toIndentedString(prevPageUrl)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
