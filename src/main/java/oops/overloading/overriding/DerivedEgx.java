package oops.overloading.overriding;

public class DerivedEgx extends BaseEgx {
    void message()
    {
        System.out.println("this is printed inside derivedclass which inherited baseclass");
    }

    public static void main(String[] args) {

        DerivedEgx obj=new DerivedEgx();
        obj.message();

        BaseEgx d=new DerivedEgx();//upcasting//run-time polymorphism//late-binding
        d.message();

    }
}
