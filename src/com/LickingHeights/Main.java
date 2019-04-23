package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	boolean loop = true;

	System.out.println("What year were you born in?");

	while (loop){
        System.out.println("Which month were you born in (number form)?");
        int month = keyboard.nextInt();
        int year = keyboard.nextInt();
	    System.out.println("The month of your birth has " + MonthDays(year,month) + " days.");


        }
    }



    public static String MonthDays (int month, int year){

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
}