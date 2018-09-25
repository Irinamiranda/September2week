package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> myFavorites = new ArrayList<>();

        String quit = "yes";
        while(!quit.equalsIgnoreCase("no")) {
        System.out.println("Please enter the name of book or movie");
        quit = keyboard.nextLine();
        if(!quit.equalsIgnoreCase("no")){
            myFavorites.add(quit);
        }
        }
        for (String movie: myFavorites){
            System.out.println(movie);
        }
Collections.shuffle(myFavorites);


	// write your code here
    }
}
