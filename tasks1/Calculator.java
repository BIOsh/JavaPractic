package ru.dvfu.KomysovPV.tasks1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Input a: ");

        int a = new Scanner(System.in).nextInt();

        System.out.print("Input b: ");

        int b = new Scanner(System.in).nextInt();

        System.out.print("Math operations:\n" + "1) +\n" + "2) -\n" + "3) *\n" + "4) /\n" + "Input number menu: ");

        int n = new Scanner(System.in).nextInt();

        int k = 0;

        switch (n){

            case 1:

                k = a + b;
                System.out.println("a + b = " + k);
                break;

            case 2:

                k = a - b;
                System.out.println("a - b = " + k);
                break;

            case 3:

                k = a * b;
                System.out.println("a * b = " + k);
                break;

            case 4:

                k = a / b;
                System.out.println("a / b = " + k);
                break;

            default:

                System.out.println("End");
                break;
        }

    }
}
