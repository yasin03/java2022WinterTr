package day14_stringManipulation;

public class C01_Trim {
    public static void main(String[] args) {
        String str = "     Siz ne derseniz deyin, Java bildiğini okur.    ";
        str.trim();
        System.out.println(str);
        System.out.println(str.length());

        str= str.trim();
        System.out.println(str);
        System.out.println(str.length());
    }
}
