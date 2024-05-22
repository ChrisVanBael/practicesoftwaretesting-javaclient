# CategoryApi

All URIs are relative to *https://api-v2.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCategory**](CategoryApi.md#deleteCategory) | **DELETE** /categories/{categoryId} | Delete specific category
[**getCategories**](CategoryApi.md#getCategories) | **GET** /categories | Retrieve all categories
[**getCategoriesTree**](CategoryApi.md#getCategoriesTree) | **GET** /categories/tree | Retrieve all categories (including subcategories)
[**getCategory**](CategoryApi.md#getCategory) | **GET** /categories/{categoryId} | Retrieve specific category
[**searchCategory**](CategoryApi.md#searchCategory) | **GET** /categories/search | Retrieve specific categories matching the search query
[**storeCategory**](CategoryApi.md#storeCategory) | **POST** /categories | Store new category
[**updateCategory**](CategoryApi.md#updateCategory) | **PUT** /categories/{categoryId} | Update specific category

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId)

Delete specific category

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
Integer categoryId = 56; // Integer | The categoryId parameter in path
try {
    apiInstance.deleteCategory(categoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#deleteCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| The categoryId parameter in path |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategories"></a>
# **getCategories**
> List&lt;CategoryResponse&gt; getCategories()

Retrieve all categories

Retrieve all categories

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
try {
    List<CategoryResponse> result = apiInstance.getCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategories");
    e.printStackTrace();
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

<a name="getCategoriesTree"></a>
# **getCategoriesTree**
> List&lt;CategoryResponse&gt; getCategoriesTree(byCategorySlug)

Retrieve all categories (including subcategories)

Retrieve all categories (including subcategories)

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
String byCategorySlug = "byCategorySlug_example"; // String | Parent category slug
try {
    List<CategoryResponse> result = apiInstance.getCategoriesTree(byCategorySlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategoriesTree");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **byCategorySlug** | **String**| Parent category slug | [optional]

### Return type

[**List&lt;CategoryResponse&gt;**](CategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategory"></a>
# **getCategory**
> CategoryResponse getCategory(categoryId)

Retrieve specific category

Retrieve specific category

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
Integer categoryId = 56; // Integer | The categoryId parameter in path
try {
    CategoryResponse result = apiInstance.getCategory(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| The categoryId parameter in path |

### Return type

[**CategoryResponse**](CategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchCategory"></a>
# **searchCategory**
> List&lt;CategoryResponse&gt; searchCategory(q)

Retrieve specific categories matching the search query

Search is performed on the &#x60;name&#x60; column

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
String q = "q_example"; // String | A query phrase
try {
    List<CategoryResponse> result = apiInstance.searchCategory(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#searchCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A query phrase |

### Return type

[**List&lt;CategoryResponse&gt;**](CategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeCategory"></a>
# **storeCategory**
> CategoryResponse storeCategory(body)

Store new category

Store new category

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
CategoryRequest body = new CategoryRequest(); // CategoryRequest | Category request object
try {
    CategoryResponse result = apiInstance.storeCategory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#storeCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryRequest**](CategoryRequest.md)| Category request object |

### Return type

[**CategoryResponse**](CategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategory"></a>
# **updateCategory**
> InlineResponse200 updateCategory(body, categoryId)

Update specific category

Update specific category

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CategoryApi;


CategoryApi apiInstance = new CategoryApi();
CategoryRequest body = new CategoryRequest(); // CategoryRequest | Category request object
Integer categoryId = 56; // Integer | The categoryId parameter in path
try {
    InlineResponse200 result = apiInstance.updateCategory(body, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#updateCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryRequest**](CategoryRequest.md)| Category request object |
 **categoryId** | **Integer**| The categoryId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

