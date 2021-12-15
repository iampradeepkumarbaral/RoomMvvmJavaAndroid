package com.pradeep.roomdatabaseretrofit.Conveter;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pradeep.roomdatabaseretrofit.Modal.Address;
import com.pradeep.roomdatabaseretrofit.Modal.Company;
import com.pradeep.roomdatabaseretrofit.Modal.Geo;

import java.lang.reflect.Type;

public class TypeConveterList {

    @TypeConverter
    public static Address storedStringToMyAddress(String data) {
        Gson gson = new Gson();
       /* if (data == null) {
            return Collections.class(Address);
        }*/
        Type listType = new TypeToken<Address>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String myAddressToStoredString(Address myObjects) {
        Gson gson = new Gson();
        return gson.toJson(myObjects);
    }

    @TypeConverter
    public static Company storedStringToMyCompany(String data) {
        Gson gson = new Gson();
       /* if (data == null) {
            return Collections.emptyList();
        }*/
        Type listType = new TypeToken<Company>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String myGeoToStoredString(Geo myObjects) {
        Gson gson = new Gson();
        return gson.toJson(myObjects);
    }
    @TypeConverter
    public static Geo storedStringToMyGeo(String data) {
        Gson gson = new Gson();
       /* if (data == null) {
            return Collections.emptyList();
        }*/
        Type listType = new TypeToken<Geo>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String myCompanyToStoredString(Company myObjects) {
        Gson gson = new Gson();
        return gson.toJson(myObjects);
    }

}
