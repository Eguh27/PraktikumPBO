package com.Tugas2;


class Waktu {
    int jam, menit, detik;

    Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    void tampilkan() {
        System.out.println("Waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    }

    Waktu selisih(Waktu waktuLain) {
        int totalDetik1 = this.jam * 3600 + this.menit * 60 + this.detik;
        int totalDetik2 = waktuLain.jam * 3600 + waktuLain.menit * 60 + waktuLain.detik;
        int selisihDetik = Math.abs(totalDetik1 - totalDetik2);

        int sJam = selisihDetik / 3600;
        int sMenit = (selisihDetik % 3600) / 60;
        int sDetik = selisihDetik % 60;

        return new Waktu(sJam, sMenit, sDetik);
    }
}

public class Main {
    public static void main(String[] args) {
         
         Waktu waktu1 = new Waktu(10, 30, 15);
         Waktu waktu2 = new Waktu(12, 45, 50);
         waktu1.tampilkan();
         waktu2.tampilkan();
         Waktu selisih = waktu1.selisih(waktu2);
         System.out.print("Selisih waktu: ");
         selisih.tampilkan();
    }
}
