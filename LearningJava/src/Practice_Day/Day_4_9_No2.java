package Practice_Day;

abstract class Player2 {
    void shoot() { System.out.println("슛");}
}
class Sg2 extends Player2 {
    void shoot() { System.out.println("슈팅가드 슛");}
}
class Pg2 extends Player2 {
    void shoot() { System.out.println("포인트 슛");}
}
class C2 extends Player2 {
    void shoot() { System.out.println("센터 슛");}
}
class Pf2 extends Player2 {
    void shoot() { System.out.println("파워포워드 슛");}
}
class Sf2 extends Player2 {
    void shoot() { System.out.println("스몰포워드 슛");}
}
public class Day_4_9_No2 {
    public static void main(String[] args) {

        Player2 p[] = new Player2[5];
        p[0] = new C2();
        p[1] = new Sg2();
        p[2] = new Pg2();
        p[3] = new Sf2();
        p[4] = new Pf2();

        for (int i = 0; i < 5; i++) {
            p[i].shoot();
        }
    }
}

