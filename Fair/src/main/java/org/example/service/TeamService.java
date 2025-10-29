package org.example.service;

import org.example.model.Player;
import org.example.model.Team;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeamService {
    private final static Set<Team> teamsSet = new HashSet<>();

    public static void addTeam(){
        Scanner myObj = new Scanner(System.in);
        long id = getHighestId();
        System.out.println("Enter Team name");
        String teamName = myObj.nextLine();
        System.out.println("Enter Country name");
        String countryName = myObj.nextLine();
        System.out.println("Enter City name");
        String cityName = myObj.nextLine();

        Team newTeam = new Team(id,teamName,countryName,cityName);
        teamsSet.add(newTeam);
    }


    private static long getHighestId(){
        long newId = 1;
        if (!teamsSet.isEmpty()) {
            long maxId = 0;
            for (Team t : teamsSet) {
                if (t.getId() > maxId) {
                    maxId = t.getId();
                }
            }
            newId = maxId + 1;
        }
        return newId;
    }

    public static void print(){
        for(Team t : teamsSet){
            System.out.println(t.getId()+"  "+t.getName()+" "+ t.getCountry()+" "+t.getCity()+"\n");
        }
    }


}
