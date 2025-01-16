package com.tugas;

public class Mainclass {
    public static void main(String[] args) {
        Lingkaran A = new Lingkaran();
        A.jejari = 19;
        A.TampilHasil();
        System.out.println("");

        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.TampilHasil();
        System.out.println("");

        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 8;
        C.TampilHasil();
    }
}
