package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp bu sayıları ve aralarındaki
        // tüm tam sayıları yazdıran bir kod oluşturun

        int baslangic=40;
        int bitis = 60;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i==bitis){
                System.out.println(i);
            }else{
                System.out.print(i+", ");
            }

        }


        int i = baslangic;
        while (i<=bitis) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
