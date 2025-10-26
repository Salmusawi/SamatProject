package org.example.project;


import java.time.LocalDate;
import java.util.Scanner;

public class PlayerService {

    public static void addPlayer(long id , String firstName , String lastName, String Date){
        Scanner myObj = new Scanner(System.in);
        Player p1 = new Player();
        System.out.println("write an id");
        id = myObj.nextInt();
        p1.setId(id);
        System.out.println("write the first name:");
        firstName = myObj.nextLine();
        p1.setFirstName(firstName);
        System.out.println("write the last name:");
        lastName = myObj.nextLine();
        p1.setLastName(lastName);
        System.out.println("write the last name:");
        String date = myObj.nextLine();
        p1.setDate(LocalDate.parse(date));

    }
}
