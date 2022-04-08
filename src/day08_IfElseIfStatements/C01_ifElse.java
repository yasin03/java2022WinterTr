package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_ifElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz : ");
        char karakter =scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')||(karakter>='a' && karakter<='z')){
            System.out.println("Girdiğiniz değer karakterdir.");
        }else{
            System.out.println("Girdiğiniz değer karakter değildir.");
        }

    }
}
