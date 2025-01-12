package com.Tugas1;

class Titik {
    int x, y;

    Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void tampilkan() {
        System.out.println("Titik: (" + x + ", " + y + ")");
    }

    double hitungJarak(Titik titikLain) {
        int dx = this.x - titikLain.x;
        int dy = this.y - titikLain.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    Titik titikTengah(Titik titikLain) {
        int tengahX = (this.x + titikLain.x) / 2;
        int tengahY = (this.y + titikLain.y) / 2;
        return new Titik(tengahX, tengahY);
    }
}


public class Main {
    public static void main(String[] args) {
        Titik titik1 = new Titik(2, 3);
        Titik titik2 = new Titik(8, 7);
        titik1.tampilkan();
        titik2.tampilkan();
        System.out.println("Jarak antara dua titik: " + titik1.hitungJarak(titik2));
        Titik tengah = titik1.titikTengah(titik2);
        System.out.print("Titik tengah: ");
        tengah.tampilkan();

       
    }
}
