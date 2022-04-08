package day21_Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"Ali", "Veli","Ayşe"};

        System.out.println(arr1[0]);
        
        arr1[1]="Esila";
        System.out.println("arr1[1] = " + arr1[1]);

        // Array içerisindeki indexi kullanarak elementlere ulaşabilir ve update edebiliriz.

        int arr2[]= new int[4];
        System.out.println(arr2[3]);

        System.out.println(arr2);
    }
}
