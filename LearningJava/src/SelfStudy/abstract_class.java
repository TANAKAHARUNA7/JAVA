package SelfStudy;

abstract class Bar{
    abstract void prt();

    void ahh(){
        System.out.println("Ahh");
    }
}

class Foo extends Bar{
    void prt(){
        System.out.println("Foo");
    }

}

public class abstract_class {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.prt();

    }
}
