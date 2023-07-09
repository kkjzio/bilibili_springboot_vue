package com.bilibili.server.domain;

public class User {
    private String userID;

    private String userMingzi;

    private String userName;

    private String usersex;

    private String passWord;

    private String userHand;

    private String userAddress;

    private String userPhone;

    private String userQQ;

    private String userEmial;

    private String userCollection;

    private String useryinghangka;

    private String userState;

    private String userLoginTime;

    private String userIP;

    private String userPaypassword;

    private String userRMB;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserMingzi() {
        return userMingzi;
    }

    public void setUserMingzi(String userMingzi) {
        this.userMingzi = userMingzi;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserHand() {
        return userHand;
    }

    public void setUserHand(String userHand) {
        this.userHand = userHand;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserEmial() {
        return userEmial;
    }

    public void setUserEmial(String userEmial) {
        this.userEmial = userEmial;
    }

    public String getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(String userCollection) {
        this.userCollection = userCollection;
    }

    public String getUseryinghangka() {
        return useryinghangka;
    }

    public void setUseryinghangka(String useryinghangka) {
        this.useryinghangka = useryinghangka;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserIP() {
        return userIP;
    }

    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    public String getUserPaypassword() {
        return userPaypassword;
    }

    public void setUserPaypassword(String userPaypassword) {
        this.userPaypassword = userPaypassword;
    }

    public String getUserRMB() {
        return userRMB;
    }

    public void setUserRMB(String userRMB) {
        this.userRMB = userRMB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userID=").append(userID);
        sb.append(", userMingzi=").append(userMingzi);
        sb.append(", userName=").append(userName);
        sb.append(", usersex=").append(usersex);
        sb.append(", passWord=").append(passWord);
        sb.append(", userHand=").append(userHand);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userQQ=").append(userQQ);
        sb.append(", userEmial=").append(userEmial);
        sb.append(", userCollection=").append(userCollection);
        sb.append(", useryinghangka=").append(useryinghangka);
        sb.append(", userState=").append(userState);
        sb.append(", userLoginTime=").append(userLoginTime);
        sb.append(", userIP=").append(userIP);
        sb.append(", userPaypassword=").append(userPaypassword);
        sb.append(", userRMB=").append(userRMB);
        sb.append("]");
        return sb.toString();
    }
}