package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rotation;
        String ciphertext;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter text you want to encode. ");
        ciphertext = input.nextLine();
        ciphertext = ciphertext.toLowerCase();
        do {
            System.out.print("Enter rotation amount. ");
            rotation = input.nextInt();
            if (rotation < 1) {
                System.out.println("The number entered is too low");
            } else if (rotation > 25){
                System.out.println("The number entered is too high");
            }
        } while (rotation < 1 || rotation > 25);
        System.out.println("Success");
        System.out.print("Your encoded text is. " + encode(ciphertext, rotation));

    }
    static String encode(String ciphertext, int rotation) {
        String message = "";
        int convert = 0;
        int newconvert = 0;
        for (int i = 0; i < ciphertext.length(); i++) {
            convert = 0 + ciphertext.charAt(i); // gets the ASCII conversion for letter at i
            if (convert >=97 && convert <=122) { //checks to see if it is a letter.
            newconvert = convert + rotation;} else newconvert = convert;;// adds rotation number to ASCII conversion
            if (newconvert > 122) // checking to see if new letter is past z
            {
                newconvert = (newconvert - 97) % 26 + 97;
            }
            char letter = (char) newconvert;
            message += letter;

        }
        return message;
    }
}
