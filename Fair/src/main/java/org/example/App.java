package org.example;

import org.example.project.Player;
import org.example.project.PlayerService;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("What do you want to do ?");
        System.out.println("to add a player press 1");
        System.out.println("to print all players press 2");
        System.out.println("to exit press 3");

        int num = myObj.nextInt();
        while (num != 3){
            if (num == 1) {
                PlayerService.addPlayer();
            }
            else if (num == 2){
                System.out.println(Player.set);
            }
            else if (num == 3) {
                System.out.println("Leave please!");
            }
            System.out.println("Re-Enter the num");
            num = myObj.nextInt();
        }
    }
}

