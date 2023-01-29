# InvoiceApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvoice**](InvoiceApi.md#deleteInvoice) | **DELETE** /invoices/{invoiceId} | Delete specific invoice
[**getInvoice**](InvoiceApi.md#getInvoice) | **GET** /invoices/{invoiceId} | Retrieve specific invoice
[**getInvoices**](InvoiceApi.md#getInvoices) | **GET** /invoices | Retrieve all invoices
[**searchInvoice**](InvoiceApi.md#searchInvoice) | **GET** /invoices/search | Retrieve specific invoices matching the search query
[**storeInvoice**](InvoiceApi.md#storeInvoice) | **POST** /invoices | Store new invoice
[**updateInvoice**](InvoiceApi.md#updateInvoice) | **PUT** /invoices/{invoiceId} | Update specific invoice
[**updateInvoiceStatus**](InvoiceApi.md#updateInvoiceStatus) | **PUT** /invoices/{invoiceId}/status | Update invoice status

<a name="deleteInvoice"></a>
# **deleteInvoice**
> deleteInvoice(invoiceId)

Delete specific invoice

Admin role is required to delete a specific invoice

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
Integer invoiceId = 56; // Integer | The invoiceId parameter in path
try {
    apiInstance.deleteInvoice(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#deleteInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Integer**| The invoiceId parameter in path |

### Return type

null (empty response body)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoice"></a>
# **getInvoice**
> InvoiceResponse getInvoice(invoiceId)

Retrieve specific invoice

Retrieve specific invoice

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
Integer invoiceId = 56; // Integer | The invoiceId parameter in path
try {
    InvoiceResponse result = apiInstance.getInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Integer**| The invoiceId parameter in path |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoices"></a>
# **getInvoices**
> InlineResponse2003 getInvoices()

Retrieve all invoices

&#x60;admin&#x60; retrieves all invoices, &#x60;user&#x60; retrieves only related invoices

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
try {
    InlineResponse2003 result = apiInstance.getInvoices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchInvoice"></a>
# **searchInvoice**
> InlineResponse2003 searchInvoice(q)

Retrieve specific invoices matching the search query

Search is performed on the &#x60;invoice_number&#x60;, &#x60;billing_address&#x60; and &#x60;status&#x60; column

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.InvoiceApi;


InvoiceApi apiInstance = new InvoiceApi();
String q = "q_example"; // String | A query phrase
try {
    InlineResponse2003 result = apiInstance.searchInvoice(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#searchInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A query phrase |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeInvoice"></a>
# **storeInvoice**
> InvoiceResponse storeInvoice(body)

Store new invoice

Store new invoice

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
InvoiceRequest body = new InvoiceRequest(); // InvoiceRequest | Invoice request object
try {
    InvoiceResponse result = apiInstance.storeInvoice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#storeInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceRequest**](InvoiceRequest.md)| Invoice request object |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInvoice"></a>
# **updateInvoice**
> InlineResponse200 updateInvoice(body, invoiceId)

Update specific invoice

Update specific invoice

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
InvoiceRequest body = new InvoiceRequest(); // InvoiceRequest | Invoice request object
Integer invoiceId = 56; // Integer | The invoiceId parameter in path
try {
    InlineResponse200 result = apiInstance.updateInvoice(body, invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#updateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceRequest**](InvoiceRequest.md)| Invoice request object |
 **invoiceId** | **Integer**| The invoiceId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInvoiceStatus"></a>
# **updateInvoiceStatus**
> InlineResponse200 updateInvoiceStatus(body, invoiceId)

Update invoice status

Update invoice status

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InvoiceApi apiInstance = new InvoiceApi();
InvoiceRequest body = new InvoiceRequest(); // InvoiceRequest | Invoice request object
Integer invoiceId = 56; // Integer | The invoiceId parameter in path
try {
    InlineResponse200 result = apiInstance.updateInvoiceStatus(body, invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#updateInvoiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvoiceRequest**](InvoiceRequest.md)| Invoice request object |
 **invoiceId** | **Integer**| The invoiceId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

