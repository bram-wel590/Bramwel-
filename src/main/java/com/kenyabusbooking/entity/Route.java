package com.kenyabusbooking.entity;

public class Route {
    private int routeId;
    private String startLocation;
    private String endLocation;
    private double distance;
    private int duration;
    private String status;

    public Route(int routeId, String startLocation, String endLocation, double distance, int duration, String status) {
        this.routeId = routeId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.duration = duration;
        this.status = status;
    }

    // Getters and Setters
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}