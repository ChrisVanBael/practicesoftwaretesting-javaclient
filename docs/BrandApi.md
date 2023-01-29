# BrandApi

All URIs are relative to *https://api-v3.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBrand**](BrandApi.md#deleteBrand) | **DELETE** /brands/{brandId} | Delete specific brand
[**getBrand**](BrandApi.md#getBrand) | **GET** /brands/{brandId} | Retrieve specific brand
[**getBrands**](BrandApi.md#getBrands) | **GET** /brands | Retrieve all brands
[**searchBrand**](BrandApi.md#searchBrand) | **GET** /brands/search | Retrieve specific brands matching the search query
[**storeBrand**](BrandApi.md#storeBrand) | **POST** /brands | Store new brand
[**updateBrand**](BrandApi.md#updateBrand) | **PUT** /brands/{brandId} | Update specific brand

<a name="deleteBrand"></a>
# **deleteBrand**
> deleteBrand(brandId)

Delete specific brand

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
Integer brandId = 56; // Integer | The brandId parameter in path
try {
    apiInstance.deleteBrand(brandId);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#deleteBrand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **Integer**| The brandId parameter in path |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrand"></a>
# **getBrand**
> BrandResponse getBrand(brandId)

Retrieve specific brand

Retrieve specific brand

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
Integer brandId = 56; // Integer | The brandId parameter in path
try {
    BrandResponse result = apiInstance.getBrand(brandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#getBrand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **Integer**| The brandId parameter in path |

### Return type

[**BrandResponse**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrands"></a>
# **getBrands**
> List&lt;BrandResponse&gt; getBrands()

Retrieve all brands

Retrieve all brands

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
try {
    List<BrandResponse> result = apiInstance.getBrands();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#getBrands");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BrandResponse&gt;**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchBrand"></a>
# **searchBrand**
> List&lt;BrandResponse&gt; searchBrand(q)

Retrieve specific brands matching the search query

Search is performed on the &#x60;name&#x60; column

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
String q = "q_example"; // String | A query phrase
try {
    List<BrandResponse> result = apiInstance.searchBrand(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#searchBrand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A query phrase |

### Return type

[**List&lt;BrandResponse&gt;**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeBrand"></a>
# **storeBrand**
> BrandResponse storeBrand(body)

Store new brand

Store new brand

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
BrandRequest body = new BrandRequest(); // BrandRequest | Brand request object
try {
    BrandResponse result = apiInstance.storeBrand(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#storeBrand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BrandRequest**](BrandRequest.md)| Brand request object |

### Return type

[**BrandResponse**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBrand"></a>
# **updateBrand**
> InlineResponse200 updateBrand(body, brandId)

Update specific brand

Update specific brand

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
BrandRequest body = new BrandRequest(); // BrandRequest | Brand request object
Integer brandId = 56; // Integer | The brandId parameter in path
try {
    InlineResponse200 result = apiInstance.updateBrand(body, brandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#updateBrand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BrandRequest**](BrandRequest.md)| Brand request object |
 **brandId** | **Integer**| The brandId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

