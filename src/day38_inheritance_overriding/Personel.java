package day38_inheritance_overriding;

public class Personel {
    public String statu = "Personel";
    public String haklar = "Tüm Personel eşit haklara sahiptir.";
    public String izin = "Tüm Personel yılda 4 hafta izin kullanabilir.";

    public void  mesai(){
        System.out.println("Türm personel 5 gün, 8 saat çalışır.");
    }

    public void maasHesapla(){
        System.out.println("Türm personel 30 gün x 8 saat x 10 euro = "+(30*8*10)+" Euro mmaş alır.");
    }


}
