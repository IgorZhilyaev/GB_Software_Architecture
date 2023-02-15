# CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCloudById**](CloudsApi.md#cancelCloudById) | **DELETE** /clouds/{cloud_id} | Метод отмены заказа по ID
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Метод создания заказа на облако
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получения списка ресурсов на облако
[**getCloudById**](CloudsApi.md#getCloudById) | **GET** /clouds/{cloud_id} | Метод получения заказа на облако по ID

<a name="cancelCloudById"></a>
# **cancelCloudById**
> cancelCloudById(cloudId)

Метод отмены заказа по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Иденьтфикатор заказа облака
try {
    apiInstance.cancelCloudById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#cancelCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Иденьтфикатор заказа облака |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, adplication/json

<a name="createCloud"></a>
# **createCloud**
> Cloud createCloud(body)

Метод создания заказа на облако

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
Error body = new Error(); // Error | 
try {
    Cloud result = apiInstance.createCloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  |

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: adplication/json
 - **Accept**: adplication/json, application/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Resources getAllClouds()

Метод получения списка ресурсов на облако

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Resources result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Resources**](Resources.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json, application/json

<a name="getCloudById"></a>
# **getCloudById**
> Clouds getCloudById(cloudId)

Метод получения заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    Clouds result = apiInstance.getCloudById(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json, application/json

