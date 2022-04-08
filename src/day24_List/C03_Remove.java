package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilarList = new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        System.out.println(sayilarList);
        sayilarList.add(2,7);
        System.out.println(sayilarList);

        // sayilarList.remove(3);

        // int sayi =5;
        // sayilarList.remove(sayi);  // sayıyı kaldırmadı

        Integer sayi = 5;             // sayıyı kaldırdı sayı obje olduğundan non-primitive
        sayilarList.remove(sayi);

        System.out.println(sayilarList);
    }
}
