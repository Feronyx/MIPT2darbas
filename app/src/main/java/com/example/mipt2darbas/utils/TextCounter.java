package com.example.mipt2darbas.utils;

public class TextCounter {
    public static int countChars (String userInput){

        int count = userInput.length() ;


        return count;
    }
    public static int countWords (String userInput){

        int count = userInput.split("\\w+").length ; ;


        return count;
    }
    public static int countNumbers (String userInput){

         int count = 0;

        for (char c : userInput.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        System.out.println("Digits: " + count); ;


        return count;
    }
    public static int countSentences (String userInput){

        int count = 0;

        for (char c : userInput.toCharArray()) {
            if (c=='.') {
                count++;
            }
        }

        System.out.println("Digits: " + count); ;


        return count;
    }


}
