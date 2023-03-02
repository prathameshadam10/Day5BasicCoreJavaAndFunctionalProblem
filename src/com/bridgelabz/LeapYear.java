package com.bridgelabz;
//Write the program for the given year is leap year or not;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter Year:  ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year > 999 && year < 10000) ;
        {

            if (year % 400 == 0) {
                System.out.println(year + "  is a leap year");
            } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + "  is a leap year");
            } else {
                System.out.println(year + "  is not a leap year");
            }

        }
    }

}
