package com.tugas;

public class Lingkaran extends BangunDatar implements keliling, Simetri{
    public int jejari;

    @Override
    public double HitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }

    @Override
    public double HitungKeliling(){
        return 2* Math.PI * this.jejari;
    }

    @Override
    public double HitungSimPutar(){
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double hitungSimLipat(){
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public void TampilHasil(){
        System.out.println("Lingkaran");
        System.out.println("----------");
        System.out.println("Luas\t: " + this.HitungLuas());
        System.out.println("keliling\t: " + this.HitungKeliling());
        System.out.println("Sim. Lipat\t: " + this.hitungSimLipat());
        System.out.println("Sim. Putar\t: " + this.HitungSimPutar());
    }
}
