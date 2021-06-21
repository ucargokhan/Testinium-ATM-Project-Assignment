package com.gokhanucar.atm.odev;

public class KurumsalMusteri extends MusteriBase implements IParaIslemleri{
    private String sirketAdi;

    public KurumsalMusteri(String tcNumarasi, String adSoyad, int hesapBakiyesi, String sirketAdi){
        this.tcNumarasi = tcNumarasi;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void tumBilgileriYaz(){
        System.out.print("KURUMSAL MÜŞTERİ! - ");
        System.out.println("Müşteri TC: " + tcNumarasi + "- Ad Soyad: " + adSoyad + "- Bakiye: " + hesapBakiyesi + "- Şirket: " + sirketAdi);
    }
}
