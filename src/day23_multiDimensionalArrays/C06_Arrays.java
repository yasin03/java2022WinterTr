package day23_multiDimensionalArrays;

public class C06_Arrays {
    public static void main(String[] args) {







    }

    public static int[] arrayeElemanEkle(int[] array, int eklenecekelement) {
        int[] yeniArray = new int[array.length+1];
        // yeniArray = array; 3 elemanlı eski arrayi kopyalar...
        for (int i = 0; i < array.length; i++) {
            yeniArray[i] = array[i];
        }
        yeniArray[yeniArray.length-1] = eklenecekelement;
        return yeniArray;
    }
}
