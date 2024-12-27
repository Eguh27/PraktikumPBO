package com.tugas6;

public class Main {
    public static void main(String[] args) {

        int array[] = { 2, 3, 5, 3, 3, 7, 9, 1 };
        int total = 0;
        int max = array[0];
        int min = array[0];

        for (int n : array) {
            total += n;
        }

        double hasil = total / array.length;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        for (int k : array) {
            if (k < min) {
                min = k;
            }
        }
        System.out.print("\nAngka dalam array : ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        
        System.out.println("\nA. Jumlah total :\t " + total);
        System.out.println("B. Rata - rata :\t " + hasil);
        System.out.println("C. Nilai Tertinggi :\t " + max);
        System.out.println("D. Nilai Terendah :\t " + min + "\n");

    }
}
