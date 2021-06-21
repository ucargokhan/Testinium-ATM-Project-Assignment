package com.gokhanucar.atm.odev;

public class MusteriBase implements IParaIslemleri{
    protected String tcNumarasi;
    protected String adSoyad;
    protected int hesapBakiyesi;

    //overridden from IParaIslemleri interface
    public void tumBilgileriYaz(){}

    @Override
    public void paraYatir(int miktar) {
        this.hesapBakiyesi += miktar;
    }

    @Override
    public void paraCek(int miktar) {
        this.hesapBakiyesi -= miktar;
    }
}
