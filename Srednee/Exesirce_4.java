package ru.dvfu.KomysovPV.Srednee;

import java.util.Scanner;

public class Exesirce_4 {

    public static void main(String[] args) {

        System.out.println("Input value №1: ");

        Scanner a = new Scanner(System.in);

        float x = a.nextFloat();

        System.out.println("Input value №2: ");

        float y = a.nextFloat();

        System.out.println("Input value №3: ");

        float z = a.nextFloat();

        float m = (x + y + z) / 3;

        System.out.println("Result: " + m);
    }
}
