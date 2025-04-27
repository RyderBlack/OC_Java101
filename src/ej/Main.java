package ej;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int num;
        num = 5;
        final int immuable = 20;
//        String language = "Java";
//        String sentence = language + " is a programming language.";
//        System.out.println(sentence);
//        String helloWorld = "Hello World";
//        System.out.println(helloWorld);
//        displayText("Rogers");

        //  Dynamic Array
        List<Integer> listNumbers = Arrays.asList(1, 2, 0, 42, 57, 0, 0);
        int cpt = 0;
        for (Integer numFromList : listNumbers) {
            if(numFromList == 0) {
                cpt++;
            }
        }
        System.out.println(cpt);

        //  Static Array
        int[] listOfNumbers = {3,5,8,0,4,0,2,11};
        int cpt2 = 0;
        for(int i=0; i<7;i++) {
            if(listOfNumbers[i] == 0) {
                cpt2++;
            }
        }
        System.out.println(cpt2);

    }

    public static void displayText(final String text) {
        System.out.println("Bonjour " + text);
    }




}
