package day05_MatematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int a = 15;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;



        sayi2=sayi1++;

        System.out.println(sayi1+" , "+sayi2+" , "+sayi3);

        sayi3=++sayi1;
        System.out.println(sayi1+" , "+sayi2+" , "+sayi3);

        System.out.println(--sayi2);
        System.out.println(sayi2);

    }
}
