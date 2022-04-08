package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        System.out.println(sayi);

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 0;

        System.out.println("Bilgisayar 1-100 arası bir sayı tahmin etmiştir.\nBu sayıyı tahmin edermisin..");

        while (sayi != tahmin) {
            System.out.println("Tahminim : ");
            tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.print("Daha küçük sayı söylemelisin..");

            } else if (tahmin < sayi) {
                System.out.print("Daha büyük sayı söylemelisin..");
            }
            sayac += 1;
        }
        System.out.println(sayac + " kerede bildiniz..");


    }
}
