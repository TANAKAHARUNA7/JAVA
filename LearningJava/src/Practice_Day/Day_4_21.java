package Practice_Day;

class A3 {
    int x = 2;
}
class B3 extends A3 { int y = 3; }
class C4 extends A3 { int z = 4; }

public class Day_4_21 {
    public static void main(String[] args) {
        A3 bar = new B3();
//        System.out.println( ((B3)bar).y );
        if(bar instanceof C4) {
            System.out.println("This is a C4");
        } else {
            System.out.println("This is a B4");
        }
   }
}
