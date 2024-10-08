/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.c24.giro.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.c24.giro.client.JSON;

/**
 * CashWithdrawalConditions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T13:18:43.362+02:00[Europe/Berlin]")
public class CashWithdrawalConditions {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_NUMBER_OF_ATMS = "numberOfAtms";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ATMS)
  private Integer numberOfAtms;

  /**
   * Gets or Sets atmNetworks
   */
  @JsonAdapter(AtmNetworksEnum.Adapter.class)
  public enum AtmNetworksEnum {
    CASHPOOL("CASHPOOL"),
    
    CASH_GROUP("CASH_GROUP"),
    
    BANKCARD_SERVICENETZ("BANKCARD_SERVICENETZ"),
    
    ING("ING"),
    
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    SPARKASSE("SPARKASSE");

    private String value;

    AtmNetworksEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AtmNetworksEnum fromValue(String value) {
      for (AtmNetworksEnum b : AtmNetworksEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AtmNetworksEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AtmNetworksEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AtmNetworksEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AtmNetworksEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATM_NETWORKS = "atmNetworks";
  @SerializedName(SERIALIZED_NAME_ATM_NETWORKS)
  private Set<AtmNetworksEnum> atmNetworks = null;

  /**
   * Gets or Sets withdrawalFrequency
   */
  @JsonAdapter(WithdrawalFrequencyEnum.Adapter.class)
  public enum WithdrawalFrequencyEnum {
    LIMITED("LIMITED"),
    
    UNLIMITED("UNLIMITED");

    private String value;

    WithdrawalFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WithdrawalFrequencyEnum fromValue(String value) {
      for (WithdrawalFrequencyEnum b : WithdrawalFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WithdrawalFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WithdrawalFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WithdrawalFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WithdrawalFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WITHDRAWAL_FREQUENCY = "withdrawalFrequency";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_FREQUENCY)
  private WithdrawalFrequencyEnum withdrawalFrequency;

  public CashWithdrawalConditions() {
  }

  public CashWithdrawalConditions enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CashWithdrawalConditions numberOfAtms(Integer numberOfAtms) {
    
    this.numberOfAtms = numberOfAtms;
    return this;
  }

   /**
   * Get numberOfAtms
   * @return numberOfAtms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfAtms() {
    return numberOfAtms;
  }


  public void setNumberOfAtms(Integer numberOfAtms) {
    this.numberOfAtms = numberOfAtms;
  }


  public CashWithdrawalConditions atmNetworks(Set<AtmNetworksEnum> atmNetworks) {
    
    this.atmNetworks = atmNetworks;
    return this;
  }

  public CashWithdrawalConditions addAtmNetworksItem(AtmNetworksEnum atmNetworksItem) {
    if (this.atmNetworks == null) {
      this.atmNetworks = new LinkedHashSet<>();
    }
    this.atmNetworks.add(atmNetworksItem);
    return this;
  }

   /**
   * Get atmNetworks
   * @return atmNetworks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<AtmNetworksEnum> getAtmNetworks() {
    return atmNetworks;
  }


  public void setAtmNetworks(Set<AtmNetworksEnum> atmNetworks) {
    this.atmNetworks = atmNetworks;
  }


  public CashWithdrawalConditions withdrawalFrequency(WithdrawalFrequencyEnum withdrawalFrequency) {
    
    this.withdrawalFrequency = withdrawalFrequency;
    return this;
  }

   /**
   * Get withdrawalFrequency
   * @return withdrawalFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WithdrawalFrequencyEnum getWithdrawalFrequency() {
    return withdrawalFrequency;
  }


  public void setWithdrawalFrequency(WithdrawalFrequencyEnum withdrawalFrequency) {
    this.withdrawalFrequency = withdrawalFrequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashWithdrawalConditions cashWithdrawalConditions = (CashWithdrawalConditions) o;
    return Objects.equals(this.enabled, cashWithdrawalConditions.enabled) &&
        Objects.equals(this.numberOfAtms, cashWithdrawalConditions.numberOfAtms) &&
        Objects.equals(this.atmNetworks, cashWithdrawalConditions.atmNetworks) &&
        Objects.equals(this.withdrawalFrequency, cashWithdrawalConditions.withdrawalFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, numberOfAtms, atmNetworks, withdrawalFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashWithdrawalConditions {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    numberOfAtms: ").append(toIndentedString(numberOfAtms)).append("\n");
    sb.append("    atmNetworks: ").append(toIndentedString(atmNetworks)).append("\n");
    sb.append("    withdrawalFrequency: ").append(toIndentedString(withdrawalFrequency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enabled");
    openapiFields.add("numberOfAtms");
    openapiFields.add("atmNetworks");
    openapiFields.add("withdrawalFrequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashWithdrawalConditions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CashWithdrawalConditions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashWithdrawalConditions is not found in the empty JSON string", CashWithdrawalConditions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CashWithdrawalConditions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CashWithdrawalConditions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("atmNetworks") != null && !jsonObj.get("atmNetworks").isJsonNull()) && !jsonObj.get("atmNetworks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `atmNetworks` to be an array in the JSON string but got `%s`", jsonObj.get("atmNetworks").toString()));
      }
      if ((jsonObj.get("withdrawalFrequency") != null && !jsonObj.get("withdrawalFrequency").isJsonNull()) && !jsonObj.get("withdrawalFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withdrawalFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withdrawalFrequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashWithdrawalConditions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashWithdrawalConditions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashWithdrawalConditions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashWithdrawalConditions.class));

       return (TypeAdapter<T>) new TypeAdapter<CashWithdrawalConditions>() {
           @Override
           public void write(JsonWriter out, CashWithdrawalConditions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CashWithdrawalConditions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CashWithdrawalConditions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashWithdrawalConditions
  * @throws IOException if the JSON string is invalid with respect to CashWithdrawalConditions
  */
  public static CashWithdrawalConditions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashWithdrawalConditions.class);
  }

 /**
  * Convert an instance of CashWithdrawalConditions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

