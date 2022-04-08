package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
        // toplam kac tane olduklarini ekranda yazdirin

        int input =650;
        int bolum = 1;
        int sayac =0;

        while (bolum<=input){
            if (input%bolum==0){
                System.out.print(bolum+" ");

                sayac++;
            }
            bolum++;

        }
        System.out.println("");
        System.out.println(input+" sayısını tam bölen "+sayac+" adet sayı vardır.");

    }
}
