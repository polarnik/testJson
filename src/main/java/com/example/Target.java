
package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Target {

    @SerializedName("data")
    @Expose
    public List<Datum> data = null;
    @SerializedName("settings")
    @Expose
    public Settings settings;
    @SerializedName("device")
    @Expose
    public Device device;
    @SerializedName("token")
    @Expose
    public String token;

}
