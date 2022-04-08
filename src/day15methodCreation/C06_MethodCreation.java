package day15methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        //iki variable'ın değerlerini toplayan bir method oluşturalım.
        int a = 10;
        int b = 20;

        ikiSayiTopla(a,b);


    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayının toplamı : "+(a+b));
    }
}
