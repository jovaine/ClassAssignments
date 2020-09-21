package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text");
        String text = input.nextLine();
        text = (text + " ");
        float lettercount = 0;
        float wordcount = 0;
        float sentencecount = 0;
        String testtext = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) lettercount++;
        }
        for (int w = 0; w < text.length(); w++) {
            if (text.charAt(w) == ' ') wordcount++;
        }
        for (int s = 0; s < text.length(); s++) {
            testtext = "" + text.charAt(s);
            if (testtext.equals(".") || testtext.equals("?") || testtext.equals("!") ) sentencecount++;
        }
        float L = (lettercount/wordcount)*100;
        float S = ((sentencecount/wordcount)*100);
        double gradeLevel = 0.0588 * L - 0.296 * S - 15.8 ;
        long grade = Math.round(gradeLevel);
        System.out.println("The text entered is at a grade "+grade+" level.");
        }
    }
