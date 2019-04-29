package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	boolean loop = true;


	while (loop){
        System.out.println("What year were you born in?");
        int year = keyboard.nextInt();
        System.out.println("Which month were you born in (number form)?");
        int m = keyboard.nextInt();
        System.out.println(monthName(m) + " has " + monthDays(m,year) + " days.");

        System.out.println("What day of the month were you born on (number form)?");
        int q = keyboard.nextInt();
        System.out.println("You were born on a " + dayOfTheWeek(q, m, year));
        System.out.println(poemLine(dayOfTheWeek(q,m,year)));

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
        return "Error";






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
        return "Error";
    }
    public static String dayOfTheWeek(int day, int month, int year) {

        int m = month;
        int q = day;
        if(m==1){
            m=13;
            year--;
        }
        if (m==2){
            m=14;
            year--;
        }
        int K = year%100;
        int J = year/100;

        int h = (q+((13*m+13)/5)+K+(K/4)+(J/4)+(5*J))%7;

        switch (h) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
        }
        return "Error";
    }
    public static String poemLine(String h){
        switch (h){
            case "Saturday":
                return "Saturday's child works hard for a living";
            case "Sunday":
                return "But the child born on Sabbath Day,\n"+
                "Is fair and wise and good in every way";
            case "Monday":
                return "Monday's child is fair of face";
            case "Tuesday":
                return "Tuesday's child is full of grace";
            case "Wednesday":
                return "Wednesday's child is full of woe";
            case "Thursday":
                return "Thursday's child has far to go";
            case "Friday":
                return "Friday's child is loving and giving,";
        }
        return "Error";
    }

}