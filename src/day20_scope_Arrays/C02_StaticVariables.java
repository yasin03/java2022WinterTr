package day20_scope_Arrays;

public class C02_StaticVariables {
/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz
       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir */

    static String okulIsmi="Yıldız Koleji";
    static  int okulNo;
    static boolean okulAcikmi;

    public static void main(String[] args) {
        okulIsmi="sda";
        System.out.println(okulNo);
        okulNo=102;
        System.out.println("okulNo = " + okulNo);
        System.out.println("okulAcikmi = " + okulAcikmi);

        staticMethod();

        System.out.println("okulNo = " + okulNo);

    }



    public static void staticMethod(){
        okulNo=200;
        System.out.println("okulNo = " + okulNo);
    }
}
