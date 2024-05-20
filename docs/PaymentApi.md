# PaymentApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPayment**](PaymentApi.md#checkPayment) | **POST** /payment/check | Check payment

<a name="checkPayment"></a>
# **checkPayment**
> InlineResponse2004 checkPayment(body)

Check payment

Check payment

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
PaymentCheckBody body = new PaymentCheckBody(); // PaymentCheckBody | Invoice request object
try {
    InlineResponse2004 result = apiInstance.checkPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#checkPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentCheckBody**](PaymentCheckBody.md)| Invoice request object |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

