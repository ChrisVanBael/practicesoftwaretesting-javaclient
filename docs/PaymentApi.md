# PaymentApi

All URIs are relative to *https://api-v4.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPayment**](PaymentApi.md#checkPayment) | **POST** /payment/check | Check payment

<a name="checkPayment"></a>
# **checkPayment**
> InlineResponse2004 checkPayment()

Check payment

Check payment

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    InlineResponse2004 result = apiInstance.checkPayment();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#checkPayment");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

