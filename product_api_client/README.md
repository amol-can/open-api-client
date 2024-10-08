# product-service-java-client

OpenAPI definition
- API version: v0
  - Build date: 2022-08-31T13:18:43.362+02:00[Europe/Berlin]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

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
  <groupId>de.c24.giro.client</groupId>
  <artifactId>product-service-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'product-service-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'product-service-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "de.c24.giro.client:product-service-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/product-service-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8181*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminBankResourceApi* | [**append**](docs/AdminBankResourceApi.md#append) | **POST** /api/admin/banks | 
*AdminBankResourceApi* | [**deleteBank**](docs/AdminBankResourceApi.md#deleteBank) | **DELETE** /api/admin/banks/{id} | 
*AdminBankResourceApi* | [**getAllBanks**](docs/AdminBankResourceApi.md#getAllBanks) | **GET** /api/admin/banks | 
*AdminBankResourceApi* | [**getById**](docs/AdminBankResourceApi.md#getById) | **GET** /api/admin/banks/{id} | 
*AdminBankResourceApi* | [**getProductsByBank**](docs/AdminBankResourceApi.md#getProductsByBank) | **GET** /api/admin/banks/{id}/products | 
*AdminBankResourceApi* | [**updateBank**](docs/AdminBankResourceApi.md#updateBank) | **PUT** /api/admin/banks/{id} | 
*AdminProductResourceApi* | [**addProduct**](docs/AdminProductResourceApi.md#addProduct) | **POST** /api/admin/products | 
*AdminProductResourceApi* | [**deleteProduct**](docs/AdminProductResourceApi.md#deleteProduct) | **DELETE** /api/admin/products/{id} | 
*AdminProductResourceApi* | [**updateProduct**](docs/AdminProductResourceApi.md#updateProduct) | **PUT** /api/admin/products/{id} | 
*PublicProductResourceApi* | [**getActiveProducts**](docs/PublicProductResourceApi.md#getActiveProducts) | **GET** /api/products | 
*PublicProductResourceApi* | [**getProductById**](docs/PublicProductResourceApi.md#getProductById) | **GET** /api/products/{id} | 
*PublicProductResourceApi* | [**getProductByKey11**](docs/PublicProductResourceApi.md#getProductByKey11) | **GET** /api/products/{key} | 


## Documentation for Models

 - [AccountFees](docs/AccountFees.md)
 - [AtmWithdrawalFee](docs/AtmWithdrawalFee.md)
 - [Bank](docs/Bank.md)
 - [BankingAppGrades](docs/BankingAppGrades.md)
 - [Bonus](docs/Bonus.md)
 - [CardsFees](docs/CardsFees.md)
 - [CashFees](docs/CashFees.md)
 - [CashWithdrawalConditions](docs/CashWithdrawalConditions.md)
 - [CashWithdrawalInRegion](docs/CashWithdrawalInRegion.md)
 - [Cashback](docs/Cashback.md)
 - [Chip](docs/Chip.md)
 - [CreditCard](docs/CreditCard.md)
 - [DebitCard](docs/DebitCard.md)
 - [Doc](docs/Doc.md)
 - [Fees](docs/Fees.md)
 - [GiroCard](docs/GiroCard.md)
 - [GraduatedMaintenanceFeeEntry](docs/GraduatedMaintenanceFeeEntry.md)
 - [OpeningFees](docs/OpeningFees.md)
 - [Product](docs/Product.md)
 - [SaveBankRequest](docs/SaveBankRequest.md)
 - [SaveProductRequest](docs/SaveProductRequest.md)
 - [SimpleBankView](docs/SimpleBankView.md)
 - [SimpleProductView](docs/SimpleProductView.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



