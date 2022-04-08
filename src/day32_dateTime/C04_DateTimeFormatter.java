package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         h : 12 saat dilimine göre 2 rakam
         hh: 12 saat dilimine göre tek rakamları tek rakam

         m : minute tek rakamları tek
         mm: minute tek rakamları 0'lı

         a yazarsak AM veya PM degerini yazar


         */
    public static void main(String[] args) {

        LocalDateTime trh=LocalDateTime.now();
        System.out.println(trh);

        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(frm.format(trh));  // 31/03/2022



    }
}
