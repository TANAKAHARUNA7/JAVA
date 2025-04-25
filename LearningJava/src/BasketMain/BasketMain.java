package BasketMain;

public class BasketMain {
    public static void main(String[] args) {
        Player[] players = {
                new PG("へチャン"),
                new PF("マーク"),
                new C("ジェノ"),
                new SF("ジェミン"),
                new SG("チソン")
        };

        for (Player p : players) {
            p.introduce();
            p.play();
            System.out.println();
        }
    }
}
