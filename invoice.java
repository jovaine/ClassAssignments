package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumpersticker");
        prices.add(4.99);

        String answer = "";
        ArrayList<String> proditems = new ArrayList<String>();
        ArrayList<Double> prodprice = new ArrayList<Double>();
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
            answer = input.nextLine();
            if (answer.equals("1")) {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println("Item #" + i + "---- " + products.get(i) + " ---- Price " + prices.get(i));
                }
                int response;
                System.out.println("Enter the item # you wish to buy?");
                response = input.nextInt();
                if (response >= products.size()-1 || response < 0) {
                    System.out.println("You made an invalid selection");
                } else {
                    proditems.add(products.get(response));
                    prodprice.add(prices.get(response));
                }

            } else if (answer.equals("2")) {
                System.out.println("You have the following items in your basket");
                for (int i = 0; i < proditems.size(); i++) {
                    System.out.println("Item #" + i + "---- " + proditems.get(i) + " ---- Price " + prodprice.get(i));
                }
                int response1;
                System.out.println("Enter the item # you wish to remove from cart.");
                response1 = input.nextInt();
                if ((response1 >= proditems.size()) || ((response1 < 0))) {
                    System.out.println("You made an invalid selection");
                } else {
                    proditems.remove(response1);
                    prodprice.remove(response1);
                }

            } else if (answer.equals("3")) {
                {
                    System.out.println("You have the following items in your basket");
                    for (int i = 0; i < proditems.size(); i++) {
                        System.out.println("Item #" + i + "---- " + proditems.get(i) + " ---- Price " + prodprice.get(i));
                    }
                }
            }
            }
            while (!answer.equals("4")) ;

            float totalAmt = 0f;
            for (int i = 0; i < prodprice.size(); i++) {
                double price = prodprice.get(i);
                totalAmt += price;
            }
            System.out.println("Your total amount due is $" + totalAmt);


    }
}
