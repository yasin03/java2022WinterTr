package day39_overriding;

public class Corolla extends Toyota {

    protected String hiz = "Corolla max 200 km hız yapar.";
    protected String yakit = "Corolla benzinli veya elektriklidir.";
    protected String model = "Corolla";


    public void motor() {
        System.out.println("Corolla araçlar çevreci motor kullanır.");
    }

    public void yakitTüketimi() {
        System.out.println("Corolla motor gücü ve yakıt tüketimine göre yakıt tüketirler.");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 vitestir.");
    }

    public static void main(String[] args) {

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); //araba
        System.out.println(arb1.hiz);     //corolla
        System.out.println(arb1.yakit);   //corolla
        System.out.println(arb1.marka);   //toyota
        System.out.println(arb1.sirketMerkezi);  //toyota
        System.out.println(arb1.model);  //corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); //araba
        System.out.println(arb2.hiz);     //toyota
        System.out.println(arb2.yakit);   //araba
        System.out.println(arb2.marka);   //toyota
        System.out.println(arb2.sirketMerkezi);  //toyota
        // System.out.println(arb2.model);  //cte
        arb2.motor();   //corolla   ==> override edilmiş
        arb2.garanti(); //toyota    ==> override edilmemiş
        arb2.yakitTüketimi(); //araba
        arb2.yakitTüketimi(); //araba


        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); //araba
        System.out.println(arb3.hiz);     //araba
        System.out.println(arb3.yakit);   //araba
        System.out.println(arb3.marka);   //araba
        // System.out.println(arb3.sirketMerkezi);  //cte
        // System.out.println(arb3.model);  //cte



    }


}
