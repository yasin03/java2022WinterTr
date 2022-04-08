package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_HaftaninGunleri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz : ");

        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")){
            System.out.println("Girdiğiniz gün haftasonudur.");
        }else{
            System.out.println("Girdiğiniz gün haftaiçidir.");
        }
    }
}
