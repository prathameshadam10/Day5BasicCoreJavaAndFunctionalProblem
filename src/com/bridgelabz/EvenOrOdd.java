package com.bridgelabz;
// Java Program To Check Weather a Number Is Even Or Odd;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if ( num % 2 == 0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }


    }
}
