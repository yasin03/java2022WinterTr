package day18_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan toplamak istediği sayıları alın ve kullanıcı 0'a basıncaya kadar
        // kullanıcı 0'a bastığında girdiği tüm sayıların toplamını yazdırın..

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam =0;
/*
        for (int i=1; i<1000000; i++) {
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi=scanner.nextInt();
            if (sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
        }
        System.out.println(toplam);
*/


        sayi=1;
        toplam =0;

        while(sayi!=0){
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi=scanner.nextInt();
            toplam+=sayi;

        }
        System.out.println(toplam);






    }
}
