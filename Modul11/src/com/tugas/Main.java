package com.tugas;

// Interface untuk mendefinisikan method yang wajib dimiliki
interface InfoPerson {
    String getInfo();  // Method untuk mendapatkan informasi lengkap
    void displayInfo();  // Method untuk menampilkan informasi
}

// Enum untuk Jenis Kelamin untuk memastikan data valid
enum JenisKelamin {
    LAKI_LAKI("Laki-laki"),
    PEREMPUAN("Perempuan");
    
    private final String display;
    
    JenisKelamin(String display) {
        this.display = display;
    }
    
    @Override
    public String toString() {
        return display;
    }
}

// Abstract class Manusia sebagai base class
abstract class Manusia implements InfoPerson {
    protected String nama;
    protected String alamat;
    protected JenisKelamin jenisKelamin;
    
    // Constructor
    public Manusia(String nama, String alamat, JenisKelamin jenisKelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    // Abstract method yang wajib diimplementasi oleh child class
    abstract public String getStatus();
    
    // Getter methods
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
    
    // Implementasi method dari interface InfoPerson
    @Override
    public String getInfo() {
        return String.format("""
            Nama: %s
            Alamat: %s
            Jenis Kelamin: %s
            Status: %s""",
            nama, alamat, jenisKelamin, getStatus());
    }
    
    @Override
    public void displayInfo() {
        System.out.println(getInfo());
    }
}

// Class Mahasiswa yang mewarisi Manusia
class Mahasiswa extends Manusia {
    private final String nim;  // final karena NIM tidak boleh berubah
    private String programStudi;
    private String jurusan;
    
    public Mahasiswa(String nim, String nama, String alamat, JenisKelamin jenisKelamin,
                    String programStudi, String jurusan) {
        super(nama, alamat, jenisKelamin);
        this.nim = nim;
        this.programStudi = programStudi;
        this.jurusan = jurusan;
    }
    
    // Getter methods
    public String getNim() {
        return nim;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    // Setter methods (kecuali NIM yang final)
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    // Override method dari class Manusia
    @Override
    public String getStatus() {
        return "Mahasiswa";
    }
    
    // Override method dari interface InfoPerson
    @Override
    public String getInfo() {
        return super.getInfo() + String.format("""
            
            NIM: %s
            Program Studi: %s
            Jurusan: %s""",
            nim, programStudi, jurusan);
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa(
            "23533791",
            "Eguh Raga Mustika",
            "Bandar, Pacitan",
            JenisKelamin.LAKI_LAKI,
            "Teknik Informatika",
            "Teknik"
        );
        
        // Menampilkan informasi
        mhs.displayInfo();
        
        // Mengubah program studi
        mhs.setProgramStudi("Sistem Informasi");
        System.out.println("\nSetelah pindah program studi:");
        mhs.displayInfo();
    }
}