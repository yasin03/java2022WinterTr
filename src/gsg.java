public class gsg {
    public static void main(String[] args) {
        //Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e
// sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz.
// (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

    //    Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
    //    yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
        int arr[][]= { {1,2,3}, {4,5,6} };

        int sonuc = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                sonuc*=arr[i][j];
                System.out.println(arr[i][j]);
            }
        }

        System.out.println(sonuc);


    }
}
