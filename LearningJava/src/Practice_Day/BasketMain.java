package Practice_Day;

class Player{
    protected String name;
    protected String position;

    public Player(String argName, String argPosition){
        name = argName;
        position = argPosition;
    }
    public void shoot (){
        System.out.println(position + " " + name + ": 基本シュート");
    }
}
class Sg extends Player{
    public Sg(String argName){
        super(argName, "シューテインガード");
    }

    @Override
    public void shoot(){
        System.out.println(position + " " + name + ": 3点シュート！");
    }
}

class Pg extends Player{
    public Pg(String argName){
        super(argName, "ポイントガード");
    }

    @Override
    public void shoot(){
        System.out.println(position + " " + name + ": 돌파 후 점퍼!");
    }
}

class Center extends Player{
    public Center(String argName){
        super(argName, "センター");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 골밑슛!");
    }
}

class Pf extends Player{
    public Pf(String argName){
        super(argName, "パワーフォワード");
    }

    @Override
    public void shoot(){
        System.out.println(position + " " + name + ": ミドルシュート！");
    }
}

class Sf extends Player{
    public Sf(String argName){
        super(argName, "스물 포워드");
    }

    @Override
    public void shoot(){
        System.out.println(position + " " + name + ": スラッシヱンドライブ！");
    }
}

public class BasketMain {
    public static void main(String[] args) {
        Player[] team = {new Pg("민수"),
                        new Sg("준호"),
                        new Sf("지훈"),
                        new Pf("영철"),
                        new Center("성민")
        };

        System.out.println("[チームシュート練習開始]\n");

        for (Player p : team) {
            p.shoot();
        }
    }
}
