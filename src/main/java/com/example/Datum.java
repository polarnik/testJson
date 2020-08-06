
package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("account_id")
    @Expose
    public Integer accountId;
    @SerializedName("project_id")
    @Expose
    public Integer projectId;
    @SerializedName("is_draft")
    @Expose
    public Integer isDraft;
    @SerializedName("is_qr")
    @Expose
    public Integer isQr;
    @SerializedName("is_digital")
    @Expose
    public Integer isDigital;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("comment")
    @Expose
    public String comment;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("tracking_rating")
    @Expose
    public Integer trackingRating;
    @SerializedName("status")
    @Expose
    public Integer status;
    @SerializedName("views")
    @Expose
    public Integer views;
    @SerializedName("viewed_at")
    @Expose
    public String viewedAt;
    @SerializedName("edited_at")
    @Expose
    public String editedAt;
    @SerializedName("edited_by")
    @Expose
    public Integer editedBy;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("created_by")
    @Expose
    public Integer createdBy;
    @SerializedName("uploaded_at")
    @Expose
    public String uploadedAt;
    @SerializedName("content_width")
    @Expose
    public Integer contentWidth;
    @SerializedName("content_height")
    @Expose
    public Integer contentHeight;
    @SerializedName("content_link")
    @Expose
    public String contentLink;
    @SerializedName("content_text")
    @Expose
    public String contentText;
    @SerializedName("content_count")
    @Expose
    public Integer contentCount;
    @SerializedName("is_image_exist")
    @Expose
    public Integer isImageExist;
    @SerializedName("image_width")
    @Expose
    public Object imageWidth;
    @SerializedName("image_height")
    @Expose
    public Object imageHeight;
    @SerializedName("is_button_icon")
    @Expose
    public Integer isButtonIcon;
    @SerializedName("is_comments")
    @Expose
    public Integer isComments;
    @SerializedName("is_comments_public")
    @Expose
    public Integer isCommentsPublic;
    @SerializedName("position_x")
    @Expose
    public Integer positionX;
    @SerializedName("position_y")
    @Expose
    public Integer positionY;
    @SerializedName("position_width")
    @Expose
    public Object positionWidth;
    @SerializedName("position_height")
    @Expose
    public Object positionHeight;
    @SerializedName("poll_likes")
    @Expose
    public Integer pollLikes;
    @SerializedName("poll_dislikes")
    @Expose
    public Integer pollDislikes;
    @SerializedName("opengl")
    @Expose
    public Object opengl;
    @SerializedName("ext")
    @Expose
    public String ext;
    @SerializedName("alphavideo")
    @Expose
    public Integer alphavideo;
    @SerializedName("project_hash")
    @Expose
    public String projectHash;
    @SerializedName("project_title")
    @Expose
    public String projectTitle;
    @SerializedName("project_autoload")
    @Expose
    public Integer projectAutoload;
    @SerializedName("poll_value")
    @Expose
    public Integer pollValue;
    @SerializedName("galleries")
    @Expose
    public List<Gallery> galleries = null;
    @SerializedName("videos")
    @Expose
    public List<Video> videos = null;
    @SerializedName("photos")
    @Expose
    public List<Photo> photos = null;

}
