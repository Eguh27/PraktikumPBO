package Mahasiswa;

class Segitiga {

    // atribut
    private int alas;
    private int tinggi;
    private double luas;

    // setter method untuk alas
    public void setAlas(int a) {
        if (a > 0) {
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }

    // setter method untuk tinggi
    public void setTinggi(int t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }

    // getter method untuk luas
    public double getLuas() {
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga test = new Segitiga();
        System.out.println("Alas\t: 10");
        System.out.println("Tinggi\t: 30");
        test.setAlas(10);
        test.setTinggi(30);
        System.out.println("Luas\t: " + test.getLuas());
    }
}