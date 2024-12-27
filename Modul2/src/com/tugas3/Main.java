package com.tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Bil A\t: ");
            a = input.nextInt();
            System.out.print("\nMasukkan Bil B\t: ");
            b = input.nextInt();
            System.out.print("\nMasukkan Bil C\t: ");
            c = input.nextInt();

            if (a > b && a > c && b > c) {
                System.out.println("A adalah bilangan terbesar : " + a);
                System.out.println("C adalah bilangan terkecil : " + c);
            } else if (b > a && b > c && a > c) {
                System.out.println("B adalah bilangan terbesar : " + b);
                System.out.println("C adalah bilangan terkecil : " + c);
            } else if (c > b && c > a && b > a) {
                System.out.println("C adalah bilangan terbesar : " + c);
                System.out.println("A adalah bilangan terkecil : " + a);
            } else if (a > b && a > c && c > b) {
                System.out.println("A adalah bilangan terbesar : " + a);
                System.out.println("B adalah bilangan terkecil : " + b);
            } else if (b > a && b > c && c > a) {
                System.out.println("B adalah bilangan terbesar : " + b);
                System.out.println("A adalah bilangan terkecil : " + a);
            } else if (c > a && c > b && a > b) {
                System.out.println("C adalah bilangan terbesar : " + c);
                System.out.println("B adalah bilangan terkecil : " + b);
            }

        }

    }
}
