package com.tugas;

public class Segitiga extends BangunDatar{
    public int alas;
    public int tinggi;

    @Override
    public double HitungLuas(){
        return this.alas * this.tinggi / 2.0;
    }

    @Override
    public void TampilHasil(){
        System.out.println("Segitiga");
        System.out.println("---------");
        System.out.println("Luasnya\t: " + this.HitungLuas());
    }
    
}
