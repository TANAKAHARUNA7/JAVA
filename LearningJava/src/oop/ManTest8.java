package oop;

class Parent{
    String msg = "親メッセージ";
}

class Child extends Parent{
    String msg  = "子メッセージ";

    void prt(){
        System.out.println(msg);
        System.out.println(this.msg);
        System.out.println(super.msg);
    }
}

public class ManTest8 {
    public static void main(String[] args) {
        Child c = new Child();
        c.prt();

    }
}