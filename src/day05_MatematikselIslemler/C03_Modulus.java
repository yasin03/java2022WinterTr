package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=scan.nextInt();

        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }
}
