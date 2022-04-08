package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        double etiketFiyatı=100;
        yuzdeOnIndirimYap(etiketFiyatı);
        yuzdeOnIndirimYap(etiketFiyatı);
    }

    private static void yuzdeOnIndirimYap(double etiketFiyatı) {
        etiketFiyatı=etiketFiyatı*0.90;
        System.out.println("Sizin için %10 indirimli fiyatımız : " + etiketFiyatı);
    }
}
