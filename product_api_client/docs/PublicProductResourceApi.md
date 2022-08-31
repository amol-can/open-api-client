# PublicProductResourceApi

All URIs are relative to *http://localhost:8181*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActiveProducts**](PublicProductResourceApi.md#getActiveProducts) | **GET** /api/products |  |
| [**getProductById**](PublicProductResourceApi.md#getProductById) | **GET** /api/products/{id} |  |
| [**getProductByKey11**](PublicProductResourceApi.md#getProductByKey11) | **GET** /api/products/{key} |  |


<a name="getActiveProducts"></a>
# **getActiveProducts**
> List&lt;Product&gt; getActiveProducts()



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.PublicProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    PublicProductResourceApi apiInstance = new PublicProductResourceApi(defaultClient);
    try {
      List<Product> result = apiInstance.getActiveProducts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicProductResourceApi#getActiveProducts");
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

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductById"></a>
# **getProductById**
> Product getProductById(id)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.PublicProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    PublicProductResourceApi apiInstance = new PublicProductResourceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Product result = apiInstance.getProductById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicProductResourceApi#getProductById");
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
| **id** | **String**|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductByKey11"></a>
# **getProductByKey11**
> Product getProductByKey11(key)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.PublicProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    PublicProductResourceApi apiInstance = new PublicProductResourceApi(defaultClient);
    String key = "key_example"; // String | 
    try {
      Product result = apiInstance.getProductByKey11(key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicProductResourceApi#getProductByKey11");
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
| **key** | **String**|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

