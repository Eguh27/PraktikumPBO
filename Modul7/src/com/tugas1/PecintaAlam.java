package com.tugas1;

// Kelas utama PecintaAlam
public class PecintaAlam {
    // Atribut
    private final String nama;
    private final String nim;
    private int jumlahPendakian;
    private boolean statusAnggota;
    
    // Constructor
    public PecintaAlam(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahPendakian = 0;
        this.statusAnggota = true;
    }
    
    // Method untuk mendaki gunung
    public void mendakiGunung(String namaGunung) {
        jumlahPendakian++;
        System.out.println(nama + " sedang mendaki gunung " + namaGunung);
    }
    
    // Method untuk melihat status keanggotaan
    public void cekStatus() {
        if (statusAnggota) {
            System.out.println(nama + " adalah anggota aktif Pecinta Alam");
        } else {
            System.out.println(nama + " bukan anggota aktif Pecinta Alam");
        }
    }
    
    // Method untuk melihat jumlah pendakian
    public void lihatJumlahPendakian() {
        System.out.println(nama + " telah melakukan " + jumlahPendakian + " pendakian");
    }
    
    // Method untuk mengubah status keanggotaan
    public void ubahStatus(boolean status) {
        this.statusAnggota = status;
        System.out.println("Status keanggotaan " + nama + " telah diperbarui");
    }
    
    // Method untuk menampilkan informasi anggota
    public void tampilkanInfo() {
        System.out.println("Informasi Anggota:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jumlah Pendakian: " + jumlahPendakian);
        System.out.println("Status Anggota: " + (statusAnggota ? "Aktif" : "Tidak Aktif"));
    }

    // Main method untuk testing
    public static void main(String[] args) {
        // Membuat dua objek PecintaAlam
        PecintaAlam anggota1 = new PecintaAlam("Eguh", "23533791");
        PecintaAlam anggota2 = new PecintaAlam("Bejo", "23533775");
        
        // Testing method untuk anggota1
        System.out.println("\n=== Anggota 1 ===");
        anggota1.tampilkanInfo();
        anggota1.mendakiGunung("Semeru");
        anggota1.lihatJumlahPendakian();
        anggota1.ubahStatus(false);
        anggota1.cekStatus();
        
        // Testing method untuk anggota2
        System.out.println("\n=== Anggota 2 ===");
        anggota2.tampilkanInfo();
        anggota2.mendakiGunung("Bromo");
        anggota2.mendakiGunung("Rinjani");
        anggota2.lihatJumlahPendakian();
        anggota2.cekStatus();
    }
}