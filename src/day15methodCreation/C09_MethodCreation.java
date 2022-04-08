package day15methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        String isim = "Oguzhan";
        String soyisim = "Balkaya";
        String kart = "1234567890124547";

        isimSoyisimGizle(isim,soyisim);
        kartGizle(kart);

    }

    private static void kartGizle(String kart) {
        String kartyeni="**** **** **** "+kart.substring(12);
    }

    private static void isimSoyisimGizle(String isim, String soyisim) {
        String isimyeni= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String soyisimyeni= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");
        String kartyeni = null;
        System.out.println(isimyeni+" "+soyisimyeni+"\n"+kartyeni);
    }
}
