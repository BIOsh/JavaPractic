package ru.dvfu.KomysovPV.Chetnoe;

import java.util.Scanner;

public class Exesirce_3 {

    public static void main(String[] args) {

        System.out.print("Input value: ");

        Scanner x = new Scanner(System.in);

        int n = x.nextInt();

        int m = n / 2 * 2 + 2;

        System.out.print("Result: " + m);
    }
}
