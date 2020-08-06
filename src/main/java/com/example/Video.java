
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

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
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("likes")
    @Expose
    public Integer likes;
    @SerializedName("views")
    @Expose
    public Integer views;
    @SerializedName("is_liked")
    @Expose
    public Boolean isLiked;

}
