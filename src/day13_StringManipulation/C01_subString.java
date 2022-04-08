package day13_StringManipulation;

public class C01_subString {
    public static void main(String[] args) {
        String str1 = "Java java java 0123";
        System.out.println("str = " + str1);
        System.out.println(str1.replaceAll("\\D","*"));

        String str = "1-48 of 104 results for \"nutella\"";
        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

        String sonuc=str.substring(ikinciSpace+1,ucuncuSpace);
        System.out.println("sonuc = " + sonuc);
        int sonucint=Integer.valueOf(sonuc);

    }
}
