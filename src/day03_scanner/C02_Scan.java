package day03_scanner;

import java.util.Scanner;

public class C02_Scan {
    public static void main(String[] args) {


        System.out.println("Kulanıcı Adı Giriniz : ");
        Scanner scan = new Scanner(System.in);

        String kullanici=scan.nextLine();
        System.out.println("Kulanıcı Adı : "+ kullanici);


    }
}
