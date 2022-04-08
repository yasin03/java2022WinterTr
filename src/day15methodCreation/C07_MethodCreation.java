package day15methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        hosgeldinYazdir();
    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz...");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hoşgeldin...");
        stringYazdir("Böyle de olur..");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
