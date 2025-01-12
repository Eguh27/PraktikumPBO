package com.Tugas;

class Mahasiswa {

    private String Nama;
    private String NIM;
    private String Alamat;
    private int Umur;
    private String Jurusan;

    // konstruktor berparameter
    public Mahasiswa(String Nama, String NIM, String Alamat, int Umur, String Jurusan) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Alamat = Alamat;
        this.Umur = Umur;
        this.Jurusan = Jurusan;
    }

    //Konstruktor Default
    public Mahasiswa() {
        this.Nama = "Eguh";
        this.NIM = "23533791";
        this.Alamat = "Bandar";
        this.Umur = 19;
        this.Jurusan = "Teknik Informatika";
    }

    void tampilkan() {
        System.out.println("Nama\t: " + this.Nama);
        System.out.println("NIM\t: " + this.NIM);
        System.out.println("Alamat\t: " + this.Alamat);
        System.out.println("Umur\t: " + this.Umur);
        System.out.println("Jurusan\t: " + this.Jurusan);
    }

}

public class Main {
    public static void main(String[] args) {

        // Konstruktor berparameter
        System.out.println("\nKonstruktor Berparameter");
        Mahasiswa mh1 = new Mahasiswa("Eguh Raga Mustika", "23533791", "Bandar, Pacitan", 19, "Teknik Informatika");
        mh1.tampilkan();

        // Konstruktor default
        System.out.println("\nKonstruktor Default");
        Mahasiswa mh2 = new Mahasiswa();
        mh2.tampilkan();

    }
}