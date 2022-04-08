package day14_stringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin

        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        String sifre = "rhd6645";

        boolean ilkharf=false;

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            ilkharf=true;
        }else{
            System.out.println("Sifrenizin ilk harfi büyük harf olmalı");
        }
        boolean sonharf=false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length() - 1)<='z'){
            sonharf=true;
        }else{
            System.out.println("Sifrenizin son harfi küçük harf olmalı");
        }
        boolean bosluk=false;
        if (!sifre.contains(" ")){
            bosluk=true;
        }else{
            System.out.println("Sifrenizde boşluk olmamalı");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        }else{
            System.out.println("Sifreniz en az 8 karakter olmalı");
        }



        if (ilkharf&&sonharf&&bosluk){
            System.out.println("Şifre başarılı bir şekilde kaydedildi.");
        }






        /*System.out.println((sifre.length() >= 8) ?
                ((!sifre.contains(" ") ?
                        ((sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') ?
                                ((sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') ?
                                        "sifre basarı ıle tanımlandı" :
                                        "sıfre kucuk harf ile bitmeli") :
                                "sifre buyuk harf ile baslamalı") :
                        "sifre bosluk ıcermemelı")) :
                "sifre uzunlugu en az 8 karakter olmalı");*/
    }
}
