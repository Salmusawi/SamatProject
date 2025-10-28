package org.example.service;


import org.example.model.Player;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlayerService {
    private final static Set<Player> PlayerSet = new HashSet<>();

    public static void addPlayer(){
        Scanner myObj = new Scanner(System.in);
        long id = getHighestId();
        System.out.println("Enter First Name:");
        String f = myObj.nextLine().trim();
        System.out.println("Enter Last Name");
        String l = myObj.nextLine().trim();
        System.out.println("Enter DOB:");
        String date = myObj.nextLine();
        if (date.isEmpty()){
            System.out.println("invalid date input ");
            return;
        }

        Player player = new Player();
        if (PlayerService.nameValidator(f,l)){
            player.setId(id);
            player.setFirstName(f);
            player.setLastName(l);
            player.setDate(LocalDate.parse(date));
            PlayerSet.add(player);
        }
        else{
            System.out.println("name is wrong bruh");
            return;
        }

    }
    public static void print(){
        for (Player p: PlayerSet){
            System.out.println(p.getId() + "    "+p.getFirstName()+"    " + p.getLastName()+ "  "+ p.getDate() + "\n");
        }
    }

    private static long getHighestId(){
        long newId = 1;
        if (!PlayerSet.isEmpty()) {
            long maxId = 0;
            for (Player p : PlayerSet) {
                if (p.getId() > maxId) {
                    maxId = p.getId();
                }
            }
            newId = maxId + 1;
        }
        return newId;
    }

    public static boolean removeById(long id){
        return PlayerSet.remove(findById(id));
    }

    private static Player findById(long id){
        for(Player p : PlayerSet){
           if (p.getId() == id){
               return p;
           }
        }
        return null;
    }

    private static boolean nameValidator(String firstName, String lastName){

        for(Player p: PlayerSet){
            String fullName = firstName +" "+ lastName;
            String playerFullName = p.getFirstName() + " "+p.getLastName();
            if (playerFullName.equalsIgnoreCase(fullName)){
                return false;
            }
        }
        return true;
    }

}
