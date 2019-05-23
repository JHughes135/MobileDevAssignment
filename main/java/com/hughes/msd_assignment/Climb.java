package com.hughes.msd_assignment;

/**
 * Created by hughe on 07/11/2018.
 */

public class Climb {

    public String name;
    public String location;
    public int distance;
    public int totelevation;
    public int baseelev;
    public int maxelev;
    public int avggrad;
    public int steepestgrad;


    public Climb(String name, String location, int distance, int totelevation, int baseelev, int maxelev, int avggrad, int steepestgrad) {

        this.name = name;
        this.location = location;
        this.distance = distance;
        this.totelevation = totelevation;
        this.baseelev = baseelev;
        this.maxelev = maxelev;
        this.avggrad = avggrad;
        this.steepestgrad = steepestgrad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTotelevation() {
        return totelevation;
    }

    public void setTotelevation(int totelevation) {
        this.totelevation = totelevation;
    }

    public int getBaseelev() {
        return baseelev;
    }

    public void setBaseelev(int baseelev) {
        this.baseelev = baseelev;
    }

    public int getMaxelev() {
        return maxelev;
    }

    public void setMaxelev(int maxelev) {
        this.maxelev = maxelev;
    }

    public int getAvggrad() {
        return avggrad;
    }

    public void setAvggrad(int avggrad) {
        this.avggrad = avggrad;
    }

    public int getSteepestgrad() {
        return steepestgrad;
    }

    public void setSteepestgrad(int steepestgrad) {
        this.steepestgrad = steepestgrad;
    }
}
