# AdminProductResourceApi

All URIs are relative to *http://localhost:8181*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProduct**](AdminProductResourceApi.md#addProduct) | **POST** /api/admin/products |  |
| [**deleteProduct**](AdminProductResourceApi.md#deleteProduct) | **DELETE** /api/admin/products/{id} |  |
| [**updateProduct**](AdminProductResourceApi.md#updateProduct) | **PUT** /api/admin/products/{id} |  |


<a name="addProduct"></a>
# **addProduct**
> Product addProduct(saveProductRequest)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminProductResourceApi apiInstance = new AdminProductResourceApi(defaultClient);
    SaveProductRequest saveProductRequest = new SaveProductRequest(); // SaveProductRequest | 
    try {
      Product result = apiInstance.addProduct(saveProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminProductResourceApi#addProduct");
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
| **saveProductRequest** | [**SaveProductRequest**](SaveProductRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(id)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminProductResourceApi apiInstance = new AdminProductResourceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteProduct(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminProductResourceApi#deleteProduct");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> Product updateProduct(id, saveProductRequest)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminProductResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminProductResourceApi apiInstance = new AdminProductResourceApi(defaultClient);
    String id = "id_example"; // String | 
    SaveProductRequest saveProductRequest = new SaveProductRequest(); // SaveProductRequest | 
    try {
      Product result = apiInstance.updateProduct(id, saveProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminProductResourceApi#updateProduct");
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
| **saveProductRequest** | [**SaveProductRequest**](SaveProductRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

