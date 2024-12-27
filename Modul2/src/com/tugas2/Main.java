package com.tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double phi = 3.14;
        try (Scanner jari = new Scanner(System.in)) {
            System.out.print("Jari - jari: ");
            double a = jari.nextDouble();
            double luas = phi * a * a;
            double keliling = phi * (a+a);
            
            System.out.println("Luas Lingkaran : " + luas);
            System.out.println("keliling Lingkaran : " + keliling);
        }
        }
}
