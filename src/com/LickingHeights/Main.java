package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	boolean loop = true;

	System.out.println("What year were you born in?");

	while (loop){
        System.out.println("Which month were you born in (number form)?");
        int year = keyboard.nextInt();
        int month = keyboard.nextInt();

	    System.out.println(monthName(month) + " has " + monthDays(month,year) + " days.");


        }
    }



    public static String monthDays(int month, int year){

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31";
            case 2:
                if(year  % 4 == 0){
                    return "29";
                }
                return "28";
            case 4:
            case 6:
            case 9:
            case 11:
                return "30";


        }
        return "Invalid";






    }
    public static String monthName(int month){

        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Invalid";
    }
}