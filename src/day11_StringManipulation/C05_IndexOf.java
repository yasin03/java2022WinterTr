package day11_StringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str = "Java bir başka Güzeldir";

        System.out.println(str.indexOf('r'));

        System.out.println(str.indexOf('b',5));

        int ilkindex=str.indexOf('b');
        System.out.println(str.indexOf('b',ilkindex+1));
    }
}
