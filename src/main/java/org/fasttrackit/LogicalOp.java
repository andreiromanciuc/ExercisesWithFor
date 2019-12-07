package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {


    Scanner scanner = new Scanner(System.in);


    public void arrangeToMax() {
        System.out.println("Please enter your number.");

        for (int i =scanner.nextInt() ; i <= 100; i++) {
            System.out.println(i);
        }
    }


    public void arrangeToMin(){
        System.out.println("Please enter your number.");
        for (int i =scanner.nextInt() ; i >= -100; i--) {
            System.out.println(i);
        }
    }
}
