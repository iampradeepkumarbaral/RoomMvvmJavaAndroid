package com.pradeep.roomdatabaseretrofit.Modal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pradeep.roomdatabaseretrofit.Conveter.TypeConveterList;


@Entity(tableName = "UserDetail", indices = @Index(value = {"id"},unique = true))
public class UserDetail {
    @PrimaryKey(autoGenerate = true)
    private int userId;

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @Expose
    private Integer id;

    @SerializedName("name")
    @ColumnInfo(name = "name")
    @Expose
    private String name;

    @SerializedName("username")
    @ColumnInfo(name = "username")
    @Expose
    private String username;

    @SerializedName("email")
    @ColumnInfo(name = "email")
    @Expose
    private String email;


    @SerializedName("address")
    @ColumnInfo(name = "address")
    @TypeConverters(TypeConveterList.class)
    private Address address;


    @SerializedName("company")
    @ColumnInfo(name = "company")
    @TypeConverters(TypeConveterList.class)
    private Company company;

    @SerializedName("phone")
    @ColumnInfo(name = "phone")
    @Expose
    private String phone;

    @SerializedName("website")
    @ColumnInfo(name = "website")
    @Expose
    private String website;




    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}
