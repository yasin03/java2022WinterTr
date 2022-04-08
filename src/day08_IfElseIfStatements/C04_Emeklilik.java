package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazınız :" +
                "\n Kadın için : K \n Erkek için : E harfini giriniz.");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz : ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 && yas >120) {
                System.out.println("Lütfen girdiğiniz yaş değerini kontrol edin.");
            }else if (yas<60){
                System.out.println("Emekli olamazsın \n Daha"+(60-yas)+" yıl çalışman gerekli");
            }else {
                System.out.println("Emekli olabilirsin.");
            }
        } else if (cinsiyet == 'E') {
            if (yas < 0 && yas >120) {
                System.out.println("Lütfen girdiğiniz yaş değerini kontrol edin.");
            }else if (yas<60){
                System.out.println("Emekli olamazsın \n Daha"+(65-yas)+" yıl çalışman gerekli");
            }else {
                System.out.println("Emekli olabilirsin.");
            }
        } else {
            System.out.println("Lütfen cinsiyet için geçerli bir harf giriniz.");
        }


    }
}
