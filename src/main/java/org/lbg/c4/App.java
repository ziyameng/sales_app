package org.lbg.c4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Item item = new Item();

        ArrayList<Double> list = new ArrayList<>();

        double totalAmount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the CONTINUE or QUIT");
        String command = sc.nextLine();

        while(!command.equalsIgnoreCase("quit")){
            System.out.println("please enter the cost");
            double cost = sc.nextDouble();
            totalAmount = totalAmount +cost;
            list.add(cost);

            sc.nextLine();

            System.out.println("please enter continue to add more costs or quit to quit");
            command =sc.nextLine();
        }

        System.out.println("please enter the vat (%)");
        double vat = sc.nextDouble();

        vatCalculator(totalAmount, vat);

        Collections.sort(list);
        System.out.println("After Sorting: " +list);

        item.setCost(totalAmount);
        item.setQuantity(list.size());
        item.setVat(vat);


        System.out.println(item.toString());
    }


    public static void vatCalculator(double cost, double vat){
        double totalPrice = cost + cost*(vat/100);

        System.out.println("the total price is "+totalPrice);
    }


}
