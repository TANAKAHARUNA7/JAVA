package lectureMaterials;

interface EngineBracket{
    void start();
    void stop();
}
class BenzEngine implements EngineBracket{
    @Override
    public void start(){
        System.out.println("Benz Engine start");
    }
    @Override
    public void stop(){
        System.out.println("Benz Engine stop");
    }
}

class BMWEngine implements EngineBracket{
    @Override
    public void start(){
        System.out.println("BMW Engine start");
    }
    @Override
    public void stop(){
        System.out.println("BMW Engine stop");
    }
}

class AudiEngine implements EngineBracket{
    @Override
    public void start(){
        System.out.println("AudiEngine start");
    }
    @Override
    public void stop(){
        System.out.println("AudieEngine stop");
    }
}
 // LandRover自動車はどんな会社の自動車でもEngineBracket企画さえ合えば装着可能
class LandRover{
     private EngineBracket engine; // インターフェイスタイプでエンジン参照　→　多様性適用

     public LandRover(EngineBracket engine){
         this.engine = engine;
     }

     public void drive(){
         engine.start(); // 動的バインディング -> 実際のエンジンクラスのstart()放出される
         System.out.println("LandRover が走行を始めました");
     }

     public void stop(){
         engine.stop(); // 動的バインディング -> 実際のエンジンクラスのstop()放出される
     }
}

public class interface_test {
    public static void main(String[] args) {
        // 1. BMW エンジンを装着
        EngineBracket bmwEngine = new BMWEngine();
        LandRover car1 = new LandRover(bmwEngine);
        System.out.println("[BMW エンジン装着テスト]");
        car1.drive();
        car1.stop();

        System.out.println();

        // 2.Benzエンジンを装着
        EngineBracket benzEngine = new BenzEngine();
        LandRover car2 = new LandRover(benzEngine);
        System.out.println("[Benz エンジン装着テスト]");
        car2.drive();
        car2.stop();

        System.out.println();

        // 3. Audiエンジンを装着
        EngineBracket AudiEngine = new AudiEngine();
        LandRover car3 = new LandRover(AudiEngine);
        System.out.println("[Audi エンジン装着テスト]");
        car3.drive();
        car3.stop();
    }
}
