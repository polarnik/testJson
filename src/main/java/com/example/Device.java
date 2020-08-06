
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public Object name;
    @SerializedName("edited_at")
    @Expose
    public Object editedAt;

}
