package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {
        // Verilen iki sayıyı toplayan method oluşturunuz.
        int sayi1=10;
        int sayi2=20;

        SayiTopla(sayi1,sayi2);

        double sayi3 =15.2;
        double sayi4 =10.6;

        SayiTopla(sayi3,sayi4);
    }

    private static void SayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double sayının toplamı = "+(sayi3+sayi4));
    }

    private static void SayiTopla(int sayi1, int sayi2) {
        System.out.println("iki sayının toplamı = "+(sayi1+sayi2));
    }
}
