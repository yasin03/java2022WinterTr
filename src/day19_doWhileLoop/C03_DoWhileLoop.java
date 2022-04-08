package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // while loop ile 5 ten küçük pozitif tam sayıları yazdıralım
        int input = 5;
        int sayi = 1;
        int sayac = 1;

        while (sayi < input) {
            System.out.println(sayi);
            sayi++;
            sayac++;
        }
        System.out.println("sayac : " + sayac);

        sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);
    }
}
