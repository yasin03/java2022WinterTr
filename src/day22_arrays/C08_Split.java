package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {

        // verilen cümlede istenen harfin kaç defa kullanıldığını yazdıran method oluşturun

        String cumle =  "Nerede o 'hello world' yazdıramayan öğrenciler?";
        String harf="e";

        harfKacKereKullanilmis(cumle,harf);




    }

    public static void harfKacKereKullanilmis(String cumle, String harf) {
        String cumle2[]=cumle.split("");
        int sayac = 0;

        for (int i = 0; i < cumle2.length; i++) {
            if (cumle2[i].equals(harf)) {
                sayac++;
            }
        }

        System.out.println(sayac);
    }
}
