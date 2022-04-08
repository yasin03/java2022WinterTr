package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<String>();
        harfler.add("D"); // [D]
        harfler.add("M"); // [D, M]
        harfler.add(1,"T"); // [D, T, M]
        harfler.add(0,"T"); // [T, D, T, M]

        System.out.println(harfler);

        System.out.println(harfler.contains("T"));
        System.out.println(harfler.contains("f"));

        List<String> karakterler = new ArrayList<String>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harfler.containsAll(karakterler));


    }
}
