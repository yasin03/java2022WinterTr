package day14_stringManipulation;

import java.util.Scanner;

public class C02_Tersten {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Lütfen 4 harfli bir kelime giriniz.");
        
        String input ="grey";
        String tersStr=input.substring(3).toUpperCase()+input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+input.substring(0,1).toLowerCase();

        System.out.println("tersStr = " + tersStr);
        
        
    }
}
