package org.example.model;

import java.time.LocalDate;


public class Player {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate date;



    public Player(long id, String firstName, String lastName, LocalDate date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public Player() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString(){
        return (id+"  "+firstName+"  "+lastName+"  "+date + "\n");
    }


}
