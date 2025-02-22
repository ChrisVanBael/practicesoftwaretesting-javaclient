# ImageApi

All URIs are relative to *https://api-v1.practicesoftwaretesting.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getImages**](ImageApi.md#getImages) | **GET** /images | Retrieve all images |


<a id="getImages"></a>
# **getImages**
> List&lt;ImageResponse&gt; getImages()

Retrieve all images

Retrieve all images

### Example
```java
// Import classes:
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.models.*;
import com.practicesoftwaretesting.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v1.practicesoftwaretesting.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    try {
      List<ImageResponse> result = apiInstance.getImages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#getImages");
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

[**List&lt;ImageResponse&gt;**](ImageResponse.md)

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

