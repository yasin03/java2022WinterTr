package day11_StringManipulation;

public class C02_Equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali"+" Can";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("== ile karşılaştır : " + (str1==str2));
        System.out.println("equals ile karşılaştır : "+str1.equals(str2));

        String str3=str1+"";
        System.out.println("str3 = " + str3);
        System.out.println("== ile karşılaştır : " + (str3==str2));
        System.out.println("equals ile karşılaştır : "+str3.equals(str2));

        String str5="hasan";
        String str6="HASAN";
        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));
    }
}
