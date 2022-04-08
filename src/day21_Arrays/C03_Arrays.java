package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[];//deger atamasi yapmadik ama Java kabul etti ancak kulanmamiza izin vermez

        arr=new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        // String'deki length() , bunda yok
        // array'deki her bir elemani index degeri kadar artiralim

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        // son index'deki elementi yazdiralim
        System.out.println(arr[arr.length-1]); //5
    }
}
