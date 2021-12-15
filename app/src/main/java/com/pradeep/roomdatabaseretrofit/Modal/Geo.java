package com.pradeep.roomdatabaseretrofit.Modal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Geo", indices = @Index(value = {"id"},unique = true))
public class Geo {
    @PrimaryKey(autoGenerate = true)
    private int geoId;

    @SerializedName("lat")
    @ColumnInfo(name = "lat")
    @Expose
    private String lat;

    @SerializedName("lng")
    @ColumnInfo(name = "lng")
    @Expose
    private String lng;

    public int getGeoId() {
        return geoId;
    }

    public void setGeoId(int geoId) {
        this.geoId = geoId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
