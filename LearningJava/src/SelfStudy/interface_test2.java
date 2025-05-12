package SelfStudy;
// 機能別インターフェース
interface Flyable {
    void fly();
    default void status(){
        System.out.println("飛びます");
    }
}
interface Swimmable{
    void swim();
    default void status(){
        System.out.println("泳ぎます");
    }
}
// 多重継承インターフェース
interface Amphibious extends Flyable, Swimmable{
    void transform();
    @Override
    default void status(){
        Flyable.super.status();
        Swimmable.super.status();
        System.out.println("Amphibious: 状態を統合表示");
    }
}

class AmphibiousCar implements Amphibious{
    @Override
    public void fly(){
        System.out.println("空を飛んでいます");
    }
    @Override
    public void swim(){
        System.out.println("水上を走っています");
    }
    @Override
    public void transform(){
        System.out.println("モード切替（水⇔空）");
    }
    @Override
    public void status(){
        System.out.println("AmphibiousCar: 全システム正常");
    }
}

public class interface_test2 {
    public static void main(String[] args) {
        Flyable flyObj = new AmphibiousCar();
        Swimmable swimObj = new AmphibiousCar();
        Amphibious amphObj = new AmphibiousCar();

        System.out.println("=== Flyableとして ===");
        flyObj.fly();
        flyObj.status();

        System.out.println("\n=== Swimmableとして ===");
        swimObj.swim();
        swimObj.status();

        System.out.println("\n=== Amphibiousとして ===");
        amphObj.fly();
        amphObj.swim();
        amphObj.transform();
        amphObj.status();
    }
}
