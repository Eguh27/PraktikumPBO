package com.tugas2;

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

    //method getter
    public String getNama(){
        return this.Nama;
    }

    void tampilkan() {
        System.out.println("Nama\t: " + this.Nama);
        System.out.println("NIM\t: " + this.NIM);
        System.out.println("Alamat\t: " + this.Alamat);
        System.out.println("Umur\t: " + this.Umur);
        System.out.println("Jurusan\t: " + this.Jurusan);
    }

}
// Kelas turunan PecintaAlam yang mewarisi kelas Mahasiswa
class PecintaAlam extends Mahasiswa {
    // Atribut tambahan khusus PecintaAlam
    private int jumlahPendakian;
    private String tingkatanPA;  // Tingkatan Pecinta Alam (Pemula/Menengah/Senior)

    // Konstruktor berparameter
    public PecintaAlam(String Nama, String NIM, String Alamat, int Umur, String Jurusan, 
                      int jumlahPendakian, String tingkatanPA) {
        // Memanggil konstruktor parent class
        super(Nama, NIM, Alamat, Umur, Jurusan);
        this.jumlahPendakian = jumlahPendakian;
        this.tingkatanPA = tingkatanPA;
    }

    // Konstruktor default
    public PecintaAlam() {
        // Memanggil konstruktor parent class
        super();
        this.jumlahPendakian = 0;
        this.tingkatanPA = "Pemula";
    }

    // Method 1: Menambah jumlah pendakian
    public void tambahPendakian(String namaGunung) {
        this.jumlahPendakian++;
        System.out.println(getNama() + " telah mendaki gunung " + namaGunung);
        updateTingkatan();
    }

    // Method 2: Update tingkatan berdasarkan jumlah pendakian
    private void updateTingkatan() {
        if (jumlahPendakian >= 10) {
            this.tingkatanPA = "Senior";
        } else if (jumlahPendakian >= 5) {
            this.tingkatanPA = "Menengah";
        }
        System.out.println("Tingkatan saat ini: " + this.tingkatanPA);
    }

    // Override method tampilkan dari parent class
    @Override
    void tampilkan() {
        super.tampilkan();  // Memanggil method tampilkan parent
        System.out.println("Jumlah Pendakian\t: " + this.jumlahPendakian);
        System.out.println("Tingkatan PA\t: " + this.tingkatanPA);
    }

    // Main method untuk testing
   
    
}



public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan konstruktor berparameter
        PecintaAlam pa1 = new PecintaAlam("Bejo", "23533775", "Singosaren", 20, 
                                         "Teknik Informatika", 3, "GrandMaster");
        
        // Membuat objek dengan konstruktor default
        PecintaAlam pa2 = new PecintaAlam();

        // Testing method untuk pa1
        System.out.println("=== Data Anggota 1 ===");
        pa1.tampilkan();
        pa1.tambahPendakian("Semeru");

        System.out.println("\n=== Data Anggota 2 ===");
        pa2.tampilkan();
        pa2.tambahPendakian("Rinjani");
}

}