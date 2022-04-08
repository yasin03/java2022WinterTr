package day39_overriding;

public class OverridingChild extends OverridingParent {

    public static void method1(){
        System.out.println("child class method 1");
    }


    public static void main(String[] args) {

        method1(); //child class method 1
        method2(); //parent class method 2

        OverridingChild obj1 = new OverridingChild();
        obj1.method1(); //child class method 1
        obj1.method2(); //parent class method 2

        OverridingParent obj2 = new OverridingChild();
        obj2.method2(); //parent class method 2
        obj2.method1(); //child class method 1     ==> parent ezildiği override edildiği için child yazar.

        OverridingParent obj3 = new OverridingParent();
        obj3.method1(); //parent class method 1
        obj3.method2(); //parent class method 2
    }

}
