package day03_scanner;

import java.util.Scanner;

public class C03_ScanAd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        String isim = scanner.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz : ");
        String soyisim=scanner.nextLine();

        System.out.println("İsminiz : "+isim + "  Soyisminiz : "+ soyisim);


    }
}
