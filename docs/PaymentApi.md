# PaymentApi

All URIs are relative to *https://api-v4.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPayment**](PaymentApi.md#checkPayment) | **POST** /payment/check | Check payment

<a name="checkPayment"></a>
# **checkPayment**
> InlineResponse2003 checkPayment(body)

Check payment

Check payment

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
PaymentCheckBody body = new PaymentCheckBody(); // PaymentCheckBody | 
try {
    InlineResponse2003 result = apiInstance.checkPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#checkPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentCheckBody**](PaymentCheckBody.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

