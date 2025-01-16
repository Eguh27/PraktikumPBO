package com.tugas1;
import java.util.ArrayList;
import java.util.Scanner;

// Abstract Superclass Pegawai
abstract class Pegawai {
    protected String noPeg;
    protected String nama;
    protected int kehadiran;
    protected double gaji;
    protected double uangMakan;

    public Pegawai(String noPeg, String nama, int kehadiran, double gaji) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = 7500 * kehadiran;
    }

    // Abstract method yang wajib diimplementasi oleh subclass
    abstract public double hitungGaji();
    abstract public String getStatus();

    // Method konkrit yang bisa digunakan langsung
    public String lihatData() {
        return String.format("""
            No Pegawai: %s
            Nama: %s
            Kehadiran: %d hari
            Uang Makan: Rp %.2f
            Gaji Pokok: Rp %.2f""", 
            noPeg, nama, kehadiran, uangMakan, gaji);
    }
}

// Subclass PegawaiKontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String noPeg, String nama, int masaKontrak, int kehadiran, double gaji) {
        super(noPeg, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    public double hitungGaji() {
        return gaji + uangMakan;
    }

    @Override
    public String getStatus() {
        return "Pegawai Kontrak";
    }

    @Override
    public String lihatData() {
        return super.lihatData() + String.format("""
            
            Masa Kontrak: %d bulan
            Total Gaji: Rp %.2f
            Status: %s""", 
            masaKontrak, hitungGaji(), getStatus());
    }
}

// Subclass PegawaiTetap
class PegawaiTetap extends Pegawai {
    private final double tunjangan = 250000;

    public PegawaiTetap(String noPeg, String nama, int kehadiran, double gaji) {
        super(noPeg, nama, kehadiran, gaji);
    }

    @Override
    public double hitungGaji() {
        return gaji + uangMakan + tunjangan;
    }

    @Override
    public String getStatus() {
        return "Pegawai Tetap";
    }

    @Override
    public String lihatData() {
        return super.lihatData() + String.format("""
            
            Tunjangan: Rp %.2f
            Total Gaji: Rp %.2f
            Status: %s""", 
            tunjangan, hitungGaji(), getStatus());
    }
}

// Class utama
public class PegawaiMajuMundur {
    private ArrayList<Pegawai> daftarPegawai;
    private Scanner scanner;

    public PegawaiMajuMundur() {
        daftarPegawai = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void inputData() {
        try {
            System.out.println("\n=== Input Data Pegawai ===");
            System.out.print("Masukkan No Pegawai: ");
            String noPeg = scanner.nextLine();
            
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Jumlah Kehadiran: ");
            int kehadiran = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Masukkan Gaji Pokok: ");
            double gaji = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Jenis Pegawai (1: Kontrak, 2: Tetap): ");
            String jenis = scanner.nextLine();
            
            if (jenis.equals("1")) {
                System.out.print("Masukkan Masa Kontrak (bulan): ");
                int masaKontrak = Integer.parseInt(scanner.nextLine());
                daftarPegawai.add(new PegawaiKontrak(noPeg, nama, masaKontrak, kehadiran, gaji));
            } else if (jenis.equals("2")) {
                daftarPegawai.add(new PegawaiTetap(noPeg, nama, kehadiran, gaji));
            } else {
                throw new IllegalArgumentException("Jenis pegawai tidak valid!");
            }
            
            System.out.println("\nData pegawai berhasil ditambahkan!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Input tidak valid! Pastikan input angka sesuai format.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void lihatData() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\nBelum ada data pegawai!");
            return;
        }
        
        System.out.println("\n=== Data Pegawai ===");
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println(pegawai.lihatData());
            System.out.println("-".repeat(50));
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Input data pegawai");
            System.out.println("2. Lihat data pegawai");
            System.out.println("3. Keluar");
            
            System.out.print("Pilih menu (1-3): ");
            String pilihan = scanner.nextLine();
            
            switch (pilihan) {
                case "1":
                    inputData();
                    break;
                case "2":
                    lihatData();
                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void main(String[] args) {
        PegawaiMajuMundur app = new PegawaiMajuMundur();
        app.menu();
    }
}