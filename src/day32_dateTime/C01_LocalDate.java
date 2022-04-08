package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now();
        System.out.println(trh);  //2022-03-31
        LocalDate date = LocalDate.of(1982,4,26);

        System.out.println(trh.getDayOfMonth()); // 31
        System.out.println(trh.getDayOfWeek());  // THURSDAY
        System.out.println(trh.getDayOfYear());  // 90

        System.out.println(trh.minusWeeks(20)); // 2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(12));  // 2022-02-12

        System.out.println(trh.plusDays(90));  // 2022-06-2922



    }
}
