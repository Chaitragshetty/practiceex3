// Java program to remove vowels from a String
package com.stackroute.PE3;

import java.util.List;
import java.lang.String;
import java.util.Scanner;
public class VowelReplace {
    public static void main(String args[]) {
        String original, strnew;
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();
        System.out.println("Actual string is " + original);
         //replace the vowel by space and print remaining string
        strnew = original.replaceAll("[aeiou]", "");
         System.out.println("string is "  + strnew);
    }
}


