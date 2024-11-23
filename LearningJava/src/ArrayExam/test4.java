package ArrayExam;

import java.io.OptionalDataException;

public class test4 {
    public static void main(String[] args) {
        // 행을 4개 생성
        char ber [][] = new char [4][];

        ber [0] = new char [5];
        ber [1] = new char [3];
        ber [2] = new char [1];
        ber [3] = new char [4];

        ber [0][0] = 'h';
        ber [0][1] = 'e';
        ber [0][2] = 'l';
        ber [0][3] = 'l';
        ber [0][4] = 'o';

        ber [1][0] = 'H';
        ber [1][1] = 'O';
        ber [1][2] = 'W';

        ber [2][0] = 'a';

        ber [3][0] = 't';
        ber [3][1] = 'o';
        ber [3][2] = 'p';
        ber [3][3] = 's';

//     for( int j = 0 ; j < ber.length ; j++ ) {
//         for (int i = 0; i < ber[j].length; i++) {
//             System.out.print(ber[j][i]);
//         }
//         System.out.println();
//     }

     for ( char []  value : ber ) {
         System.out.println(value);
     }



    }
}
