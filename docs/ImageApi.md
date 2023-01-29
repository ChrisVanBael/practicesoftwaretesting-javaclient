# ImageApi

All URIs are relative to *https://api-v4.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImages**](ImageApi.md#getImages) | **GET** /images | Retrieve all images

<a name="getImages"></a>
# **getImages**
> List&lt;ImageResponse&gt; getImages()

Retrieve all images

Retrieve all images

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
try {
    List<ImageResponse> result = apiInstance.getImages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#getImages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ImageResponse&gt;**](ImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

