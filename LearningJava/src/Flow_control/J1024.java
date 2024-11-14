package Flow_control;

public class J1024 {
    public static void main(String[] args) {

//        // 1以上20以下陽の整数中７の倍数を出力

        // 陽の整数10➱１までを出力

        int bar[] = new int[3];
        for (int i = 0, j = 10; i < bar.length ; i++ ,j += 10) {
            bar[i] = j;
        }
        // bar 1次元配列（Array）内元素値を出力するコードを作成
        // 10, 20, 30
        for(int i = 0; i < bar.length; i++){
            System.out.println(bar[i]);
        }

        int kin[] = new int[5];
        for (int index = 0, value = 5; index < bar.length ; index++, value--){
            kin[index] = value;
        }

        for (int value :bar){
            System.out.println(value);
        }

        for (int index = 0; index < bar.length; index++){
            System.out.println(bar[index]);
        }

    }

//        while(){


}
