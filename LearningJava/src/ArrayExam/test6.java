package ArrayExam;

public class test6 {
    // メソッド
    // 変換値のデータタイプ　　メソッドの名前　　（媒介変数）
    // 1)　データタイプがある　or ない
    // 2)　データタイプ
    static int getSum (int argA, int argB){
        return argA + argB;
    }

    static int[] getSumAvg (int argA, int argB ){
        int sum = argA + argB;
        int avg = sum / 2;

        // sum, avg
        int[] retValue = {sum, avg};

        // 参照変数でreturnする
        return retValue;
    }

    // 変換値がない　→　void
    static void saySomething(){
        System.out.println("hello world");
    }

    public static void main (String [] args){

        int sum = getSum(2,3);
        System.out.println(sum);

        int bar [] = getSumAvg(2,6);

        System.out.println(bar[0] + ":" + bar[1]);

        saySomething();

    }
}
