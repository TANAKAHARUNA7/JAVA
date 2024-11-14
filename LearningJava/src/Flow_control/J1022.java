package Flow_control;

public class J1022 {
    public static void main(String[] args) {
//        int bar =0;
//        // 条件式に使用される変数の宣言と初期値を設定
//        for(System.out.println("初期値") ; bar < 2 ; System.out.println("初期値") ){
//            // 実行文
//            System.out.println("Hello World");
//            bar++;

        //////////////////////////////////////////////////////
//
//        for (int bar = 0, pos = 2 ; bar < 5 && pos < - 3 ; bar++, pos--){
//            // 実行文
//            System.out.println("Hello world");
//        }
//
//        /////////////////////////////////////////////////////
//
//            //初期値　；　条件式　;　中間式
//        for (int i = 0; i < 10 ; i++){
//            System.out.println(i);
//        }
//
//        ////////////////////////////////////////////////////
//
//        int i = 20;
//
//        for (int iCount = 1; iCount <= 10; iCount++){
//            if (iCount % 2 == 0){
//                System.out.println(iCount);
//            }

        ////////////////////////////////////////////////////

//        char bar = 33;
//        // Z ~ A を出力
//        // ZXVT.... 1つ飛ばして出力                  // chValue-- ➱　1つずつ
//        for (char chValue = 'Z' ; chValue >= 'A' ; chValue -= 2){
//            System.out.println(chValue);
//        }

        ///////////////////////////////////////////////////

        // 1次元配列（Array）宣言　➱　元素の個数5個
        int bar [] = new int[5];

        // bar配列の各元素の値を初期化
        for (int iCount = 0, value = 1;
            iCount < bar.length ; iCount++, value *= 10){
            bar[iCount] = value;
        }
        // bar配列の各元素の値を出力
        for (int iCount = 0 ; iCount < bar.length ; iCount++){
            System.out.println(bar[iCount]);
        }


















    }

//        int foo = 0;
//        while (foo < 2) {
//            System.out.println("Hello World");

        }

