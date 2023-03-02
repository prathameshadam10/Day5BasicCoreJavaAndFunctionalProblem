package com.bridgelabz;
// Write a program for a prime factors for given number;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int div = 2; div < number; div++) {
            while(number % div == 0) {

                System.out.print(div+" ");
                number = number/div;
            }

        }
        if(number != 0) {
            System.out.println(number);
        }
    }
}

