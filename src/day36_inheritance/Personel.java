package day36_inheritance;

public class Personel {
    protected int persNo;
    protected String isim;
    protected String soyisim;
    protected String adres;
    protected String tel;





    @Override
    public String toString() {
        return "Personel{" +
                "persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
