package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasi {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1986,9,26);
        System.out.println(Period.between(dogumGunu,bugun).getYears());
    }
}
