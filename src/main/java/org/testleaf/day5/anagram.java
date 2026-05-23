package org.testleaf.day5;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        String text1 = "stops";
        String text2 = "potss";

        if (text1.length() != text2.length()) {

            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

        } else {

            char[] arr1 = text1.toCharArray();
            char[] arr2 = text2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {

                System.out.println("The given strings are Anagram");

            } else {

                System.out.println("The given strings are not an Anagram");
            }
        }
    }
}