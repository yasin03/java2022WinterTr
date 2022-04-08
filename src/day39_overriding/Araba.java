package day39_overriding;

public class Araba {

    protected String hareket = "Arabalar teker ile hareket eder.";
    protected String hiz = "Arabalar motor gücüne göre hız yaparlar.";
    protected String yakit = "Arabalar farklı yakıtlar kullanabilir.";
    protected String marka = "Arabalar üretildikleri markaya sahiptir.";



    public void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar.");
    }

    public void yakitTüketimi(){
        System.out.println("Arabalar motor gücü ve yakıt tüketimine göre yakıt tüketirler.");
    }




}
