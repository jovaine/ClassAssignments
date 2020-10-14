package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quarter = 25;
        int nickel = 10;
        int dime = 5;
        int penny = 1;
        float change1;
	Scanner input = new Scanner(System.in);
	do {
		System.out.print("Please enter change: ");
		change1 = input.nextFloat();
	} while (change1<0.0);
	int change = Math.round(change1 * 100);
	int num_quarter = (change/quarter);
	int quar_remaining = change%quarter;
	int num_nickel = (quar_remaining/nickel);
	int quar_remaining1 = quar_remaining%nickel;
	int num_dime = (quar_remaining1/dime);
	int quar_remaining2 = quar_remaining1%dime;
	int num_penny = (quar_remaining2/penny);
	int total_coins = (num_quarter+num_nickel+num_dime+num_penny);
	System.out.println("The total coins are: "+ total_coins);

    }
}
