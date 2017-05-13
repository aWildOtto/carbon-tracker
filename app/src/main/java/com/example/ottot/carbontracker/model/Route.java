package com.example.ottot.carbontracker.model;

/**
 * Created by ottot on 2/24/2017.
 *
 * an object class to hold route data and calculate total distance for route.
 */



public class Route {
    private long routeID;
    private String name;
    private double cityDistance;
    private double highwayDistance;
    private Double totalDistance;


    public Route(String name, double city, double highway){
        this.name = name;
        totalDistance = city+highway;
        cityDistance = city;
        highwayDistance = highway;
    }

    //route
    public Route(long ID, String name, double city, double highway){
        this.name = name;
        routeID = ID;
        totalDistance = city+highway;
        cityDistance = city;
        highwayDistance = highway;
    }



    public double getHighwayDistance() {
        return highwayDistance;
    }

    public double getCityDistance() {
        return cityDistance;
    }

    public void setCityDistance(double cityDistance) {
        this.cityDistance = cityDistance;
    }



    public void setHighwayDistance(double highwayDistance) {
        this.highwayDistance = highwayDistance;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRouteID() {
        return routeID;
    }

    //total distance string description
    public String getRouteDescription(){
        String descr = ""+name+"\ntotal distance: "+totalDistance+" km";
        return descr;
    }
}
