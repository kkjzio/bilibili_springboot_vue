package com.bilibili.server.dto;

/**
 * @author kkjz
 * @create 2023-07-07 9:36
 */
public class BannerDto {
    String videoID;
    String destrible;
    String imageUrl;
    String Url;

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getDestrible() {
        return destrible;
    }

    public void setDestrible(String destrible) {
        this.destrible = destrible;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
