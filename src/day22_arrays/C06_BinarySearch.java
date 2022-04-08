package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        // Eğer Javada hazır binarysearch ile yapmak isterseniz.. Önce sort methodunu kullanıp
        // sonra binarysearch yapmaliyiz..

        int arr[] = {2, 5, 7, 3, 1, 67, 9, 5, 54};
        int istenenSayi=7;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 5, 5, 7, 9, 54, 67]
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // 5

        // Eğer olmayan bir elementi aratırsak
        // Java bulamadığını göstermek için - işareti koyar ve o sayı olsaydı sıralaması ne olacak ise onu yazar.

        // Olan sayılar index döner olmayan sayılar -sıra döner

    }
}
