# InvoiceIdStatusBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The status of the order |  [optional]
**statusMessage** | **String** | A message describing the status |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AWAITING_FULFILLMENT | &quot;AWAITING_FULFILLMENT&quot;
ON_HOLD | &quot;ON_HOLD&quot;
AWAITING_SHIPMENT | &quot;AWAITING_SHIPMENT&quot;
SHIPPED | &quot;SHIPPED&quot;
COMPLETED | &quot;COMPLETED&quot;
