package com.bilibili.server.domain;

import java.util.Date;

public class Favourite {
    private Integer favouriteID;

    private String videoID;

    private String videoName;

    private String videoImage;

    private String userID;

    private Date favouriteTime;

    public Integer getFavouriteID() {
        return favouriteID;
    }

    public void setFavouriteID(Integer favouriteID) {
        this.favouriteID = favouriteID;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getFavouriteTime() {
        return favouriteTime;
    }

    public void setFavouriteTime(Date favouriteTime) {
        this.favouriteTime = favouriteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", favouriteID=").append(favouriteID);
        sb.append(", videoID=").append(videoID);
        sb.append(", videoName=").append(videoName);
        sb.append(", videoImage=").append(videoImage);
        sb.append(", userID=").append(userID);
        sb.append(", favouriteTime=").append(favouriteTime);
        sb.append("]");
        return sb.toString();
    }
}