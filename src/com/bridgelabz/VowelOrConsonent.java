package com.bridgelabz;
// Write Program to check weather the alphabet is vowel or consonent.
import java.util.Scanner;

public class VowelOrConsonent {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Alphabet :");
            char char1 = sc.next().charAt(0);
            if(char1 == 'a' || char1 == 'e' ||char1 == 'i' || char1 == 'o' || char1 == 'u' )
                System.out.println(char1 + " is vowel");
            else
                System.out.println(char1 + " is consonant");

        }
    }


