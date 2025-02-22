# BrandApi

All URIs are relative to *https://api-v1.practicesoftwaretesting.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBrand**](BrandApi.md#deleteBrand) | **DELETE** /brands/{brandId} | Delete specific brand |
| [**getBrand**](BrandApi.md#getBrand) | **GET** /brands/{brandId} | Retrieve specific brand |
| [**getBrands**](BrandApi.md#getBrands) | **GET** /brands | Retrieve all brands |
| [**storeBrand**](BrandApi.md#storeBrand) | **POST** /brands | Store new brand |
| [**updateBrand**](BrandApi.md#updateBrand) | **PUT** /brands/{brandId} | Update specific brand |


<a id="deleteBrand"></a>
# **deleteBrand**
> deleteBrand(brandId)

Delete specific brand



### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    BrandApi apiInstance = new BrandApi(defaultClient);
    Integer brandId = 1; // Integer | The brandId parameter in path
    try {
      apiInstance.deleteBrand(brandId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteBrand");
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
| **brandId** | **Integer**| The brandId parameter in path | |

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

<a id="getBrand"></a>
# **getBrand**
> BrandResponse getBrand(brandId)

Retrieve specific brand

Retrieve specific brand

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    BrandApi apiInstance = new BrandApi(defaultClient);
    Integer brandId = 1; // Integer | The brandId parameter in path
    try {
      BrandResponse result = apiInstance.getBrand(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrand");
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
| **brandId** | **Integer**| The brandId parameter in path | |

### Return type

[**BrandResponse**](BrandResponse.md)

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

<a id="getBrands"></a>
# **getBrands**
> List&lt;BrandResponse&gt; getBrands()

Retrieve all brands

Retrieve all brands

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    BrandApi apiInstance = new BrandApi(defaultClient);
    try {
      List<BrandResponse> result = apiInstance.getBrands();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrands");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |

<a id="storeBrand"></a>
# **storeBrand**
> BrandResponse storeBrand(brandRequest)

Store new brand

Store new brand

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    BrandApi apiInstance = new BrandApi(defaultClient);
    BrandRequest brandRequest = new BrandRequest(); // BrandRequest | Brand request object
    try {
      BrandResponse result = apiInstance.storeBrand(brandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#storeBrand");
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
| **brandRequest** | [**BrandRequest**](BrandRequest.md)| Brand request object | |

### Return type

[**BrandResponse**](BrandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **404** | Returns when the resource is not found |  -  |
| **405** | Returns when the method is not allowed for the requested route |  -  |
| **422** | Returns when the server was not able to process the content |  -  |

<a id="updateBrand"></a>
# **updateBrand**
> UpdateResponse updateBrand(brandId, brandRequest)

Update specific brand

Update specific brand

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    BrandApi apiInstance = new BrandApi(defaultClient);
    Integer brandId = 1; // Integer | The brandId parameter in path
    BrandRequest brandRequest = new BrandRequest(); // BrandRequest | Brand request object
    try {
      UpdateResponse result = apiInstance.updateBrand(brandId, brandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateBrand");
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
| **brandId** | **Integer**| The brandId parameter in path | |
| **brandRequest** | [**BrandRequest**](BrandRequest.md)| Brand request object | |

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

