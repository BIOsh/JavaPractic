package ru.dvfu.KomysovPV.tasks1;

import java.util.Scanner;

public class Stepen {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        float a = in.nextFloat();

        System.out.print("Введите степень: ");

        float b = in.nextFloat();

        float c = power(a, b);

        System.out.print("Результат: " + c);

    }

    // Метод возведения в степень

    private static float power(float x, float n) {

        float z = 1;

        if (n > 0) {

            for (float i = 1; i <= n; i++) {

                z *= x;

            }

        }

        else {

            for (float i = -1; i >= n; i--) {

                z /= x;

            }

        }

        return z;

    }

}
