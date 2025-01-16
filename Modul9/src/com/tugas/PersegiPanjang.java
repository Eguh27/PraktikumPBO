package com.tugas;

public class PersegiPanjang extends BangunDatar implements keliling{
    public int panjang;
    public int lebar;

    @Override
    public double HitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double HitungKeliling(){
        return 2 * (this.lebar + this.panjang);
    }

    public double HitungSimPutar(){
        return 2.0;
    }

    public double hitungSimLipat(){
        return 2.0;
    }

    @Override
    public void TampilHasil(){
        System.out.println("Persegi Panjang");
        System.out.println("----------------");
        System.out.println("Luasnya\t: " + this.HitungLuas());
        System.out.println("Kelilingnya\t: " + this.HitungKeliling());
        System.out.println("Sim. Lipat\t: " + this.hitungSimLipat());
        System.out.println("Sim. Putar\t: " + this.HitungSimPutar());
    }

}
