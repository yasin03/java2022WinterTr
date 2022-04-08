package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz :");
        int yas = scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli Olabilirsiniz!");
        }else {
            System.out.println("Emekli olamazsınız!");
            System.out.println("Emekli olmanıza "+ (65-yas) +" yıl var!");
        }

    }
}
