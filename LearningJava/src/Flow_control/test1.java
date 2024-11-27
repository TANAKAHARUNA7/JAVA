//package Flow_control;
//
//import java.util.Scanner;
//
//public class test1 {
//    static Scanner sc = new Scanner(System.in);
//    // 掛け算関数
//    static void gugudan(){
//        for ( int i = 1 ; i < 10 ; i++ ){
//            for(int j = i ; j < 10 ; j++){
//                System.out.println(i + "X" + j + "=" + i * j );
//            }
//            System.out.println("==================");
//        }
//    }
//    // a~z出力関数
//    static void az(){
//        for(char start = 'a' ; start <= 'z' ; start++ ){
//            System.out.print((start + ((start < 'z')?",":"")));
//        }
//    }
//    // 🌟出力関数
//    static void star(){
//        System.out.print("N数を入力:　");
//        int N = sc.nextInt();
//
//        System.out.println("M数を入力:　");
//        int M = sc.nextInt();
//
//        for( int col = 0 ; col <  ;  ){
//            for( int row = 0 ;  ;  ){
//
//            }
//        }
//
//
//
//    }
//
//    public static void main (String [] args){
//
//        // userから整数の入力をうけてメニューを実施するプログラム
//
//
//        // userから整数の入力を受ける
//        System.out.println("メニューを選択してください\n"
//                        +"1. 掛け算出力\n"
//                        +"2. a~z出力\n"
//                        +"3. 🌟を出力\n"
//                );
//        int input = sc.nextInt();
//
//        switch (input){
//            // 1: 掛け算出力
//            case 1:
//                gugudan();
//            // 2: a~z出力
//            case 2:
//                az();
//            // 3: 8 * 32の"*"を出力
//            case 3:
//                star();
//        }
//
//
//
//    }
//}
