package BasketMain;

abstract public class Player {
    String name;
    Player(String name){
        this.name = name;
    }
    // すべてのポジションに共通的に必要なメソッド
    void introduce(){
        System.out.println("Hi, I'm " + name);
    }

    // 抽象メソッド：各ポジション別に違う動作をしなければいけない
    abstract void play(); // 必ず子供が実装しなければならない
}
