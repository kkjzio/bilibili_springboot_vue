package com.bilibili.server.domain;

import java.util.Date;

public class Message {
    private String messageID;

    private String messagevideoID;

    private String messageuserID;

    private String messageuserName;

    private Date messageTime;

    private String message;

    private String messageHand;

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getMessagevideoID() {
        return messagevideoID;
    }

    public void setMessagevideoID(String messagevideoID) {
        this.messagevideoID = messagevideoID;
    }

    public String getMessageuserID() {
        return messageuserID;
    }

    public void setMessageuserID(String messageuserID) {
        this.messageuserID = messageuserID;
    }

    public String getMessageuserName() {
        return messageuserName;
    }

    public void setMessageuserName(String messageuserName) {
        this.messageuserName = messageuserName;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageHand() {
        return messageHand;
    }

    public void setMessageHand(String messageHand) {
        this.messageHand = messageHand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageID=").append(messageID);
        sb.append(", messagevideoID=").append(messagevideoID);
        sb.append(", messageuserID=").append(messageuserID);
        sb.append(", messageuserName=").append(messageuserName);
        sb.append(", messageTime=").append(messageTime);
        sb.append(", message=").append(message);
        sb.append(", messageHand=").append(messageHand);
        sb.append("]");
        return sb.toString();
    }
}