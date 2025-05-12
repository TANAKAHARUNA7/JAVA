package Practice_Day;

class Bar2 {
    void level1() {
        level2();
    }

    void level2() {
        level3();
    }

    void level3() {
        throw new RuntimeException("例外発生位置: level3()");
    }
}

public class Day_5_12 {
    public static void main(String[] args) {
        try {
            new Bar2().level1();
        } catch (RuntimeException e) {
            System.out.println("例外をキャッチしました！");
            System.out.println("メッセージ: " + e.getMessage());
        }
        System.out.println("プログラムは実行されました");
    }
}