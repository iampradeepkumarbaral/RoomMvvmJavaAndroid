package com.pradeep.roomdatabaseretrofit.Modal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Company", indices = @Index(value = {"id"},unique = true))
public class Company {
    @PrimaryKey(autoGenerate = true)
    private int companyId;

    @SerializedName("name")
    @ColumnInfo(name = "name")
    @Expose
    private String name;

    @SerializedName("catchPhrase")
    @ColumnInfo(name = "catchPhrase")
    @Expose
    private String catchPhrase;

    @SerializedName("bs")
    @ColumnInfo(name = "bs")
    @Expose
    private String bs;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
