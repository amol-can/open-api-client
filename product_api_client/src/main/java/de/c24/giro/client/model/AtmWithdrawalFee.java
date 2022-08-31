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
 * AtmWithdrawalFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T13:18:43.362+02:00[Europe/Berlin]")
public class AtmWithdrawalFee {
  public static final String SERIALIZED_NAME_GIRO_CARD = "giroCard";
  @SerializedName(SERIALIZED_NAME_GIRO_CARD)
  private Float giroCard;

  public static final String SERIALIZED_NAME_DEBIT_CARD = "debitCard";
  @SerializedName(SERIALIZED_NAME_DEBIT_CARD)
  private Float debitCard;

  public static final String SERIALIZED_NAME_CREDIT_CARD = "creditCard";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD)
  private Float creditCard;

  public AtmWithdrawalFee() {
  }

  public AtmWithdrawalFee giroCard(Float giroCard) {
    
    this.giroCard = giroCard;
    return this;
  }

   /**
   * Get giroCard
   * @return giroCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getGiroCard() {
    return giroCard;
  }


  public void setGiroCard(Float giroCard) {
    this.giroCard = giroCard;
  }


  public AtmWithdrawalFee debitCard(Float debitCard) {
    
    this.debitCard = debitCard;
    return this;
  }

   /**
   * Get debitCard
   * @return debitCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getDebitCard() {
    return debitCard;
  }


  public void setDebitCard(Float debitCard) {
    this.debitCard = debitCard;
  }


  public AtmWithdrawalFee creditCard(Float creditCard) {
    
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getCreditCard() {
    return creditCard;
  }


  public void setCreditCard(Float creditCard) {
    this.creditCard = creditCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtmWithdrawalFee atmWithdrawalFee = (AtmWithdrawalFee) o;
    return Objects.equals(this.giroCard, atmWithdrawalFee.giroCard) &&
        Objects.equals(this.debitCard, atmWithdrawalFee.debitCard) &&
        Objects.equals(this.creditCard, atmWithdrawalFee.creditCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giroCard, debitCard, creditCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtmWithdrawalFee {\n");
    sb.append("    giroCard: ").append(toIndentedString(giroCard)).append("\n");
    sb.append("    debitCard: ").append(toIndentedString(debitCard)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
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
    openapiFields.add("giroCard");
    openapiFields.add("debitCard");
    openapiFields.add("creditCard");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AtmWithdrawalFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AtmWithdrawalFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AtmWithdrawalFee is not found in the empty JSON string", AtmWithdrawalFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AtmWithdrawalFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AtmWithdrawalFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AtmWithdrawalFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AtmWithdrawalFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AtmWithdrawalFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AtmWithdrawalFee.class));

       return (TypeAdapter<T>) new TypeAdapter<AtmWithdrawalFee>() {
           @Override
           public void write(JsonWriter out, AtmWithdrawalFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AtmWithdrawalFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AtmWithdrawalFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AtmWithdrawalFee
  * @throws IOException if the JSON string is invalid with respect to AtmWithdrawalFee
  */
  public static AtmWithdrawalFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AtmWithdrawalFee.class);
  }

 /**
  * Convert an instance of AtmWithdrawalFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

