package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    public void arrangeToMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number.");

        for (int i =scanner.nextInt() ; i <= 100; i++) {
            System.out.println(i);
        }
    }


    public void arrangeToMin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number.");
        for (int i =scanner.nextInt() ; i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void arrangeBetween(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert the numbers.");
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        for (; x <= y; x++){
            System.out.println(x);
        }
    }

    public void arrangeBetweenVar(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert the numbers.");
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        if(x < y){
            for (int i = x; i <= y; i++){
            System.out.println(i);}
        } else {
            for (int i = x; i >= y; i--){
                System.out.println(i);
            }
        }
    }
}

