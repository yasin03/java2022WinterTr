package day30_passByValue;

public class C01_StaticBlocks {
    static {
        System.out.println("Statik blok çalıştı.");
    }
            /*
           static block class ilk calismaya basladiginda devreye girer
           ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
           yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
           static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
            */
    C01_StaticBlocks() {
        System.out.println("Constructor çalıştı.");
    }

    static {
        System.out.println("Statik Blok 2 çalıştı.");
    }
    public static void main(String[] args) {
        System.out.println("Main method başlabgıcı..");
        C01_StaticBlocks obj = new C01_StaticBlocks();


    }
}
