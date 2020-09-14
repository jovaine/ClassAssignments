package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int blocks = 0;
        do {
            System.out.print("Please enter number of steps you want to create ");
            blocks = input.nextInt();
        } while ((blocks < 1) || (blocks > 8));
        {
            for (int row = 0; row < blocks; row++) {
                for (int space = 0; space < (blocks-row-1); space++){
                    System.out.print(" ");
                }
                for (int col =0; col <= row; col++ ){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
        }
    }
}
