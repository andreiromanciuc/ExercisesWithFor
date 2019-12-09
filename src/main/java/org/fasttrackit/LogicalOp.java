package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    public void arrangeToMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number.");

        for (int i = scanner.nextInt(); i <= 100; i++) {
            System.out.println(i);
        }
    }


    public void arrangeToMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number.");
        for (int i = scanner.nextInt(); i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void arrangeBetween() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert the numbers.");
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        for (; x <= y; x++) {
            System.out.println(x);
        }
    }

    public void arrangeBetweenVar() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert the numbers.");
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }
    }

    public void showPairNumber() {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void showUnPairNumber() {
        int i;
        for (i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public void sumFrom() {
        System.out.println("Please insert your number.");
        Scanner scanner = new Scanner (System.in);

        for (int i = scanner.nextInt(); i < 100; i++) {
            int n = (i * (i + 1)) / 2;
            int z = 5050 - n;     //5050 este suma tuturor numerelor de la 1 la 100;
            System.out.println(z);
            break;
        }
    }


}

