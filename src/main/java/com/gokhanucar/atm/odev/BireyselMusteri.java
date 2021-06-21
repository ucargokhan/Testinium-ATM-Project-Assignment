package com.gokhanucar.atm.odev;

public class BireyselMusteri extends MusteriBase implements IParaIslemleri{
    private String evAdresi;

    public BireyselMusteri(String tcNumarasi, String adSoyad, int hesapBakiyesi, String evAdresi){
        this.tcNumarasi = tcNumarasi;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.evAdresi = evAdresi;
    }

    @Override
    public void tumBilgileriYaz(){
        System.out.print("BİREYSEL MÜŞTERİ! - ");
        System.out.println("Müşteri TC: " + tcNumarasi + "- Ad Soyad: " + adSoyad + "- Bakiye: " + hesapBakiyesi + "- Adres: " + evAdresi);
    }
}
