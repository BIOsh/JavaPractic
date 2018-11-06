package ru.dvfu.KomysovPV.tasks1;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        System.out.print("Input value: ");

        Scanner in = new Scanner(System.in);

        int b = in.nextInt();

        System.out.println("Value = " + b);

        int x = b % 10;

        System.out.println("Result: " + x);
    }
}
