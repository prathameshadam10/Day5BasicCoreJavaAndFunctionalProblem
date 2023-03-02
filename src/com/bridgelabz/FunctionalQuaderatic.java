package com.bridgelabz;
// Write a program for finding two roots of quderatic equation.
import java.util.Scanner;

public class FunctionalQuaderatic { public static void main(String[] args) {
    /* Equation a*x*x + b*x + c */
    int a, b, c;
    double root1, root2;
    int delta;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a :");
    a = sc.nextInt();
    System.out.println("Enter value of b :");
    b = sc.nextInt();
    System.out.println("Enter value of c :");
    c = sc.nextInt();
    delta = b * b - 4 * a * c;
    root1 = (-b + Math.sqrt(delta)) / (2 * a);
    System.out.println("Root1 of x is :" + root1);
    root2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("Root2 of x is :" + root2);

}
}
