package org.example.model;

import java.util.List;

public class Team {
    private long id;
    private String name;
    private String country;
    private String city;
    private List<Player> players; //this is not 100% i'll wait for instructor

    public Team(long id, String name, String country, String city) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
    }
    public Team(){}

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
