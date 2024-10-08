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
 * SaveBankRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T13:18:43.362+02:00[Europe/Berlin]")
public class SaveBankRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_API_SERVER_ID = "apiServerId";
  @SerializedName(SERIALIZED_NAME_API_SERVER_ID)
  private Long apiServerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOGO_FILE_NAME = "logoFileName";
  @SerializedName(SERIALIZED_NAME_LOGO_FILE_NAME)
  private String logoFileName;

  public static final String SERIALIZED_NAME_BLZ = "blz";
  @SerializedName(SERIALIZED_NAME_BLZ)
  private String blz;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  /**
   * Gets or Sets types
   */
  @JsonAdapter(TypesEnum.Adapter.class)
  public enum TypesEnum {
    REGIONAL("REGIONAL"),
    
    NATIONAL("NATIONAL"),
    
    DIRECT_BANK("DIRECT_BANK"),
    
    FILIAL_BANK("FILIAL_BANK"),
    
    SMARTPHONE_BANK("SMARTPHONE_BANK");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypesEnum fromValue(String value) {
      for (TypesEnum b : TypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<TypesEnum> types = null;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HOME_PAGE = "homePage";
  @SerializedName(SERIALIZED_NAME_HOME_PAGE)
  private String homePage;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LEGAL_ADDRESS = "legalAddress";
  @SerializedName(SERIALIZED_NAME_LEGAL_ADDRESS)
  private String legalAddress;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private String contactAddress;

  public static final String SERIALIZED_NAME_LEGAL_FORM = "legalForm";
  @SerializedName(SERIALIZED_NAME_LEGAL_FORM)
  private String legalForm;

  public static final String SERIALIZED_NAME_YEAR_FOUNDED = "yearFounded";
  @SerializedName(SERIALIZED_NAME_YEAR_FOUNDED)
  private Integer yearFounded;

  public static final String SERIALIZED_NAME_SEO_NAME = "seoName";
  @SerializedName(SERIALIZED_NAME_SEO_NAME)
  private String seoName;

  public static final String SERIALIZED_NAME_ACTIVE_FOR_SEO = "activeForSeo";
  @SerializedName(SERIALIZED_NAME_ACTIVE_FOR_SEO)
  private Boolean activeForSeo;

  public SaveBankRequest() {
  }

  public SaveBankRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SaveBankRequest apiServerId(Long apiServerId) {
    
    this.apiServerId = apiServerId;
    return this;
  }

   /**
   * Get apiServerId
   * @return apiServerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getApiServerId() {
    return apiServerId;
  }


  public void setApiServerId(Long apiServerId) {
    this.apiServerId = apiServerId;
  }


  public SaveBankRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SaveBankRequest logoFileName(String logoFileName) {
    
    this.logoFileName = logoFileName;
    return this;
  }

   /**
   * Get logoFileName
   * @return logoFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoFileName() {
    return logoFileName;
  }


  public void setLogoFileName(String logoFileName) {
    this.logoFileName = logoFileName;
  }


  public SaveBankRequest blz(String blz) {
    
    this.blz = blz;
    return this;
  }

   /**
   * Get blz
   * @return blz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlz() {
    return blz;
  }


  public void setBlz(String blz) {
    this.blz = blz;
  }


  public SaveBankRequest bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  public SaveBankRequest types(Set<TypesEnum> types) {
    
    this.types = types;
    return this;
  }

  public SaveBankRequest addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new LinkedHashSet<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<TypesEnum> getTypes() {
    return types;
  }


  public void setTypes(Set<TypesEnum> types) {
    this.types = types;
  }


  public SaveBankRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public SaveBankRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SaveBankRequest homePage(String homePage) {
    
    this.homePage = homePage;
    return this;
  }

   /**
   * Get homePage
   * @return homePage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHomePage() {
    return homePage;
  }


  public void setHomePage(String homePage) {
    this.homePage = homePage;
  }


  public SaveBankRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SaveBankRequest legalAddress(String legalAddress) {
    
    this.legalAddress = legalAddress;
    return this;
  }

   /**
   * Get legalAddress
   * @return legalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegalAddress() {
    return legalAddress;
  }


  public void setLegalAddress(String legalAddress) {
    this.legalAddress = legalAddress;
  }


  public SaveBankRequest contactAddress(String contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactAddress() {
    return contactAddress;
  }


  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }


  public SaveBankRequest legalForm(String legalForm) {
    
    this.legalForm = legalForm;
    return this;
  }

   /**
   * Get legalForm
   * @return legalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegalForm() {
    return legalForm;
  }


  public void setLegalForm(String legalForm) {
    this.legalForm = legalForm;
  }


  public SaveBankRequest yearFounded(Integer yearFounded) {
    
    this.yearFounded = yearFounded;
    return this;
  }

   /**
   * Get yearFounded
   * @return yearFounded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getYearFounded() {
    return yearFounded;
  }


  public void setYearFounded(Integer yearFounded) {
    this.yearFounded = yearFounded;
  }


  public SaveBankRequest seoName(String seoName) {
    
    this.seoName = seoName;
    return this;
  }

   /**
   * Get seoName
   * @return seoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeoName() {
    return seoName;
  }


  public void setSeoName(String seoName) {
    this.seoName = seoName;
  }


  public SaveBankRequest activeForSeo(Boolean activeForSeo) {
    
    this.activeForSeo = activeForSeo;
    return this;
  }

   /**
   * Get activeForSeo
   * @return activeForSeo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActiveForSeo() {
    return activeForSeo;
  }


  public void setActiveForSeo(Boolean activeForSeo) {
    this.activeForSeo = activeForSeo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveBankRequest saveBankRequest = (SaveBankRequest) o;
    return Objects.equals(this.id, saveBankRequest.id) &&
        Objects.equals(this.apiServerId, saveBankRequest.apiServerId) &&
        Objects.equals(this.name, saveBankRequest.name) &&
        Objects.equals(this.logoFileName, saveBankRequest.logoFileName) &&
        Objects.equals(this.blz, saveBankRequest.blz) &&
        Objects.equals(this.bic, saveBankRequest.bic) &&
        Objects.equals(this.types, saveBankRequest.types) &&
        Objects.equals(this.phone, saveBankRequest.phone) &&
        Objects.equals(this.email, saveBankRequest.email) &&
        Objects.equals(this.homePage, saveBankRequest.homePage) &&
        Objects.equals(this.description, saveBankRequest.description) &&
        Objects.equals(this.legalAddress, saveBankRequest.legalAddress) &&
        Objects.equals(this.contactAddress, saveBankRequest.contactAddress) &&
        Objects.equals(this.legalForm, saveBankRequest.legalForm) &&
        Objects.equals(this.yearFounded, saveBankRequest.yearFounded) &&
        Objects.equals(this.seoName, saveBankRequest.seoName) &&
        Objects.equals(this.activeForSeo, saveBankRequest.activeForSeo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiServerId, name, logoFileName, blz, bic, types, phone, email, homePage, description, legalAddress, contactAddress, legalForm, yearFounded, seoName, activeForSeo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveBankRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiServerId: ").append(toIndentedString(apiServerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logoFileName: ").append(toIndentedString(logoFileName)).append("\n");
    sb.append("    blz: ").append(toIndentedString(blz)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legalAddress: ").append(toIndentedString(legalAddress)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    yearFounded: ").append(toIndentedString(yearFounded)).append("\n");
    sb.append("    seoName: ").append(toIndentedString(seoName)).append("\n");
    sb.append("    activeForSeo: ").append(toIndentedString(activeForSeo)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("apiServerId");
    openapiFields.add("name");
    openapiFields.add("logoFileName");
    openapiFields.add("blz");
    openapiFields.add("bic");
    openapiFields.add("types");
    openapiFields.add("phone");
    openapiFields.add("email");
    openapiFields.add("homePage");
    openapiFields.add("description");
    openapiFields.add("legalAddress");
    openapiFields.add("contactAddress");
    openapiFields.add("legalForm");
    openapiFields.add("yearFounded");
    openapiFields.add("seoName");
    openapiFields.add("activeForSeo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SaveBankRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SaveBankRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveBankRequest is not found in the empty JSON string", SaveBankRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SaveBankRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveBankRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SaveBankRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("logoFileName") != null && !jsonObj.get("logoFileName").isJsonNull()) && !jsonObj.get("logoFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoFileName").toString()));
      }
      if ((jsonObj.get("blz") != null && !jsonObj.get("blz").isJsonNull()) && !jsonObj.get("blz").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blz` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blz").toString()));
      }
      if ((jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonNull()) && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull()) && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("homePage") != null && !jsonObj.get("homePage").isJsonNull()) && !jsonObj.get("homePage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homePage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homePage").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("legalAddress") != null && !jsonObj.get("legalAddress").isJsonNull()) && !jsonObj.get("legalAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalAddress").toString()));
      }
      if ((jsonObj.get("contactAddress") != null && !jsonObj.get("contactAddress").isJsonNull()) && !jsonObj.get("contactAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactAddress").toString()));
      }
      if ((jsonObj.get("legalForm") != null && !jsonObj.get("legalForm").isJsonNull()) && !jsonObj.get("legalForm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalForm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalForm").toString()));
      }
      if ((jsonObj.get("seoName") != null && !jsonObj.get("seoName").isJsonNull()) && !jsonObj.get("seoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seoName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveBankRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveBankRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveBankRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveBankRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveBankRequest>() {
           @Override
           public void write(JsonWriter out, SaveBankRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveBankRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SaveBankRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SaveBankRequest
  * @throws IOException if the JSON string is invalid with respect to SaveBankRequest
  */
  public static SaveBankRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveBankRequest.class);
  }

 /**
  * Convert an instance of SaveBankRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

