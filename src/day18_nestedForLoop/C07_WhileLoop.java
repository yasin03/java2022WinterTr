package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan kaç sayı toplamak istediğini alın ve bu sayıların toplamını ekrana yazdırın..

        int sayiadedi=3;

        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int toplam =0;

        for (int i = sayi; i <=sayiadedi ; i++) {
            System.out.println("Lütfen bir sayı giriniz : ");
            sayi=scan.nextInt();
            toplam+=sayi;
        }

        System.out.println("Girilen "+sayiadedi+" sayının toplamı : "+toplam);

        /*
        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayi<=sayac){
            System.out.println("Lütfen bir sayı giriniz : ");
            sayi=scan.nextInt();
            toplam+=sayi;
        }*/

    }
}
