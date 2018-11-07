package ru.dvfu.KomysovPV.tasks1;

import java.util.Scanner;

public class Stepen {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int a = in.nextInt();

        System.out.print("Введите степень: ");

        int b = in.nextInt();

        int c = power(a, b);

        System.out.print("Результат: " + c);

    }

    private static int power(int x, int n) {

        int z = 1;

        for (int i = 1; i <= n; i++) {

            z = z * x;

        }

        return z;
    }

}
