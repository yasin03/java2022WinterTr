package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın.

        int input=120;
        int rakam=0;
        int toplam=0;

        while (input>0){
            rakam = input%10;
            toplam+=rakam;
            input/=10;
        }
        System.out.println(toplam);





    }
}
