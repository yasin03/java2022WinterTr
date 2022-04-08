package day03_scanner;

import java.util.Scanner;

public class C03_ScanCember {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Çemberin Yarıçapını Giriniz : ");

        float yaricap = scanner.nextFloat();

        System.out.println("Girdiğiniz Yarıçap : "+ yaricap);
        System.out.println("Çemberin Alanı : "+ 2*3.14*yaricap);
        System.out.println("Çemberin Çevresi : "+ 3.14*yaricap*yaricap);
    }
}
