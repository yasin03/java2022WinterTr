package day38_inheritance_overriding;

public class Iscı extends Personel {
    public String statu = "İşçi";
    public String haklar = "İşçiler kıdem tazminatı alırlar.";
    public String ikramiye = "İşçiler yılda bir kez ikramiye alır.";

    public void  mesai(){
        System.out.println("Türm işçiler haftalık 40 saat çalışır.");
    }

    public void maasHesapla(){
        System.out.println("Türm işçiler 30 gün x 8 saat x 11 euro = "+(30*8*11)+" Euro mmaş alır.");
    }
}
