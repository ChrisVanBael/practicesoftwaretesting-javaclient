# FavoriteApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFavorite**](FavoriteApi.md#deleteFavorite) | **DELETE** /favorites/{favoriteId} | Delete specific favorite
[**getFavorite**](FavoriteApi.md#getFavorite) | **GET** /favorites/{favoriteId} | Retrieve specific favorite
[**getFavorites**](FavoriteApi.md#getFavorites) | **GET** /favorites | Retrieve all favorites
[**storeFavorite**](FavoriteApi.md#storeFavorite) | **POST** /favorites | Store new favorite
[**updateFavorite**](FavoriteApi.md#updateFavorite) | **PUT** /favorites/{favoriteId} | Update specific favorite

<a name="deleteFavorite"></a>
# **deleteFavorite**
> deleteFavorite(favoriteId)

Delete specific favorite

User role is required to delete a specific favorite

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.FavoriteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FavoriteApi apiInstance = new FavoriteApi();
Integer favoriteId = 56; // Integer | The favoriteId parameter in path
try {
    apiInstance.deleteFavorite(favoriteId);
} catch (ApiException e) {
    System.err.println("Exception when calling FavoriteApi#deleteFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteId** | **Integer**| The favoriteId parameter in path |

### Return type

null (empty response body)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavorite"></a>
# **getFavorite**
> FavoriteResponse getFavorite(favoriteId)

Retrieve specific favorite

User role is required to retrieve specific favorite

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.FavoriteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FavoriteApi apiInstance = new FavoriteApi();
Integer favoriteId = 56; // Integer | The favoriteId parameter in path
try {
    FavoriteResponse result = apiInstance.getFavorite(favoriteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FavoriteApi#getFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteId** | **Integer**| The favoriteId parameter in path |

### Return type

[**FavoriteResponse**](FavoriteResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavorites"></a>
# **getFavorites**
> List&lt;FavoriteResponse&gt; getFavorites()

Retrieve all favorites

User role is required to retrieve users favorites

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.FavoriteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FavoriteApi apiInstance = new FavoriteApi();
try {
    List<FavoriteResponse> result = apiInstance.getFavorites();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FavoriteApi#getFavorites");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FavoriteResponse&gt;**](FavoriteResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeFavorite"></a>
# **storeFavorite**
> FavoriteResponse storeFavorite(body)

Store new favorite

User role is required to store new favorite

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.FavoriteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FavoriteApi apiInstance = new FavoriteApi();
FavoriteRequest body = new FavoriteRequest(); // FavoriteRequest | Brand request object
try {
    FavoriteResponse result = apiInstance.storeFavorite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FavoriteApi#storeFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FavoriteRequest**](FavoriteRequest.md)| Brand request object |

### Return type

[**FavoriteResponse**](FavoriteResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFavorite"></a>
# **updateFavorite**
> InlineResponse200 updateFavorite(body, favoriteId)

Update specific favorite

User role is required to update specific favorite

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.FavoriteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FavoriteApi apiInstance = new FavoriteApi();
FavoriteRequest body = new FavoriteRequest(); // FavoriteRequest | Brand request object
Integer favoriteId = 56; // Integer | The favoriteId parameter in path
try {
    InlineResponse200 result = apiInstance.updateFavorite(body, favoriteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FavoriteApi#updateFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FavoriteRequest**](FavoriteRequest.md)| Brand request object |
 **favoriteId** | **Integer**| The favoriteId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

