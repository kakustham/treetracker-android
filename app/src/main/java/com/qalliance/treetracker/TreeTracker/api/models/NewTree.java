package com.qalliance.treetracker.TreeTracker.api.models;

import com.google.gson.annotations.SerializedName;

public class NewTree {
    @SerializedName("user_id")
    private int userId;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lon")
    private double lon;
    @SerializedName("gps_accuracy")
    private int gpsAccuracy;
    @SerializedName("note")
    private String note;
    @SerializedName("timestamp")
    private String timestamp;
    @SerializedName("base_64_image")
    private String base64Image;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getGpsAccuracy() {
        return gpsAccuracy;
    }

    public void setGpsAccuracy(int gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}