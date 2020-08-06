
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gallery {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("target_id")
    @Expose
    public Integer targetId;
    @SerializedName("project_id")
    @Expose
    public Integer projectId;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("ext")
    @Expose
    public String ext;

}
