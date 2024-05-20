# InvoiceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**invoiceDate** | **String** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**billingAddress** | **String** |  |  [optional]
**billingCity** | **String** |  |  [optional]
**billingCountry** | **String** |  |  [optional]
**billingState** | **String** |  |  [optional]
**billingPostcode** | **String** |  |  [optional]
**additionalDiscountPercentage** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**additionalDiscountAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**subtotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**status** | **String** |  |  [optional]
**statusMessage** | **String** |  |  [optional]
**invoiceItems** | [**List&lt;InvoiceLineResponse&gt;**](InvoiceLineResponse.md) |  |  [optional]
