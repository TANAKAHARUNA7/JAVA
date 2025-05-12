package oop;

interface Connectable {

    // 必ず実装しなければいけない必須機能
    void connect();
    void disconnect();

    // すべての装備が使用できる基本状態点検機能
    default void diagnostic (){
        System.out.println("基本診断:　network接続状態正常");
    }
}

class Router implements Connectable {
    @Override
    public void connect(){
        System.out.println("Aがネットワークに接続しました");
    }
    @Override
    public void disconnect(){
        System.out.println("Aがネットワークに接続解除しました");
    }
}

class Switch implements Connectable {
    @Override
    public void connect(){
        System.out.println("Bがネットワークに接続しました");
    }
    @Override
    public void disconnect(){
        System.out.println("Bがネットワークに接続解除しました");
    }
    @Override
    public void diagnostic (){
        System.out.println("スウィッチ：すべてのポート正常作動");
    }

}

public class interface_test {
    public static void main(String[] args) {
        Connectable rou = new Router();
        rou.connect();
        rou.diagnostic();
        rou.disconnect();

        System.out.println();

        Connectable swi = new Switch();
        swi.connect();
        swi.diagnostic();
        swi.disconnect();

    }
}
