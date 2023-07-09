package com.bilibili.server.dto;

/**
 * @author kkjz
 * @create 2023-07-07 12:01
 */
public class VideoDto {
    private String videoID;

    private String videoName;

    private String videolookTime;

    private String videoTime;

    private String videoState;

    private String videocAtegory;

    private String videoImage;

    private String videoAddress;

    private String videoCollection;

    private String videoLeaving;

    private String userID;

    private String userName;

    private String videoDescribe;

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

    public String getVideolookTime() {
        return videolookTime;
    }

    public void setVideolookTime(String videolookTime) {
        this.videolookTime = videolookTime;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public String getVideoState() {
        return videoState;
    }

    public void setVideoState(String videoState) {
        this.videoState = videoState;
    }

    public String getVideocAtegory() {
        return videocAtegory;
    }

    public void setVideocAtegory(String videocAtegory) {
        this.videocAtegory = videocAtegory;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public String getVideoCollection() {
        return videoCollection;
    }

    public void setVideoCollection(String videoCollection) {
        this.videoCollection = videoCollection;
    }

    public String getVideoLeaving() {
        return videoLeaving;
    }

    public void setVideoLeaving(String videoLeaving) {
        this.videoLeaving = videoLeaving;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVideoDescribe() {
        return videoDescribe;
    }

    public void setVideoDescribe(String videoDescribe) {
        this.videoDescribe = videoDescribe;
    }

    @Override
    public String toString() {
        return "VideoDto{" +
                "videoID='" + videoID + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videolookTime='" + videolookTime + '\'' +
                ", videoTime='" + videoTime + '\'' +
                ", videoState='" + videoState + '\'' +
                ", videocAtegory='" + videocAtegory + '\'' +
                ", videoImage='" + videoImage + '\'' +
                ", videoAddress='" + videoAddress + '\'' +
                ", videoCollection='" + videoCollection + '\'' +
                ", videoLeaving='" + videoLeaving + '\'' +
                ", userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", videoDescribe='" + videoDescribe + '\'' +
                '}';
    }
}
