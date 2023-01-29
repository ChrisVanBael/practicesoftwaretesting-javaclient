# swagger-java-client

Toolshop API
- API version: 0.2.0
  - Build date: 2023-01-29T11:33:35.781Z[GMT]

Toolshop REST API technical description


Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)  
from https://api-v2.practicesoftwaretesting.com/docs


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.practiesoftwaretesting</groupId>
  <artifactId>client</artifactId>
  <version>0.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.practicesoftwaretesting:client:0.2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        Integer brandId = 56; // Integer | The brandId parameter in path
        try {
            apiInstance.deleteBrand(brandId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#deleteBrand");
            e.printStackTrace();
        }
    }
}
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        Integer brandId = 56; // Integer | The brandId parameter in path
        try {
            BrandResponse result = apiInstance.getBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#getBrand");
            e.printStackTrace();
        }
    }
}
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        try {
            List<BrandResponse> result = apiInstance.getBrands();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#getBrands");
            e.printStackTrace();
        }
    }
}
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        String q = "q_example"; // String | A query phrase
        try {
            List<BrandResponse> result = apiInstance.searchBrand(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#searchBrand");
            e.printStackTrace();
        }
    }
}
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        BrandRequest body = new BrandRequest(); // BrandRequest | Brand request object
        try {
            BrandResponse result = apiInstance.storeBrand(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#storeBrand");
            e.printStackTrace();
        }
    }
}
import com.practicesoftwaretesting.client.*;
import com.practicesoftwaretesting.client.auth.*;
import com.practicesoftwaretesting.client.model.*;
import com.practicesoftwaretesting.client.api.BrandApi;

import java.io.File;
import java.util.*;

public class BrandApiExample {

    public static void main(String[] args) {
        
        BrandApi apiInstance = new BrandApi();
        BrandRequest body = new BrandRequest(); // BrandRequest | Brand request object
        Integer brandId = 56; // Integer | The brandId parameter in path
        try {
            InlineResponse200 result = apiInstance.updateBrand(body, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#updateBrand");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api-v2.practicesoftwaretesting.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandApi* | [**deleteBrand**](docs/BrandApi.md#deleteBrand) | **DELETE** /brands/{brandId} | Delete specific brand
*BrandApi* | [**getBrand**](docs/BrandApi.md#getBrand) | **GET** /brands/{brandId} | Retrieve specific brand
*BrandApi* | [**getBrands**](docs/BrandApi.md#getBrands) | **GET** /brands | Retrieve all brands
*BrandApi* | [**searchBrand**](docs/BrandApi.md#searchBrand) | **GET** /brands/search | Retrieve specific brands matching the search query
*BrandApi* | [**storeBrand**](docs/BrandApi.md#storeBrand) | **POST** /brands | Store new brand
*BrandApi* | [**updateBrand**](docs/BrandApi.md#updateBrand) | **PUT** /brands/{brandId} | Update specific brand
*CategoryApi* | [**deleteCategory**](docs/CategoryApi.md#deleteCategory) | **DELETE** /categories/{categoryId} | Delete specific category
*CategoryApi* | [**getCategories**](docs/CategoryApi.md#getCategories) | **GET** /categories | Retrieve all categories
*CategoryApi* | [**getCategoriesTree**](docs/CategoryApi.md#getCategoriesTree) | **GET** /categories/tree | Retrieve all categories (including subcategories)
*CategoryApi* | [**getCategory**](docs/CategoryApi.md#getCategory) | **GET** /categories/{categoryId} | Retrieve specific category
*CategoryApi* | [**searchCategory**](docs/CategoryApi.md#searchCategory) | **GET** /categories/search | Retrieve specific categories matching the search query
*CategoryApi* | [**storeCategory**](docs/CategoryApi.md#storeCategory) | **POST** /categories | Store new category
*CategoryApi* | [**updateCategory**](docs/CategoryApi.md#updateCategory) | **PUT** /categories/{categoryId} | Update specific category
*ImageApi* | [**getImages**](docs/ImageApi.md#getImages) | **GET** /images | Retrieve all images
*ProductApi* | [**deleteProduct**](docs/ProductApi.md#deleteProduct) | **DELETE** /products/{productId} | Delete specific product
*ProductApi* | [**getProduct**](docs/ProductApi.md#getProduct) | **GET** /products/{productId} | Retrieve specific product
*ProductApi* | [**getProducts**](docs/ProductApi.md#getProducts) | **GET** /products | Retrieve all products
*ProductApi* | [**getRelatedProducts**](docs/ProductApi.md#getRelatedProducts) | **GET** /products/{productId}/related | Retrieve related products
*ProductApi* | [**searchProduct**](docs/ProductApi.md#searchProduct) | **GET** /products/search | Retrieve specific products matching the search query
*ProductApi* | [**storeProduct**](docs/ProductApi.md#storeProduct) | **POST** /products | Store new product
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /products/{productId} | Update specific product

## Documentation for Models

 - [BrandRequest](docs/BrandRequest.md)
 - [BrandResponse](docs/BrandResponse.md)
 - [CategoryRequest](docs/CategoryRequest.md)
 - [CategoryResponse](docs/CategoryResponse.md)
 - [ImageResponse](docs/ImageResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse404](docs/InlineResponse404.md)
 - [InlineResponse4041](docs/InlineResponse4041.md)
 - [InlineResponse405](docs/InlineResponse405.md)
 - [ProductRequest](docs/ProductRequest.md)
 - [ProductResponse](docs/ProductResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### apiAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@testsmith.io
