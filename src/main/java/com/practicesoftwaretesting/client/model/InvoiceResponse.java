/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 1.0.0
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
import com.practicesoftwaretesting.client.model.InvoiceLineResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * InvoiceResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-29T12:39:58.899Z[GMT]")
public class InvoiceResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_date")
  private String invoiceDate = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("billing_address")
  private String billingAddress = null;

  @SerializedName("billing_city")
  private String billingCity = null;

  @SerializedName("billing_country")
  private String billingCountry = null;

  @SerializedName("billing_state")
  private String billingState = null;

  @SerializedName("billing_postcode")
  private String billingPostcode = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("payment_method")
  private String paymentMethod = null;

  @SerializedName("payment_account_name")
  private String paymentAccountName = null;

  @SerializedName("payment_account_number")
  private String paymentAccountNumber = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_message")
  private String statusMessage = null;

  @SerializedName("invoicelines")
  private List<InvoiceLineResponse> invoicelines = null;

  public InvoiceResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InvoiceResponse invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @Schema(example = "2022-10-20 09:49:45", description = "")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public InvoiceResponse invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @Schema(example = "INV-2022000002", description = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public InvoiceResponse billingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @Schema(description = "")
  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public InvoiceResponse billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * Get billingCity
   * @return billingCity
  **/
  @Schema(description = "")
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public InvoiceResponse billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

   /**
   * Get billingCountry
   * @return billingCountry
  **/
  @Schema(description = "")
  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }

  public InvoiceResponse billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * Get billingState
   * @return billingState
  **/
  @Schema(description = "")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public InvoiceResponse billingPostcode(String billingPostcode) {
    this.billingPostcode = billingPostcode;
    return this;
  }

   /**
   * Get billingPostcode
   * @return billingPostcode
  **/
  @Schema(description = "")
  public String getBillingPostcode() {
    return billingPostcode;
  }

  public void setBillingPostcode(String billingPostcode) {
    this.billingPostcode = billingPostcode;
  }

  public InvoiceResponse total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public InvoiceResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @Schema(example = "Cash on Delivery", description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public InvoiceResponse paymentAccountName(String paymentAccountName) {
    this.paymentAccountName = paymentAccountName;
    return this;
  }

   /**
   * Get paymentAccountName
   * @return paymentAccountName
  **/
  @Schema(example = "Jogn Doe", description = "")
  public String getPaymentAccountName() {
    return paymentAccountName;
  }

  public void setPaymentAccountName(String paymentAccountName) {
    this.paymentAccountName = paymentAccountName;
  }

  public InvoiceResponse paymentAccountNumber(String paymentAccountNumber) {
    this.paymentAccountNumber = paymentAccountNumber;
    return this;
  }

   /**
   * Get paymentAccountNumber
   * @return paymentAccountNumber
  **/
  @Schema(example = "0987654345", description = "")
  public String getPaymentAccountNumber() {
    return paymentAccountNumber;
  }

  public void setPaymentAccountNumber(String paymentAccountNumber) {
    this.paymentAccountNumber = paymentAccountNumber;
  }

  public InvoiceResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "COMPLETED", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InvoiceResponse statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @Schema(description = "")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public InvoiceResponse invoicelines(List<InvoiceLineResponse> invoicelines) {
    this.invoicelines = invoicelines;
    return this;
  }

  public InvoiceResponse addInvoicelinesItem(InvoiceLineResponse invoicelinesItem) {
    if (this.invoicelines == null) {
      this.invoicelines = new ArrayList<InvoiceLineResponse>();
    }
    this.invoicelines.add(invoicelinesItem);
    return this;
  }

   /**
   * Get invoicelines
   * @return invoicelines
  **/
  @Schema(description = "")
  public List<InvoiceLineResponse> getInvoicelines() {
    return invoicelines;
  }

  public void setInvoicelines(List<InvoiceLineResponse> invoicelines) {
    this.invoicelines = invoicelines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceResponse invoiceResponse = (InvoiceResponse) o;
    return Objects.equals(this.id, invoiceResponse.id) &&
        Objects.equals(this.invoiceDate, invoiceResponse.invoiceDate) &&
        Objects.equals(this.invoiceNumber, invoiceResponse.invoiceNumber) &&
        Objects.equals(this.billingAddress, invoiceResponse.billingAddress) &&
        Objects.equals(this.billingCity, invoiceResponse.billingCity) &&
        Objects.equals(this.billingCountry, invoiceResponse.billingCountry) &&
        Objects.equals(this.billingState, invoiceResponse.billingState) &&
        Objects.equals(this.billingPostcode, invoiceResponse.billingPostcode) &&
        Objects.equals(this.total, invoiceResponse.total) &&
        Objects.equals(this.paymentMethod, invoiceResponse.paymentMethod) &&
        Objects.equals(this.paymentAccountName, invoiceResponse.paymentAccountName) &&
        Objects.equals(this.paymentAccountNumber, invoiceResponse.paymentAccountNumber) &&
        Objects.equals(this.status, invoiceResponse.status) &&
        Objects.equals(this.statusMessage, invoiceResponse.statusMessage) &&
        Objects.equals(this.invoicelines, invoiceResponse.invoicelines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceDate, invoiceNumber, billingAddress, billingCity, billingCountry, billingState, billingPostcode, total, paymentMethod, paymentAccountName, paymentAccountNumber, status, statusMessage, invoicelines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingPostcode: ").append(toIndentedString(billingPostcode)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentAccountName: ").append(toIndentedString(paymentAccountName)).append("\n");
    sb.append("    paymentAccountNumber: ").append(toIndentedString(paymentAccountNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    invoicelines: ").append(toIndentedString(invoicelines)).append("\n");
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
