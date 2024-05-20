# CartApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItem**](CartApi.md#addItem) | **POST** /carts/{id} | Add item to cart
[**createCart**](CartApi.md#createCart) | **POST** /carts | Create a new cart
[**deleteCart**](CartApi.md#deleteCart) | **DELETE** /carts/{cartId} | Delete Cart
[**deleteProductFromCart**](CartApi.md#deleteProductFromCart) | **DELETE** /carts/{cartId}/product/{productId} | Delete product from cart
[**getCart**](CartApi.md#getCart) | **GET** /carts/{cartId} | Retrieve specific cart
[**updateCartQuantity**](CartApi.md#updateCartQuantity) | **PUT** /carts/{cartId}/product/quantity | Update quantity of item in cart

<a name="addItem"></a>
# **addItem**
> InlineResponse2001 addItem(body, id)

Add item to cart

Add item to cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
CartsIdBody body = new CartsIdBody(); // CartsIdBody | Payload to add item to cart
String id = "id_example"; // String | Cart ID
try {
    InlineResponse2001 result = apiInstance.addItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#addItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CartsIdBody**](CartsIdBody.md)| Payload to add item to cart |
 **id** | **String**| Cart ID |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCart"></a>
# **createCart**
> InlineResponse201 createCart()

Create a new cart

Create a new cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
try {
    InlineResponse201 result = apiInstance.createCart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#createCart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCart"></a>
# **deleteCart**
> deleteCart(cartId)

Delete Cart

Delete Cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
String cartId = "cartId_example"; // String | The cartId parameter in path
try {
    apiInstance.deleteCart(cartId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#deleteCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**| The cartId parameter in path |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductFromCart"></a>
# **deleteProductFromCart**
> deleteProductFromCart(cartId, productId)

Delete product from cart

Delete a product from Cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
String cartId = "cartId_example"; // String | The cartId parameter in path
String productId = "productId_example"; // String | The cartId parameter in path
try {
    apiInstance.deleteProductFromCart(cartId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#deleteProductFromCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**| The cartId parameter in path |
 **productId** | **String**| The cartId parameter in path |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCart"></a>
# **getCart**
> CartResponse getCart(cartId)

Retrieve specific cart

Retrieve specific cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
String cartId = "cartId_example"; // String | The cartId parameter in path
try {
    CartResponse result = apiInstance.getCart(cartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#getCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**| The cartId parameter in path |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCartQuantity"></a>
# **updateCartQuantity**
> InlineResponse200 updateCartQuantity(body, cartId)

Update quantity of item in cart

Update quantity of item in cart

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.CartApi;


CartApi apiInstance = new CartApi();
ProductQuantityBody body = new ProductQuantityBody(); // ProductQuantityBody | Payload to add item to cart
String cartId = "cartId_example"; // String | Cart ID
try {
    InlineResponse200 result = apiInstance.updateCartQuantity(body, cartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#updateCartQuantity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductQuantityBody**](ProductQuantityBody.md)| Payload to add item to cart |
 **cartId** | **String**| Cart ID |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

