package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {
        // kullanıcıdan istediği kadar sayı girmesini isteyin
        // kullanıcının girdiği sayiların toplami 500' ü geçerse artık yeter çok sayı girdin , toplam.... oldu yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam =0;

        while (toplam<500){
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi=scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println("artık yeter çok sayı girdin , girdiğin sayıların toplamı :"+ toplam);
    }
}
