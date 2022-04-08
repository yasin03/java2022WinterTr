package day11_StringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz?\nEvet veya Hayır yazınız.");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Cevabınız : " + cevap + " derse katılımınız onaylanmıştır.");
        }else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("Cevabınız : " + cevap + " sonraki derslere bekleriz.");
        }else{
            System.out.println("Lütfen evet veya hayır yazınız");
        }
    }
}
