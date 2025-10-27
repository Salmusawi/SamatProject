package org.example.project;


import java.time.LocalDate;
import java.util.Scanner;

public class PlayerService {

    public static void addPlayer(){
        Scanner myObj = new Scanner(System.in);
        long id = getHighestId();
        System.out.println("Enter First Name:");
        String f = myObj.nextLine();
        System.out.println("Enter Last Name");
        String l = myObj.nextLine();
        System.out.println("Enter DOB:");
        String date = myObj.nextLine();
        Player player = new Player(id,f,l, LocalDate.parse(date));
        Player.set.add(player);
    }

    private static long getHighestId(){
        long newId = 1;
        if (!Player.set.isEmpty()) {
            long maxId = 0;
            for (Player p : Player.set) {
                if (p.getId() > maxId) {
                    maxId = p.getId();
                }
            }
            newId = maxId + 1;
        }
        return newId;
    }
}
