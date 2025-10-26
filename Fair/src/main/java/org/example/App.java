package org.example;

import org.example.project.Player;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("What do you want to do ?");
        System.out.println("to add a player press 1");
        System.out.println("to print all players press 2");
        System.out.println("to exit press 3");
        Set<Player> s = new HashSet<>();
        int num = myObj.nextInt();
        while (num != 3){
            if (num == 1) {


            }
            else if (num == 2){
                System.out.println(s);
            }
            else if (num == 3) {

            }
        }
    }
}

