package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // getting input from user
        System.out.print("Please Enter Credit Card Number: ");
        Scanner input = new Scanner(System.in);
        String cred_num = input.nextLine();

        // converting string into list of integers
        ArrayList<Integer> cardnum = new ArrayList<Integer>();

        for (int i = 0; i < cred_num.length(); i++) {
            int num = Integer.parseInt("" + cred_num.charAt(i));
            cardnum.add(num);
        }
        // getting every other number and multiplying by 2
        int num_multiply = 0;
        int sum = 0;
        int sum1 = 0;
        String product = "";

        for (int i = cardnum.size() - 2; i >= 0; i = i - 2) {
            num_multiply = cardnum.get(i);
            String multiply = "" + num_multiply * 2;
            product += multiply;
        }

        //adding the sum of the multiplied digits
        for (int i = 0; i < product.length(); i++) {
            int digit = Integer.parseInt("" + product.charAt(i));
            sum += digit;
        }
        // getting the list of skipped digits
        for (int i = cardnum.size() - 1; i >= 0; i = i - 2) {
            int num_add = cardnum.get(i);
            sum1 += num_add;
        }
        int totalsum = sum + sum1;
        int mod = totalsum % 10;

        if (cred_num.length() == 15 && mod == 0 && cred_num.charAt(0) == '3' && (cred_num.charAt(1) == '4' || cred_num.charAt(1) == '7')) {
            System.out.println("AMEX");
        } else if ((cred_num.length() == 13 || cred_num.length() == 16) && mod == 0 && cred_num.charAt(0) == '4') {
            System.out.println("VISA");
        } else if (cred_num.length() == 16 && mod == 0 && cred_num.charAt(0) == '5' &&
                (cred_num.charAt(1) == '1' || cred_num.charAt(1) == '2' || cred_num.charAt(1) == '3' || cred_num.charAt(1) == '4' || cred_num.charAt(1) == '5')) {
            System.out.println("MASTERCARD");
        } else {
            System.out.println("INVALID");
        }

    }
}
