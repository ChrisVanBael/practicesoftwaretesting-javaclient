# ContactApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessage**](ContactApi.md#getMessage) | **GET** /messages/{messageId} | Retrieve specific message
[**getMessages**](ContactApi.md#getMessages) | **GET** /messages | Retrieve messages
[**replyToMessage**](ContactApi.md#replyToMessage) | **POST** /messages/{messageId}/reply | Send new contact message
[**sendMessage**](ContactApi.md#sendMessage) | **POST** /messages | Send new contact message
[**updateMessageStatus**](ContactApi.md#updateMessageStatus) | **PUT** /messages/{messageId}/status | Set a new message status

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
> InlineResponse2001 getMessages()

Retrieve messages

&#x60;admin&#x60; retrieves all messages, &#x60;user&#x60; retrieves only related messages

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
try {
    InlineResponse2001 result = apiInstance.getMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getMessages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replyToMessage"></a>
# **replyToMessage**
> ContactReplyResponse replyToMessage(body, messageId)

Send new contact message

Send new contact message by mail

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
ContactRequest body = new ContactRequest(); // ContactRequest | Contact request object
Integer messageId = 56; // Integer | The messageId parameter in path
try {
    ContactReplyResponse result = apiInstance.replyToMessage(body, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#replyToMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactRequest**](ContactRequest.md)| Contact request object |
 **messageId** | **Integer**| The messageId parameter in path |

### Return type

[**ContactReplyResponse**](ContactReplyResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> InlineResponse2002 sendMessage(body)

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
    InlineResponse2002 result = apiInstance.sendMessage(body);
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMessageStatus"></a>
# **updateMessageStatus**
> InlineResponse200 updateMessageStatus(messageId, body)

Set a new message status

Set a new message status. Possible values: &#x60;NEW&#x60;, &#x60;IN_PROGRESS&#x60;, &#x60;RESOLVED&#x60;

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
MessageIdStatusBody body = new MessageIdStatusBody(); // MessageIdStatusBody | 
try {
    InlineResponse200 result = apiInstance.updateMessageStatus(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#updateMessageStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **Integer**| The messageId parameter in path |
 **body** | [**MessageIdStatusBody**](MessageIdStatusBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

