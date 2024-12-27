package com.tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nilai : ");
            int n = input.nextInt();
            if (n >= 80 && n <= 100) {
                System.out.println("A");
            } else if (n >= 65 && n < 80) {
                System.out.println("B");
            } else if (n >= 55 && n < 65) {
                System.out.println("C");
            } else if (n >= 40 && n < 55) {
                System.out.println("D");
            } else if (n >= 0 && n < 44) {
                System.out.println("E");
            } else {
                System.out.println("ERROR: Wrong input");
            }
        }
    }
}
