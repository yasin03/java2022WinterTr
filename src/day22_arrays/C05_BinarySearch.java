package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2, 5, 7, 3, 1, 67, 9, 5, 54};
        int istenenSayi=1;

        istenenElemanVarmi(arr,istenenSayi);


    }

    public static void istenenElemanVarmi(int[] arr, int istenenSayi) {
        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenenSayi){
                sonuc=true;

                break;
            }
        }
        System.out.println(sonuc);
    }
}
