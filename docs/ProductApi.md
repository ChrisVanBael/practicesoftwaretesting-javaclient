# ProductApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /products/{productId} | Delete specific product
[**getProduct**](ProductApi.md#getProduct) | **GET** /products/{productId} | Retrieve specific product
[**getProducts**](ProductApi.md#getProducts) | **GET** /products | Retrieve all products
[**getRelatedProducts**](ProductApi.md#getRelatedProducts) | **GET** /products/{productId}/related | Retrieve related products
[**searchProduct**](ProductApi.md#searchProduct) | **GET** /products/search | Retrieve specific products matching the search query
[**storeProduct**](ProductApi.md#storeProduct) | **POST** /products | Store new product
[**updateProduct**](ProductApi.md#updateProduct) | **PUT** /products/{productId} | Update specific product

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(productId)

Delete specific product

Admin role is required to delete a specific product

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProductApi apiInstance = new ProductApi();
Integer productId = 56; // Integer | The productId parameter in path
try {
    apiInstance.deleteProduct(productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| The productId parameter in path |

### Return type

null (empty response body)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProduct"></a>
# **getProduct**
> BrandResponse getProduct(productId)

Retrieve specific product

Retrieve specific product

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer productId = 56; // Integer | The productId parameter in path
try {
    BrandResponse result = apiInstance.getProduct(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| The productId parameter in path |

### Return type

[**BrandResponse**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> InlineResponse2005 getProducts(byBrand, byCategory, isRental, between, sort)

Retrieve all products

Retrieve all products

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer byBrand = 56; // Integer | Id of brand
Integer byCategory = 56; // Integer | Id of category
String isRental = "isRental_example"; // String | Indication if we like to retrieve rentals products
String between = "between_example"; // String | Can be used to define a price range, like: price,10,30
String sort = "sort_example"; // String | Can be used to sort based on specific column value, like: name,asc OR name,desc OR price,asc OR price,desc
try {
    InlineResponse2005 result = apiInstance.getProducts(byBrand, byCategory, isRental, between, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **byBrand** | **Integer**| Id of brand | [optional]
 **byCategory** | **Integer**| Id of category | [optional]
 **isRental** | **String**| Indication if we like to retrieve rentals products | [optional]
 **between** | **String**| Can be used to define a price range, like: price,10,30 | [optional]
 **sort** | **String**| Can be used to sort based on specific column value, like: name,asc OR name,desc OR price,asc OR price,desc | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelatedProducts"></a>
# **getRelatedProducts**
> List&lt;ProductResponse&gt; getRelatedProducts(productId)

Retrieve related products

Retrieve related products

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer productId = 56; // Integer | The productId parameter in path
try {
    List<ProductResponse> result = apiInstance.getRelatedProducts(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getRelatedProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| The productId parameter in path |

### Return type

[**List&lt;ProductResponse&gt;**](ProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchProduct"></a>
# **searchProduct**
> InlineResponse2005 searchProduct(q)

Retrieve specific products matching the search query

Search is performed on the &#x60;name&#x60; column

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String q = "q_example"; // String | A query phrase
try {
    InlineResponse2005 result = apiInstance.searchProduct(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#searchProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A query phrase |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeProduct"></a>
# **storeProduct**
> InlineResponse201 storeProduct(body)

Store new product

Store new product

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ProductRequest body = new ProductRequest(); // ProductRequest | Product request object
try {
    InlineResponse201 result = apiInstance.storeProduct(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#storeProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductRequest**](ProductRequest.md)| Product request object |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> InlineResponse200 updateProduct(body, productId)

Update specific product

Update specific product

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ProductRequest body = new ProductRequest(); // ProductRequest | Product request object
Integer productId = 56; // Integer | The productId parameter in path
try {
    InlineResponse200 result = apiInstance.updateProduct(body, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductRequest**](ProductRequest.md)| Product request object |
 **productId** | **Integer**| The productId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

