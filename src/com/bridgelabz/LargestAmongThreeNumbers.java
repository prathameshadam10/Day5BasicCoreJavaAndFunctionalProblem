package com.bridgelabz;
// Write a program to print the largest value among three;
import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second number :");
        int n2 = sc.nextInt();
        System.out.println("Enter the Third number :");

        int n3 = sc.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

    

