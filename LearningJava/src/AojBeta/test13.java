package AojBeta;

import java.util.Scanner;

public class test13 {
    public static void main(String[]args){
        //##########
        //#........#
        //#........#
        //#........#
        //#........#
        //##########


        Scanner sc = new Scanner(System.in);

        while (true){
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0){
                break;
            }

            for(int i = 0 ; i < h; i++ ){
                for(int j = 0; j < w ; j++ ){
                    // 一行目と最後の行を'#'で出力するための計算
                    if ( (h - h) == i || (h - 1) == i ){
                        System.out.print('#');
                    // それ以外の行で最初と最後の部分だけを'#'で出力するための計算
                    }else{
                        System.out.print( (w - w) == j || ( w - 1) == j ? '#':'.' );
                    }
                }
                System.out.println();
            }


        }
    }
}
