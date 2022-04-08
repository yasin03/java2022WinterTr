package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz : ");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiğiniz iki sayıda pozitif olduğundan toplamları = "+
                    (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("Girdiğiniz iki sayıda negatif olduğundan çarpımları = "+
                    (sayi1*sayi2));
        }else if (sayi1*sayi2<0){
            System.out.println("Girdiğiniz iki sayıda farklı işaretlere sahip olduğundan işlem yapamazsınız.");
        }else {
            System.out.println("Sıfır çarpmada yutan elemandır.");
        }

    }
}
