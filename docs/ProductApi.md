# ProductApi

All URIs are relative to *https://api-v1.practicesoftwaretesting.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /products/{productId} | Delete specific product |
| [**getProduct**](ProductApi.md#getProduct) | **GET** /products/{productId} | Retrieve specific product |
| [**getProducts**](ProductApi.md#getProducts) | **GET** /products | Retrieve all products |
| [**getRelatedProducts**](ProductApi.md#getRelatedProducts) | **GET** /products/{productId}/related | Retrieve related products |
| [**storeProduct**](ProductApi.md#storeProduct) | **POST** /products | Store new product |
| [**updateProduct**](ProductApi.md#updateProduct) | **PUT** /products/{productId} | Update specific product |


<a id="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(productId)

Delete specific product



### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer productId = 56; // Integer | The productId parameter in path
    try {
      apiInstance.deleteProduct(productId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **Integer**| The productId parameter in path | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **409** | Returns when the entity is used elsewhere |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |
| **422** | Returns when the server was not able to process the content |  -  |

<a id="getProduct"></a>
# **getProduct**
> ProductResponse getProduct(productId)

Retrieve specific product

Retrieve specific product

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer productId = 1; // Integer | The productId parameter in path
    try {
      ProductResponse result = apiInstance.getProduct(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **Integer**| The productId parameter in path | |

### Return type

[**ProductResponse**](ProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |

<a id="getProducts"></a>
# **getProducts**
> List&lt;ProductResponse&gt; getProducts(byBrand, byCategory, isRental)

Retrieve all products

Retrieve all products

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer byBrand = 56; // Integer | Id of brand
    Integer byCategory = 56; // Integer | Id of category
    String isRental = "isRental_example"; // String | Indication if we like to retrieve rentals products
    try {
      List<ProductResponse> result = apiInstance.getProducts(byBrand, byCategory, isRental);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **byBrand** | **Integer**| Id of brand | [optional] |
| **byCategory** | **Integer**| Id of category | [optional] |
| **isRental** | **String**| Indication if we like to retrieve rentals products | [optional] |

### Return type

[**List&lt;ProductResponse&gt;**](ProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |

<a id="getRelatedProducts"></a>
# **getRelatedProducts**
> List&lt;ProductResponse&gt; getRelatedProducts(productId)

Retrieve related products

Retrieve related products

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer productId = 1; // Integer | The productId parameter in path
    try {
      List<ProductResponse> result = apiInstance.getRelatedProducts(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getRelatedProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **Integer**| The productId parameter in path | |

### Return type

[**List&lt;ProductResponse&gt;**](ProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |

<a id="storeProduct"></a>
# **storeProduct**
> StoreProductResponse storeProduct(productRequest)

Store new product

Store new product

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductRequest productRequest = new ProductRequest(); // ProductRequest | Product request object
    try {
      StoreProductResponse result = apiInstance.storeProduct(productRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#storeProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productRequest** | [**ProductRequest**](ProductRequest.md)| Product request object | |

### Return type

[**StoreProductResponse**](StoreProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns when product is created |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |
| **422** | Returns when the server was not able to process the content |  -  |

<a id="updateProduct"></a>
# **updateProduct**
> UpdateResponse updateProduct(productId, productRequest)

Update specific product

Update specific product

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer productId = 56; // Integer | The productId parameter in path
    ProductRequest productRequest = new ProductRequest(); // ProductRequest | Product request object
    try {
      UpdateResponse result = apiInstance.updateProduct(productId, productRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **Integer**| The productId parameter in path | |
| **productRequest** | [**ProductRequest**](ProductRequest.md)| Product request object | |

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the update |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |
| **422** | Returns when the server was not able to process the content |  -  |

