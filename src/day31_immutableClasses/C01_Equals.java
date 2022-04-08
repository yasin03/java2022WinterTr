package day31_immutableClasses;

public class C01_Equals {
    public static void main(String[] args) {
        String str1= "Eren";
        String str2= "Eren";                 // String havuzunda "Eren" i arar bulursa referans ve değeri aynı yer olur.

        String str3= new String("Eren"); // new olarak oluştuğundan ramda ayrı obje olarak oluşur.

        String str4 = str1+"";  // hiçlik ataması yapıldığından farklı string olarak algılar.

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);


    }
}
