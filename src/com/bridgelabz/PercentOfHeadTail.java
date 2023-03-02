package com.bridgelabz;
// Write a program for Flip coin and print percentage of heads and tails;
import java.util.Scanner;

public class PercentOfHeadTail {
    public static void main(String[] args) {
//        int randomnum = (int) (Math.random()*101);
//        System.out.println(randomnum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin :");
        int num = sc.nextInt();
        double tail = 0, head = 0;
        for (int i = 1; i <= num; i++) {

            double value = Math.random();

            if (value < 0.5) {
                tail = tail + 1;
            }
             else {
                head = head + 1;
            }
        }
        System.out.println("Tail percentage :" + ((tail/num)*100));
        System.out.println("head percentage :" + ((head/num)*100));
    }
}
