package com.gokhanucar.atm.odev;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Müşteri numarası herhangi bir özel koşul
        belirtilmediği için TC numarası olarak kabul edilmiştir.*/

        MusteriBase kurumsalMusteri1 = new KurumsalMusteri("1", "Cem Karaca", 500, "Bakırköy");
        MusteriBase bireyselMusteri1 = new BireyselMusteri("2", "Barış Manço", 600, "Kadıköy");
        MusteriBase kurumsalMusteri2 = new KurumsalMusteri("3", "Erkin Koray", 400, "Acıbadem");
        MusteriBase bireyselMusteri2 = new BireyselMusteri("4", "Haluk Levent", 1200, "Yüreğir");
        MusteriBase kurumsalMusteri3 = new KurumsalMusteri("5", "Barış Akarsu", 800, "Amasra");

        Map<String, MusteriBase> musteriMap = new LinkedHashMap<>();

        musteriMap.put(kurumsalMusteri1.tcNumarasi,kurumsalMusteri1);
        musteriMap.put(bireyselMusteri1.tcNumarasi,bireyselMusteri1);
        musteriMap.put(kurumsalMusteri2.tcNumarasi,kurumsalMusteri2);
        musteriMap.put(bireyselMusteri2.tcNumarasi,bireyselMusteri2);
        musteriMap.put(kurumsalMusteri3.tcNumarasi,kurumsalMusteri3);

        Scanner scanner = new Scanner(System.in);
        int count = 0; //müşteri numarası takibi için

        while(true){
            System.out.print("Lütfen müşteri numaranızı girin: ");

            try{
                count = scanner.nextInt();
            }catch (Exception ex){
                System.out.println("Hata oluştu. Detay: " + ex);
            }

            System.out.println(""); //just for line-breaking

            int islem = 0;

            switch (count){
                case 1:
                    kurumsalMusteri1.tumBilgileriYaz();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                    System.out.println("1: Para Yatırma || 2: Para Çekme: ");
                    islem = scanner.nextInt();
                    if (islem <=0 || islem> 2){
                        System.out.println("Lütfen 1 ya da 2 değeri gir: ");
                        islem = scanner.nextInt();
                    }else{
                        if(islem == 1){
                            System.out.print("Yatırılacak miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri1.paraYatir(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri1.hesapBakiyesi);
                        }
                        else if(islem == 2){
                            System.out.print("Çekilecek miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri1.paraCek(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri1.hesapBakiyesi);
                        }
                    }

                    break;

                case 2:
                    bireyselMusteri1.tumBilgileriYaz();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                    System.out.println("1: Para Yatırma || 2: Para Çekme: ");
                    islem = scanner.nextInt();
                    if (islem <=0 || islem> 2){
                        System.out.println("Lütfen 1 ya da 2 değeri gir: ");
                        islem = scanner.nextInt();
                    }else{
                        if(islem == 1){
                            System.out.print("Yatırılacak miktar: ");
                            int miktar = scanner.nextInt();
                            bireyselMusteri1.paraYatir(miktar);
                            System.out.println("Yeni bakiye: "+ bireyselMusteri1.hesapBakiyesi);
                        }
                        else if(islem == 2){
                            System.out.print("Çekilecek miktar: ");
                            int miktar = scanner.nextInt();
                            bireyselMusteri1.paraCek(miktar);
                            System.out.println("Yeni bakiye: "+ bireyselMusteri1.hesapBakiyesi);
                        }
                    }

                    break;

                case 3:
                    kurumsalMusteri2.tumBilgileriYaz();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                    System.out.println("1: Para Yatırma || 2: Para Çekme: ");
                    islem = scanner.nextInt();
                    if (islem <=0 || islem> 2){
                        System.out.println("Lütfen 1 ya da 2 değeri gir: ");
                        islem = scanner.nextInt();
                    }else{
                        if(islem == 1){
                            System.out.print("Yatırılacak miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri2.paraYatir(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri2.hesapBakiyesi);
                        }
                        else if(islem == 2){
                            System.out.print("Çekilecek miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri2.paraCek(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri2.hesapBakiyesi);
                        }
                    }

                    break;

                case 4:
                    bireyselMusteri2.tumBilgileriYaz();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                    System.out.println("1: Para Yatırma || 2: Para Çekme: ");
                    islem = scanner.nextInt();
                    if (islem <=0 || islem> 2){
                        System.out.println("Lütfen 1 ya da 2 değeri gir: ");
                        islem = scanner.nextInt();
                    }else{
                        if(islem == 1){
                            System.out.print("Yatırılacak miktar: ");
                            int miktar = scanner.nextInt();
                            bireyselMusteri2.paraYatir(miktar);
                            System.out.println("Yeni bakiye: "+ bireyselMusteri2.hesapBakiyesi);
                        }
                        else if(islem == 2){
                            System.out.print("Çekilecek miktar: ");
                            int miktar = scanner.nextInt();
                            bireyselMusteri2.paraCek(miktar);
                            System.out.println("Yeni bakiye: "+ bireyselMusteri2.hesapBakiyesi);
                        }
                    }

                    break;

                case 5:
                    kurumsalMusteri3.tumBilgileriYaz();
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                    System.out.println("1: Para Yatırma || 2: Para Çekme: ");
                    islem = scanner.nextInt();
                    if (islem <=0 || islem> 2){
                        System.out.println("Lütfen 1 ya da 2 değeri gir: ");
                        islem = scanner.nextInt();
                    }else{
                        if(islem == 1){
                            System.out.print("Yatırılacak miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri3.paraYatir(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri3.hesapBakiyesi);
                        }
                        else if(islem == 2){
                            System.out.print("Çekilecek miktar: ");
                            int miktar = scanner.nextInt();
                            kurumsalMusteri3.paraCek(miktar);
                            System.out.println("Yeni bakiye: "+ kurumsalMusteri3.hesapBakiyesi);
                        }
                    }

                    break;

                default:
                    System.out.println(""); //just for line-breaking
                    break;
            }

        }

    }
}
