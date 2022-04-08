package day34_accessModifier_Encapsulation;

public class C03 {
    private static int sayi;
    private String str;


    public static int getSayi() {
        return sayi;
    }

    public static void setSayi(int sayi) {
        C03.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


}
