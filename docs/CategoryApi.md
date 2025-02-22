# CategoryApi

All URIs are relative to *https://api-v1.practicesoftwaretesting.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCategory**](CategoryApi.md#deleteCategory) | **DELETE** /categories/{categoryId} | Delete specific category |
| [**getCategories**](CategoryApi.md#getCategories) | **GET** /categories | Retrieve all categories |
| [**getCategoriesTree**](CategoryApi.md#getCategoriesTree) | **GET** /categories/tree | Retrieve all categories (including subcategories) |
| [**getCategory**](CategoryApi.md#getCategory) | **GET** /categories/tree/{categoryId} | Retrieve specific category (including subcategories) |
| [**storeCategory**](CategoryApi.md#storeCategory) | **POST** /categories | Store new category |
| [**updateCategory**](CategoryApi.md#updateCategory) | **PUT** /categories/{categoryId} | Update specific category |


<a id="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId)

Delete specific category



### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    Integer categoryId = 1; // Integer | The categoryId parameter in path
    try {
      apiInstance.deleteCategory(categoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#deleteCategory");
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
| **categoryId** | **Integer**| The categoryId parameter in path | |

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

<a id="getCategories"></a>
# **getCategories**
> List&lt;CategoryResponse&gt; getCategories()

Retrieve all categories

Retrieve all categories

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    try {
      List<CategoryResponse> result = apiInstance.getCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#getCategories");
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

[**List&lt;CategoryResponse&gt;**](CategoryResponse.md)

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

<a id="getCategoriesTree"></a>
# **getCategoriesTree**
> List&lt;CategoryTreeResponse&gt; getCategoriesTree(byCategorySlug)

Retrieve all categories (including subcategories)

Retrieve all categories (including subcategories)

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    String byCategorySlug = "byCategorySlug_example"; // String | Parent category slug
    try {
      List<CategoryTreeResponse> result = apiInstance.getCategoriesTree(byCategorySlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#getCategoriesTree");
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
| **byCategorySlug** | **String**| Parent category slug | [optional] |

### Return type

[**List&lt;CategoryTreeResponse&gt;**](CategoryTreeResponse.md)

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

<a id="getCategory"></a>
# **getCategory**
> CategoryTreeResponse getCategory(categoryId)

Retrieve specific category (including subcategories)

Retrieve specific category (including subcategories)

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    Integer categoryId = 1; // Integer | The categoryId parameter in path
    try {
      CategoryTreeResponse result = apiInstance.getCategory(categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#getCategory");
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
| **categoryId** | **Integer**| The categoryId parameter in path | |

### Return type

[**CategoryTreeResponse**](CategoryTreeResponse.md)

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

<a id="storeCategory"></a>
# **storeCategory**
> CategoryResponse storeCategory(categoryRequest)

Store new category

Store new category

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    CategoryRequest categoryRequest = new CategoryRequest(); // CategoryRequest | Category request object
    try {
      CategoryResponse result = apiInstance.storeCategory(categoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#storeCategory");
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
| **categoryRequest** | [**CategoryRequest**](CategoryRequest.md)| Category request object | |

### Return type

[**CategoryResponse**](CategoryResponse.md)

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

<a id="updateCategory"></a>
# **updateCategory**
> UpdateResponse updateCategory(categoryId, categoryRequest)

Update specific category

Update specific category

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.CategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    CategoryApi apiInstance = new CategoryApi(defaultClient);
    Integer categoryId = 1; // Integer | The categoryId parameter in path
    CategoryRequest categoryRequest = new CategoryRequest(); // CategoryRequest | Category request object
    try {
      UpdateResponse result = apiInstance.updateCategory(categoryId, categoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryApi#updateCategory");
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
| **categoryId** | **Integer**| The categoryId parameter in path | |
| **categoryRequest** | [**CategoryRequest**](CategoryRequest.md)| Category request object | |

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

