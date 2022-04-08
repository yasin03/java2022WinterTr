package day24_List;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[]={};

        arr = C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));

        arr= C06_Arrays.arrayeElemanEkle(arr,18);
        System.out.println(Arrays.toString(arr));

        List<Integer> sayilarList = new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);
        sayilarList.add(3);

        System.out.println(sayilarList);

        sayilarList.add(0,7);
        System.out.println(sayilarList);
        sayilarList.add(2,7);
        System.out.println(sayilarList);
        System.out.println(sayilarList.size());




    }
}
