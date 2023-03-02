package com.bridgelabz;
// Write a program for print Nth Harmonic number;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for harmonic value :");
        int num = sc.nextInt();
        double result = 0.0;
        int i=0;
        System.out.println("The Harmonic series is :");

        while (num > 0) {

           result =  result + (double) 1 / num;
           num--;
            System.out.print(result + ":     ");

        }System.out.println( "The harmonic number of series is :" + result );


    }
}