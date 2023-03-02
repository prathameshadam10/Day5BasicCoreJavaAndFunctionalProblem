package com.bridgelabz;
// write a program for to find quotient and reminder of given value;
import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numerator value i.e a =");
        int a = sc.nextInt();
        System.out.println("Enter the Denominator value i.e b =");
        int b = sc.nextInt();
        int quotient = a/b;
        System.out.println("The Quotient of a/b :" + quotient );
        int reminder = a % b;
        System.out.println("The Reminder of a/b :" + reminder );

    }
}
