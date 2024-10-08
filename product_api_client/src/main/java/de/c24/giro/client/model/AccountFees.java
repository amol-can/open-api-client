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
import de.c24.giro.client.model.GraduatedMaintenanceFeeEntry;
import de.c24.giro.client.model.OpeningFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AccountFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T13:18:43.362+02:00[Europe/Berlin]")
public class AccountFees {
  public static final String SERIALIZED_NAME_FIXED_MAINTENANCE = "fixedMaintenance";
  @SerializedName(SERIALIZED_NAME_FIXED_MAINTENANCE)
  private Float fixedMaintenance;

  public static final String SERIALIZED_NAME_GRADUATED_MAINTENANCE = "graduatedMaintenance";
  @SerializedName(SERIALIZED_NAME_GRADUATED_MAINTENANCE)
  private List<GraduatedMaintenanceFeeEntry> graduatedMaintenance = null;

  public static final String SERIALIZED_NAME_PERMANENTLY_FREE = "permanentlyFree";
  @SerializedName(SERIALIZED_NAME_PERMANENTLY_FREE)
  private Boolean permanentlyFree;

  public static final String SERIALIZED_NAME_OVERDRAFT_INTEREST = "overdraftInterest";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_INTEREST)
  private Float overdraftInterest;

  public static final String SERIALIZED_NAME_OPENING_FEES = "openingFees";
  @SerializedName(SERIALIZED_NAME_OPENING_FEES)
  private OpeningFees openingFees;

  public static final String SERIALIZED_NAME_CUSTODY_FEE_FOR_CREDIT = "custodyFeeForCredit";
  @SerializedName(SERIALIZED_NAME_CUSTODY_FEE_FOR_CREDIT)
  private Float custodyFeeForCredit;

  public AccountFees() {
  }

  public AccountFees fixedMaintenance(Float fixedMaintenance) {
    
    this.fixedMaintenance = fixedMaintenance;
    return this;
  }

   /**
   * Get fixedMaintenance
   * @return fixedMaintenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getFixedMaintenance() {
    return fixedMaintenance;
  }


  public void setFixedMaintenance(Float fixedMaintenance) {
    this.fixedMaintenance = fixedMaintenance;
  }


  public AccountFees graduatedMaintenance(List<GraduatedMaintenanceFeeEntry> graduatedMaintenance) {
    
    this.graduatedMaintenance = graduatedMaintenance;
    return this;
  }

  public AccountFees addGraduatedMaintenanceItem(GraduatedMaintenanceFeeEntry graduatedMaintenanceItem) {
    if (this.graduatedMaintenance == null) {
      this.graduatedMaintenance = new ArrayList<>();
    }
    this.graduatedMaintenance.add(graduatedMaintenanceItem);
    return this;
  }

   /**
   * Get graduatedMaintenance
   * @return graduatedMaintenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GraduatedMaintenanceFeeEntry> getGraduatedMaintenance() {
    return graduatedMaintenance;
  }


  public void setGraduatedMaintenance(List<GraduatedMaintenanceFeeEntry> graduatedMaintenance) {
    this.graduatedMaintenance = graduatedMaintenance;
  }


  public AccountFees permanentlyFree(Boolean permanentlyFree) {
    
    this.permanentlyFree = permanentlyFree;
    return this;
  }

   /**
   * Get permanentlyFree
   * @return permanentlyFree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPermanentlyFree() {
    return permanentlyFree;
  }


  public void setPermanentlyFree(Boolean permanentlyFree) {
    this.permanentlyFree = permanentlyFree;
  }


  public AccountFees overdraftInterest(Float overdraftInterest) {
    
    this.overdraftInterest = overdraftInterest;
    return this;
  }

   /**
   * Get overdraftInterest
   * @return overdraftInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getOverdraftInterest() {
    return overdraftInterest;
  }


  public void setOverdraftInterest(Float overdraftInterest) {
    this.overdraftInterest = overdraftInterest;
  }


  public AccountFees openingFees(OpeningFees openingFees) {
    
    this.openingFees = openingFees;
    return this;
  }

   /**
   * Get openingFees
   * @return openingFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpeningFees getOpeningFees() {
    return openingFees;
  }


  public void setOpeningFees(OpeningFees openingFees) {
    this.openingFees = openingFees;
  }


  public AccountFees custodyFeeForCredit(Float custodyFeeForCredit) {
    
    this.custodyFeeForCredit = custodyFeeForCredit;
    return this;
  }

   /**
   * Get custodyFeeForCredit
   * @return custodyFeeForCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getCustodyFeeForCredit() {
    return custodyFeeForCredit;
  }


  public void setCustodyFeeForCredit(Float custodyFeeForCredit) {
    this.custodyFeeForCredit = custodyFeeForCredit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFees accountFees = (AccountFees) o;
    return Objects.equals(this.fixedMaintenance, accountFees.fixedMaintenance) &&
        Objects.equals(this.graduatedMaintenance, accountFees.graduatedMaintenance) &&
        Objects.equals(this.permanentlyFree, accountFees.permanentlyFree) &&
        Objects.equals(this.overdraftInterest, accountFees.overdraftInterest) &&
        Objects.equals(this.openingFees, accountFees.openingFees) &&
        Objects.equals(this.custodyFeeForCredit, accountFees.custodyFeeForCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedMaintenance, graduatedMaintenance, permanentlyFree, overdraftInterest, openingFees, custodyFeeForCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFees {\n");
    sb.append("    fixedMaintenance: ").append(toIndentedString(fixedMaintenance)).append("\n");
    sb.append("    graduatedMaintenance: ").append(toIndentedString(graduatedMaintenance)).append("\n");
    sb.append("    permanentlyFree: ").append(toIndentedString(permanentlyFree)).append("\n");
    sb.append("    overdraftInterest: ").append(toIndentedString(overdraftInterest)).append("\n");
    sb.append("    openingFees: ").append(toIndentedString(openingFees)).append("\n");
    sb.append("    custodyFeeForCredit: ").append(toIndentedString(custodyFeeForCredit)).append("\n");
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
    openapiFields.add("fixedMaintenance");
    openapiFields.add("graduatedMaintenance");
    openapiFields.add("permanentlyFree");
    openapiFields.add("overdraftInterest");
    openapiFields.add("openingFees");
    openapiFields.add("custodyFeeForCredit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountFees
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountFees.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountFees is not found in the empty JSON string", AccountFees.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountFees.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountFees` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygraduatedMaintenance = jsonObj.getAsJsonArray("graduatedMaintenance");
      if (jsonArraygraduatedMaintenance != null) {
        // ensure the json data is an array
        if (!jsonObj.get("graduatedMaintenance").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `graduatedMaintenance` to be an array in the JSON string but got `%s`", jsonObj.get("graduatedMaintenance").toString()));
        }

        // validate the optional field `graduatedMaintenance` (array)
        for (int i = 0; i < jsonArraygraduatedMaintenance.size(); i++) {
          GraduatedMaintenanceFeeEntry.validateJsonObject(jsonArraygraduatedMaintenance.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `openingFees`
      if (jsonObj.get("openingFees") != null && !jsonObj.get("openingFees").isJsonNull()) {
        OpeningFees.validateJsonObject(jsonObj.getAsJsonObject("openingFees"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountFees.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountFees' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountFees> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountFees.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountFees>() {
           @Override
           public void write(JsonWriter out, AccountFees value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountFees read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountFees given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountFees
  * @throws IOException if the JSON string is invalid with respect to AccountFees
  */
  public static AccountFees fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountFees.class);
  }

 /**
  * Convert an instance of AccountFees to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

