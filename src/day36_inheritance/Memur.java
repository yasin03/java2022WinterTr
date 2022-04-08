package day36_inheritance;

public class Memur extends Muhasebe {

    public static void main(String[] args) {

        Memur memur1 = new Memur();


        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        memur1.saatÜcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesapla();





    }

}
