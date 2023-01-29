# UserApi

All URIs are relative to *https://api-v4.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](UserApi.md#changePassword) | **POST** /users/change-password | Change password
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/{userId} | Delete specific user
[**forgotPassword**](UserApi.md#forgotPassword) | **POST** /users/forgot-password | Request a new password
[**getCurrentCustomerInfo**](UserApi.md#getCurrentCustomerInfo) | **GET** /users/me | Retrieve current customer info
[**getUser**](UserApi.md#getUser) | **GET** /users/{userId} | Retrieve specific user
[**getUsers**](UserApi.md#getUsers) | **GET** /users | Retrieve all users
[**logOut**](UserApi.md#logOut) | **GET** /users/logout | Logout - invalidate the token
[**loginCustomer**](UserApi.md#loginCustomer) | **POST** /users/login | Login customer
[**refreshToken**](UserApi.md#refreshToken) | **GET** /users/refresh | Retrieve a refreshed token
[**searchUser**](UserApi.md#searchUser) | **GET** /users/search | Retrieve specific users matching the search query
[**storeUser**](UserApi.md#storeUser) | **POST** /users/register | Store new user
[**updateUser**](UserApi.md#updateUser) | **PUT** /users/{userId} | Update specific user

<a name="changePassword"></a>
# **changePassword**
> InlineResponse200 changePassword(body)

Change password

Change the existing password to a new one

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
UsersChangepasswordBody body = new UsersChangepasswordBody(); // UsersChangepasswordBody | 
try {
    InlineResponse200 result = apiInstance.changePassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UsersChangepasswordBody**](UsersChangepasswordBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Delete specific user

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | The userId parameter in path
try {
    apiInstance.deleteUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The userId parameter in path |

### Return type

null (empty response body)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forgotPassword"></a>
# **forgotPassword**
> InlineResponse200 forgotPassword(body)

Request a new password

Request a new password, it actually sets the password to &#x60;welcome01&#x60;

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.UserApi;


UserApi apiInstance = new UserApi();
UsersForgotpasswordBody body = new UsersForgotpasswordBody(); // UsersForgotpasswordBody | 
try {
    InlineResponse200 result = apiInstance.forgotPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#forgotPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UsersForgotpasswordBody**](UsersForgotpasswordBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentCustomerInfo"></a>
# **getCurrentCustomerInfo**
> UserResponse getCurrentCustomerInfo()

Retrieve current customer info

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    UserResponse result = apiInstance.getCurrentCustomerInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getCurrentCustomerInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(userId)

Retrieve specific user

Retrieve specific user

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | The userId parameter in path
try {
    UserResponse result = apiInstance.getUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The userId parameter in path |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> List&lt;UserResponse&gt; getUsers()

Retrieve all users

Retrieve all users

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    List<UserResponse> result = apiInstance.getUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logOut"></a>
# **logOut**
> InlineResponse2007 logOut()

Logout - invalidate the token

Logout - invalidate the token

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    InlineResponse2007 result = apiInstance.logOut();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#logOut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginCustomer"></a>
# **loginCustomer**
> InlineResponse2006 loginCustomer(body)

Login customer

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.UserApi;


UserApi apiInstance = new UserApi();
UsersLoginBody body = new UsersLoginBody(); // UsersLoginBody | 
try {
    InlineResponse2006 result = apiInstance.loginCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#loginCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UsersLoginBody**](UsersLoginBody.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshToken"></a>
# **refreshToken**
> InlineResponse2006 refreshToken()

Retrieve a refreshed token

Retrieve a refreshed token

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    InlineResponse2006 result = apiInstance.refreshToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#refreshToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUser"></a>
# **searchUser**
> List&lt;UserResponse&gt; searchUser(q)

Retrieve specific users matching the search query

Search is performed on the &#x60;first_name&#x60;, &#x60;last_name&#x60;, or &#x60;city&#x60; column

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
String q = "q_example"; // String | A query phrase
try {
    List<UserResponse> result = apiInstance.searchUser(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#searchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A query phrase |

### Return type

[**List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeUser"></a>
# **storeUser**
> UserResponse storeUser(body)

Store new user

Store new user

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserRequest body = new UserRequest(); // UserRequest | User request object
try {
    UserResponse result = apiInstance.storeUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#storeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRequest**](UserRequest.md)| User request object |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> InlineResponse200 updateUser(body, userId)

Update specific user

Update specific user

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
UserRequest body = new UserRequest(); // UserRequest | User request object
Integer userId = 56; // Integer | The userId parameter in path
try {
    InlineResponse200 result = apiInstance.updateUser(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRequest**](UserRequest.md)| User request object |
 **userId** | **Integer**| The userId parameter in path |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

