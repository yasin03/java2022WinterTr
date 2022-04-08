package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        // verilen bir arrayi büyükten küçüğe sıralayan ve yazdıran method oluşturun

        int arr[]={2,5,7,3,1,67,9,5,54};
        terstenSiralaYazdir(arr);


    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
