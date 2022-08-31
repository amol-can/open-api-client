# AdminBankResourceApi

All URIs are relative to *http://localhost:8181*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**append**](AdminBankResourceApi.md#append) | **POST** /api/admin/banks |  |
| [**deleteBank**](AdminBankResourceApi.md#deleteBank) | **DELETE** /api/admin/banks/{id} |  |
| [**getAllBanks**](AdminBankResourceApi.md#getAllBanks) | **GET** /api/admin/banks |  |
| [**getById**](AdminBankResourceApi.md#getById) | **GET** /api/admin/banks/{id} |  |
| [**getProductsByBank**](AdminBankResourceApi.md#getProductsByBank) | **GET** /api/admin/banks/{id}/products |  |
| [**updateBank**](AdminBankResourceApi.md#updateBank) | **PUT** /api/admin/banks/{id} |  |


<a name="append"></a>
# **append**
> Bank append(saveBankRequest)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    SaveBankRequest saveBankRequest = new SaveBankRequest(); // SaveBankRequest | 
    try {
      Bank result = apiInstance.append(saveBankRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#append");
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
| **saveBankRequest** | [**SaveBankRequest**](SaveBankRequest.md)|  | |

### Return type

[**Bank**](Bank.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteBank"></a>
# **deleteBank**
> deleteBank(id)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteBank(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#deleteBank");
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

<a name="getAllBanks"></a>
# **getAllBanks**
> List&lt;SimpleBankView&gt; getAllBanks()



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    try {
      List<SimpleBankView> result = apiInstance.getAllBanks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#getAllBanks");
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

[**List&lt;SimpleBankView&gt;**](SimpleBankView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> Bank getById(id)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Bank result = apiInstance.getById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#getById");
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

[**Bank**](Bank.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductsByBank"></a>
# **getProductsByBank**
> List&lt;SimpleProductView&gt; getProductsByBank(id)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      List<SimpleProductView> result = apiInstance.getProductsByBank(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#getProductsByBank");
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

[**List&lt;SimpleProductView&gt;**](SimpleProductView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateBank"></a>
# **updateBank**
> Bank updateBank(id, saveBankRequest)



### Example
```java
// Import classes:
import de.c24.giro.client.ApiClient;
import de.c24.giro.client.ApiException;
import de.c24.giro.client.Configuration;
import de.c24.giro.client.models.*;
import de.c24.giro.client.api.AdminBankResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8181");

    AdminBankResourceApi apiInstance = new AdminBankResourceApi(defaultClient);
    String id = "id_example"; // String | 
    SaveBankRequest saveBankRequest = new SaveBankRequest(); // SaveBankRequest | 
    try {
      Bank result = apiInstance.updateBank(id, saveBankRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminBankResourceApi#updateBank");
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
| **saveBankRequest** | [**SaveBankRequest**](SaveBankRequest.md)|  | |

### Return type

[**Bank**](Bank.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

