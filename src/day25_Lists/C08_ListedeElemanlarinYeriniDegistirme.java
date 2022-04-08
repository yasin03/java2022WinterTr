package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

        // Verilen bir listede istenen iki indexteki elementlerin yerini kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>(); //{1, 3, 5, 3, 5, 6, 1, 7};
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        sayilar = swapElements(sayilar, ilkIndex, ikinciIndex);


    }

    private static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        int temp = ilkIndex;




        return sayilar;
    }
}
