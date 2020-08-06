
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Settings {

    @SerializedName("ios_last")
    @Expose
    public Integer iosLast;
    @SerializedName("ios_min")
    @Expose
    public Integer iosMin;
    @SerializedName("android_last")
    @Expose
    public Integer androidLast;
    @SerializedName("android_min")
    @Expose
    public Integer androidMin;

}
