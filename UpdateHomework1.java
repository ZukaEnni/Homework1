package sda.variable;

import java.util.Scanner;

public class UpdateHomework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number A");
        int a = scanner.nextShort();
        System.out.println("Write a number B");
        int b = scanner.nextShort();
        int calc1;
        calc1 = a * b;
        System.out.println(calc1);
        calc1 = a - b;
        System.out.println(calc1);
        calc1 = a / b;
        System.out.println(calc1);
        calc1 = a + b;
        System.out.println(calc1);
    }
}
