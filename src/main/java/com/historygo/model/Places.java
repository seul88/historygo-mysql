package com.historygo.model;


import javax.persistence.*;

@Entity
@Table(name="places")
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private int points;
    private double rating;
    private int year;
    private int visits;
    private double GPS_N;
    private double GPS_E;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public double getGPS_N() {
        return GPS_N;
    }

    public void setGPS_N(double GPS_N) {
        this.GPS_N = GPS_N;
    }

    public double getGPS_E() {
        return GPS_E;
    }

    public void setGPS_E(double GPS_W) {
        this.GPS_E = GPS_W;
    }
}
