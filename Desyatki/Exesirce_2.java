package ru.dvfu.KomysovPV.Desyatki;

import java.util.Scanner;

public class Exesirce_2 {

    public static void main(String[] args) {

        System.out.print("Input value: ");

        Scanner x = new Scanner(System.in);

        int n = x.nextInt();

        if (n < 99) {

            int k = n / 10;

            System.out.println("Result: " + k);

        }

        else {

            System.out.println("Error!");

        }
    }
}
