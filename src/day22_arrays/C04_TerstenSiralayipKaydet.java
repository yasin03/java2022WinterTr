package day22_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C04_TerstenSiralayipKaydet {
    public static void main(String[] args) {
        // verilen bir arrayi büyükten küçüğe sıralayan ve kaydeden method oluşturun

        int arr[] = {2, 5, 7, 3, 1, 67, 9, 5, 54};

        arr = terstenSirala(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] terstenSirala(int[] arr) {
        Arrays.sort(arr);
        int tersArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }
        return tersArr;
    }
}
