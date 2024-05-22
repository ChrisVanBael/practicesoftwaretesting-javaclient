# ContactApi

All URIs are relative to *https://api-v4.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessage**](ContactApi.md#getMessage) | **GET** /messages/{messageId} | Retrieve specific message
[**getMessages**](ContactApi.md#getMessages) | **GET** /messages | Retrieve messages
[**sendMessage**](ContactApi.md#sendMessage) | **POST** /messages | Send new contact message

<a name="getMessage"></a>
# **getMessage**
> ContactResponse getMessage(messageId)

Retrieve specific message

Retrieve specific message

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactApi apiInstance = new ContactApi();
Integer messageId = 56; // Integer | The messageId parameter in path
try {
    ContactResponse result = apiInstance.getMessage(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **Integer**| The messageId parameter in path |

### Return type

[**ContactResponse**](ContactResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> InlineResponse2001 getMessages(page)

Retrieve messages

&#x60;user&#x60; retrieves only related messages

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactApi apiInstance = new ContactApi();
Integer page = 56; // Integer | pagenumber
try {
    InlineResponse2001 result = apiInstance.getMessages(page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| pagenumber | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> InlineResponse200 sendMessage(body)

Send new contact message

Send new contact message by mail

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ContactApi;


ContactApi apiInstance = new ContactApi();
ContactRequest body = new ContactRequest(); // ContactRequest | Contact request object
try {
    InlineResponse200 result = apiInstance.sendMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactRequest**](ContactRequest.md)| Contact request object |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

