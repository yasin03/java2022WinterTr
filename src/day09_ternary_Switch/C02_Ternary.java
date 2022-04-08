package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz : ");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayı çift");
        } else {
            System.out.println("sayı tek");
        }

        System.out.println(sayi%2==0 ? "sayi çift" : "sayı tek");
    }
}
