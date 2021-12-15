package com.pradeep.roomdatabaseretrofit.Modal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pradeep.roomdatabaseretrofit.Conveter.TypeConveterList;

@Entity(tableName = "Address", indices = @Index(value = {"id"},unique = true))
public class Address {
    @PrimaryKey(autoGenerate = true)
    private int addressId;

    @SerializedName("street")
    @ColumnInfo(name = "street")
    @Expose
    private String street;


    @SerializedName("suite")
    @ColumnInfo(name = "suite")
    @Expose
    private String suite;


    @SerializedName("city")
    @ColumnInfo(name = "city")
    @Expose
    private String city;

    @SerializedName("zipcode")
    @ColumnInfo(name = "zipcode")
    @Expose
    private String zipcode;

    @SerializedName("geo")
    @ColumnInfo(name = "geo")
    @Expose
    @TypeConverters(TypeConveterList.class)
    private Geo geo;


    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
