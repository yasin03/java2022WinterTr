package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        boolean sonuc= isimler.remove("Oguzhan");

        if (sonuc){
            System.out.println("İstediğiniz isim silindi.");
        }else{
            System.out.println("İstediğiniz isim listede olmadığından silinemedi.");
        }
        System.out.println(isimler);
    }
}
