package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C05_ListeTekrarsızYap {
    public static void main(String[] args) {

        // verilen listede tekrar eden sayıları sadece 1 kere yazdıran method oluşturun

        List<Integer> sayilar = new ArrayList<>(); //{1, 3, 5, 3, 5, 6, 1, 7};
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(sayilar);
        sayilar= tekrarsizListeOlusturYeni(sayilar);
        System.out.println(sayilar);

    }

    private static List<Integer> tekrarsizListeOlusturYeni(List<Integer> sayilar) {

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizListe.contains(sayilar.get(i))){
                tekrarsizListe.add(sayilar.get(i));
            }

        }

        return tekrarsizListe;

    }
}
