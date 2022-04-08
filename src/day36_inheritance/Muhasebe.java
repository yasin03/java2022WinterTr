package day36_inheritance;

public class Muhasebe extends Personel{

    protected int saatÜcreti;
    protected String statu;
    protected int maas;



    protected int maasHesapla(){
        int maas=saatÜcreti*8;
        return maas;
    }

}
