package day14_stringManipulation;

public class C04_AdGizleme {
    public static void main(String[] args) {
        /*Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234*/

        String isim = "Oguzhan";
        String soyisim = "Balkaya";
        String kart = "1234567890124547";

        String isimyeni= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String soyisimyeni= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        String kartyeni="**** **** **** "+kart.substring(12);

        System.out.println(isimyeni+" "+soyisimyeni+"\n"+kartyeni);
    }
}
