package com.tugas;

import java.util.Arrays;
import java.util.List;

//SuperClass
class Dvd {
    private String Judul;
    private String Publisher;
    private int stok;

    public Dvd(String Judul, String Publisher, int stok){
        this.Judul = Judul;
        this.Publisher = Publisher;
        this.stok = stok;
    }

    public String getjudul(){
        return Judul;
    }

    public String getPublisher(){
        return Publisher;
    }

    public int getStok(){
        return stok;
    }

}

// subclass
class CdFilm extends Dvd {
    private List<String> Pemain;
    private String Sutradara;
    private String Kategori;

    public CdFilm(String Judul, List<String> Pemain, String Sutradara, String Publisher, String Kategori, int stok ){
            super(Judul, Publisher, stok);
            this.Pemain = Pemain;
            this.Sutradara = Sutradara;
            this.Kategori = Kategori;

    }


    void Tampilkan(){
        System.out.println("\nCd Film");
        System.out.println("Judul\t\t: " + getjudul());
        System.out.println("Pemain\t\t: " + this.Pemain);
        System.out.println("Sutradara\t: " + this.Sutradara);
        System.out.println("Publisher\t: " + getPublisher());
        System.out.println("Kategori\t: " + this.Kategori);
        System.out.println("Stok\t\t: " + getStok());
    }
}


class CdMusik extends Dvd{
    private String Penyanyi;
    private String Produser;
    private List<String> TopHits;
    private String Kategori;

    public CdMusik(String Judul, String Penyanyi, String Produser, String Publisher, List<String> TopHits, String Kategori, int stok){
        super(Judul, Publisher, stok);
        this.Penyanyi = Penyanyi;
        this.Produser = Produser;
        this.TopHits = TopHits;
        this.Kategori = Kategori;
    }

    void Tampilkan(){
        System.out.println("\nCd Musik");
        System.out.println("Judul\t\t: " + getjudul());
        System.out.println("Penyanyi\t: " + this.Penyanyi);
        System.out.println("Produser\t: " + this.Produser);
        System.out.println("Publisher\t: " + getPublisher());
        System.out.println("Top Hits\t: " + this.TopHits);
        System.out.println("Kategori\t: " + this.Kategori);
        System.out.println("Stok\t\t: " + getStok());
    }

}





public class Main{
    public static void main(String[] args) {
        
        List<String> PemainFilm = Arrays.asList("aktor 1", "Aktor 2");
        CdFilm film1 = new CdFilm("Judul 1", PemainFilm, "Sutradara1", "Publisher2", "SU", 10);

        film1.Tampilkan();

        List<String> TopHitsList = Arrays.asList("Top Hits a", "Top Hits b");
        CdMusik musik1 = new CdMusik("Musik 1", "Penyanyi 1", "Produser1", "Produser1", TopHitsList, "C", 20);
        musik1.Tampilkan();
    }
}