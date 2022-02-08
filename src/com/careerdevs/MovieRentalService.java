package com.careerdevs;

import java.util.ArrayList;

public class MovieRentalService {
    private static MovieRenter movieRenter;
    private static ArrayList<Movie> movieStorage;

    public static void main(String[] args) {
        System.out.println("Movie Rental Service\n\n");
        movieRenter = createMovieRenter();

        mainMenu();

    }

    public static void mainMenu () {

    }

    private static void createMovieRenter () {

        System.out.println("Before you can start renting movies, you need to make an account\n");
        String name;
        int startMoney;

        while (true) {

        //String name = UI.readString("Enter your name");
        int startMoney = UI.readInt("How much money do you have in USD", 5, 500) * 100
    }

    private static void rentMovieMenu () {


    }

    private static void returnMovieMenu () {

    }
}
