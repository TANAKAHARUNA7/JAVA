package lecture;

public class Test1 {
    public static void main(String[] args) {

        byte bar = 1;

        // コンパイラーがデータタイプに合わせて＋1を実行
        bar += 1;
        bar++;

        // bar = bar + 1;  →　エラーが発生
        bar = (byte) (bar + 1); //

        int foo = 3;

        boolean result = 1 < foo && foo < 10;
        System.out.println(result); // true
        System.out.println(!result); // false
        ////////////////////////////////////////////////

        int kin = 1;
        // 前のやつがfalseだったら後ろの条件文まではいかない
        if (2 > 3 && (bar += 1) > 4) {

            // 前のやつが
            // if ( 2 < 3 && (bar += 1 ) > 4){


        }


    }
}


