package day14_stringManipulation;

public class C03_Toplam {
    public static void main(String[] args) {
       /* 
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String str1 = “$13.99”
        String str2 = “$10.55”
        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        */
        String str1="$13.99";
        String str2="$10.55";

        str1 =str1.replaceAll("\\D","");
        str2 =str2.replaceAll("\\D","");

        double toplam = Double.parseDouble(str1)+Double.parseDouble(str2);
        System.out.println("toplam = " + toplam);
    }
}
