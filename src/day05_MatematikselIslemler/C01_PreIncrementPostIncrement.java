package day05_MatematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        sayi++;
        ++sayi;
        System.out.println("pre : "+ sayi);

        System.out.println("pre : "+ ++sayi);
        System.out.println("pre : "+ sayi);

        System.out.println("post : "+ sayi++);
        System.out.println("post : "+ sayi);


    }
}
