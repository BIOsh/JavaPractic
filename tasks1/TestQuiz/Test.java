package tasks1.TestQuiz;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int q = 3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Какие курсы вы посещаете?\n");

        System.out.println("1) C++");
        System.out.println("2) C#");
        System.out.println("3) Android");
        System.out.println("4) Танцевальные\n");

        System.out.print("Ответ: ");

        String in;
        in = scan.nextLine();

        if (in.equals("3"))
        {
            a++;
        }
        else
        {
            b++;
        }

        System.out.println("\nВ какой стране самая большая численность населения?");

        System.out.println("1) Индия");
        System.out.println("2) США");
        System.out.println("3) Россия");
        System.out.println("4) Китай\n");

        System.out.print("Ответ: ");

        in = scan.nextLine();

        if (in.equals("4"))
        {
            a++;
        }
        else
        {
            b++;
        }

        System.out.println("\nКакая страна самая большая?");

        System.out.println("1) Канада");
        System.out.println("2) США");
        System.out.println("3) Россия");
        System.out.println("4) Китай\n");

        System.out.print("Ответ: ");

        in = scan.nextLine();

        if (in.equals("3"))
        {
            a++;
        }
        else
        {
            b++;
        }

        float c = (float) a/q;

        System.out.println(a + " is Correct");
        System.out.println(b + " is Wrong");
        System.out.println(c + " Result");

    }

}