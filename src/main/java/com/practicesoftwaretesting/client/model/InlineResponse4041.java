/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.2.0
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
import com.practicesoftwaretesting.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4041
 */

@javax.annotation.Generated(value = "com.practicesoftwaretesting.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-29T11:33:35.781Z[GMT]")
public class InlineResponse4041 {
  @SerializedName("message")
  private String message = null;

  public InlineResponse4041 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "Requested item not found", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4041 inlineResponse4041 = (InlineResponse4041) o;
    return Objects.equals(this.message, inlineResponse4041.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4041 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
