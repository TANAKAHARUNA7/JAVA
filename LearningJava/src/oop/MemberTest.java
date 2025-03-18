package oop;

class Enemy{
    // メンバー変数は初期化する必要がない。
//    int id; // instance member variable
    static int id ; // class member variable
    Enemy(){
        System.out.println(++id);
    }
}


public class MemberTest {
    public static void main(String[] args) {
        System.out.print(Enemy.id);

        Enemy e1 = new Enemy();
        Enemy e2 = new Enemy();
        Enemy e3 = new Enemy();
        Enemy e4 = new Enemy();
    }
}
