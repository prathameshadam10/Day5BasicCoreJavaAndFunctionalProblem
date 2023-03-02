package com.bridgelabz;
// Write a Program for Swap two numbers;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x, y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y :");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before swapping numbers :"+"x =" + x + " &  y ="+ y);
        t = x;
        x = y;
        y = t;
        System.out.println("Before swapping numbers :" + "x =" + x + "  & y =" + y);


    }
}
