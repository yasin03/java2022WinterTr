package day38_inheritance_overriding;

public class Ustabasi extends Iscı {
    public String statu = "Ustabaşı";
    public String haklar = "Ustabaşı haftada 1 gün ekstra tatil hakkına sahiptir.";

    public void  mesai(){
        System.out.println("Arıza varsa Ustabaşı ekstra ücret almadan çalışır.");
    }

    public void maasHesapla(){
        System.out.println("Türm personel 30 gün x 8 saat x 12 euro = "+(30*8*12)+" Euro mmaş alır.");
    }




    public static void main(String[] args) {


        Ustabasi ysn = new Ustabasi();
        System.out.println(ysn.statu);    // Ustabaşı
        System.out.println(ysn.haklar);   // Ustabaşı haftada 1 gün ekstra tatil hakkına sahiptir.
        System.out.println(ysn.ikramiye); // İşçiler yılda bir kez ikramiye alır.
        System.out.println(ysn.izin);     // Tüm Personel yılda 4 hafta izin kullanabilir.
        ysn.maasHesapla();
        ysn.mesai();


        // Eğer işçi olarak özelliklerini görmek istersek Class adını Iscı seçeriz..
        Iscı ahmet = new Ustabasi();
        System.out.println(ahmet.statu);    // İşçi
        System.out.println(ahmet.haklar);   // İşçiler kıdem tazminatı alırlar.
        System.out.println(ahmet.ikramiye); // İşçiler yılda bir kez ikramiye alır.
        System.out.println(ahmet.izin);     // Tüm Personel yılda 4 hafta izin kullanabilir.
        ahmet.maasHesapla();
        ahmet.mesai();


        Personel adem = new Ustabasi();
        System.out.println(adem.statu);    // İşçi
        System.out.println(adem.haklar);   // İşçiler kıdem tazminatı alırlar.
        // System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin);     // Tüm Personel yılda 4 hafta izin kullanabilir.
        adem.maasHesapla();
        adem.mesai();


    }
}
