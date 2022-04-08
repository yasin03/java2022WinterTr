package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        isimler.set(1,"Seckin");      // yusuf gitti yerine seckin geldi..
        System.out.println(isimler);

        List<String> logList = new ArrayList<String>();

        logList.add(isimler.set(2,"Cosmos"));
        System.out.println(isimler);
        System.out.println(logList);

    }
}
