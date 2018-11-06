package ru.dvfu.KomysovPV.tasks1;

import java.util.Scanner;

public class Exesirce_5 {

    public static void main(String[] args) {

        System.out.println("Input value x: ");

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        System.out.println("Input value y: ");

        int y = in.nextInt();

        System.out.println("Result: " + (int)Math.pow(x, y));

    }
}
