package org.example.project;

import java.time.LocalDate;
import java.util.Scanner;


public class Player {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate date;



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
        return ("This is the full name of the player: " +firstName +" "+ lastName);
    }


}
