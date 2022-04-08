package day15methodCreation;

import java.util.Scanner;

import static day15methodCreation.C04.*;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise hardf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.next();
        int harfSayisi = kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");
        }else if(harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("kelime cok uzun");
        }


    }
}
