# ReportApi

All URIs are relative to *https://api.practicesoftwaretesting.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAverageSalesPerMonth**](ReportApi.md#getAverageSalesPerMonth) | **GET** /reports/average-sales-per-month | Get average sales per month
[**getAverageSalesPerWeek**](ReportApi.md#getAverageSalesPerWeek) | **GET** /reports/average-sales-per-week | Get average sales per week
[**getBestSellingCategories**](ReportApi.md#getBestSellingCategories) | **GET** /reports/top10-best-selling-categories | Get top 10 best selling categories
[**getCustomersByCountry**](ReportApi.md#getCustomersByCountry) | **GET** /reports/customers-by-country | Get customers by country
[**getTopPurchasedProducts**](ReportApi.md#getTopPurchasedProducts) | **GET** /reports/top10-purchased-products | Get top 10 purchased products
[**getTotalSalesOfYears**](ReportApi.md#getTotalSalesOfYears) | **GET** /reports/total-sales-of-years | Get total sales of years
[**getTotalSalesPerCountry**](ReportApi.md#getTotalSalesPerCountry) | **GET** /reports/total-sales-per-country | Get total sales per country

<a name="getAverageSalesPerMonth"></a>
# **getAverageSalesPerMonth**
> List&lt;Object&gt; getAverageSalesPerMonth(year)

Get average sales per month

&#x60;Admin&#x60; role is required to get average sales per month

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
Integer year = 2022; // Integer | Specific year
try {
    List<Object> result = apiInstance.getAverageSalesPerMonth(year);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getAverageSalesPerMonth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Specific year | [optional] [default to 2022]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAverageSalesPerWeek"></a>
# **getAverageSalesPerWeek**
> List&lt;Object&gt; getAverageSalesPerWeek(year)

Get average sales per week

&#x60;Admin&#x60; role is required to get average sales per week

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
Integer year = 2022; // Integer | Specific year
try {
    List<Object> result = apiInstance.getAverageSalesPerWeek(year);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getAverageSalesPerWeek");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Specific year | [optional] [default to 2022]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBestSellingCategories"></a>
# **getBestSellingCategories**
> List&lt;Object&gt; getBestSellingCategories()

Get top 10 best selling categories

&#x60;Admin&#x60; role is required to get top 10 best selling categories

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
try {
    List<Object> result = apiInstance.getBestSellingCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getBestSellingCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomersByCountry"></a>
# **getCustomersByCountry**
> List&lt;Object&gt; getCustomersByCountry(country)

Get customers by country

&#x60;Admin&#x60; role is required to get customers by country

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
String country = "The Netherlands"; // String | Specific year
try {
    List<Object> result = apiInstance.getCustomersByCountry(country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getCustomersByCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Specific year | [optional] [default to The Netherlands]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopPurchasedProducts"></a>
# **getTopPurchasedProducts**
> List&lt;Object&gt; getTopPurchasedProducts()

Get top 10 purchased products

&#x60;Admin&#x60; role is required to get top 10 purchased products

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
try {
    List<Object> result = apiInstance.getTopPurchasedProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getTopPurchasedProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTotalSalesOfYears"></a>
# **getTotalSalesOfYears**
> List&lt;Object&gt; getTotalSalesOfYears(years)

Get total sales of years

&#x60;Admin&#x60; role is required to get total sales of years

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
Integer years = 1; // Integer | Number of years
try {
    List<Object> result = apiInstance.getTotalSalesOfYears(years);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getTotalSalesOfYears");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **years** | **Integer**| Number of years | [optional] [default to 1]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTotalSalesPerCountry"></a>
# **getTotalSalesPerCountry**
> List&lt;Object&gt; getTotalSalesPerCountry()

Get total sales per country

&#x60;Admin&#x60; role is required to get total sales per country

### Example
```java
// Import classes:
//import com.practicesoftwaretesting.client.ApiClient;
//import com.practicesoftwaretesting.client.ApiException;
//import com.practicesoftwaretesting.client.Configuration;
//import com.practicesoftwaretesting.client.auth.*;
//import com.practicesoftwaretesting.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportApi apiInstance = new ReportApi();
try {
    List<Object> result = apiInstance.getTotalSalesPerCountry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getTotalSalesPerCountry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

