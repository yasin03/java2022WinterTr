package day30_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {
        double etiketFiyati = 100;
        double indirimYuzdesi = 10;

        kaliciIndirimYap(etiketFiyati, indirimYuzdesi);
        System.out.println("indirimli fiyat : " + etiketFiyati);


    }

    private static double kaliciIndirimYap(double etiketFiyati, double indirimYuzdesi) {
        etiketFiyati = etiketFiyati * (100 - indirimYuzdesi) / 100;
        return etiketFiyati;
    }


}
