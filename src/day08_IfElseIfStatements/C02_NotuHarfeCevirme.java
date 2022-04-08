package day08_IfElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");

        double not = scan.nextDouble();

        if (not<50){
            System.out.println("Notunuz : D ");
        }else if (not<60){
            System.out.println("Notunuz : C ");
        }else if (not<80){
            System.out.println("Notunuz : B ");
        }else{
            System.out.println("Notunuz : A ");
        }
    }
}
