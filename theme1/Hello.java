package ru.dvfu.KomysovPV.theme1;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("My arguments");

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
