package Practice_Day;
//
//class Parent{
//    void prt(){ System.out.println("Parent prt"); }
//}
//class Child extends Parent{
//    void prt(){
//        super.prt();
//        System.out.println("Child prt"); }
//}
//========================================================
//class Student{
//    String name = "HARUNA";
//    int age = 20;
//
//    @Override
//    public String toString(){
//        return "名前: "+name+", 年齢: "+age;
//    }
//}
//========================================================
//class Player2 {
//    public void shoot() {
//        System.out.println("シュート");
//    }
//}
//class Sg2 extends Player2{
//    int x = 2;
//    void shoot() {
//        System.out.println("シューティンカードシュート");
//    }
//}
//class Pg2 extends Player2{
//    int x = 3;
//    void shoot() {
//        System.out.println("ポイントカードシュート");
//    }
//}
//==============================================================
//class Bar{
//    private int score ;
//    void prt(){
//        System.out.println(x);
//    }
//    // Getter, Setter Method
//    int getScore(){ return score;}
//
//    boolean setScore(int newScore) {
//        if (newScore >= 0 && newScore <= 100) {
//            score = newScore;
//            return true;
//        }
//        return false;
//    }
//}
//=================================================================
//



class A2 {
    public int x = 3;
}

class B2 extends A2 {
    void prt(){ System.out.println(x); }
}


public class Day_4_14 {
    public static void main(String[] args) {
//        new C hild().prt();
        // =============================================================
//        Student std = new Student();
//        System.out.println("名前: " + std.name + ", 年齢: " + std.age );
//        System.out.println(std);
        //===============================================================
//        Player2 p[] = new Player2[2];
//        p[0] = new Sg2();
//        p[1] = new Pg2();
//
//        for( int i = 0; i < p.length ; i++ ){
//            p[i].shoot();
//        }
        //===============================================================
        new B().prt();

    }
}
