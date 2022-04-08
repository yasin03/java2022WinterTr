package day11_StringManipulation;

import java.util.Locale;

public class C01_toLower_toUpper {
    public static void main(String[] args) {
        String str= "Java Güzeldir";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));

    }
}
