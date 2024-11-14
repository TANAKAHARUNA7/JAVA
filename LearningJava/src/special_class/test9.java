package special_class;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        // 자용자로부터 M , N 정수를 입력 받아, M X N Matrix를 출력하세요.
        // 예) M : 3, N :2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0또는 음의 정수인 경우, 재입력

        // L2
        // 문제는 동일, 출력값 변경
        // 예) M : 3, N : 3
        //   * *
        // *   *
        // * *

        ///////////////////////////////////////////////////////////////


        Scanner sc = new Scanner(System.in);
        int inputM = 0;
        int inputN = 0;


        while (true) {
            // 자용자로부터 M, N 정수를 입력을 뱓는다
            System.out.print("M 값을 입력하세요: ");
            inputM = sc.nextInt();

            System.out.print("N 값을 입력하세요: ");
            inputN = sc.nextInt();

            // M과 N이 0또는 음의 정수인 경우, 재입력
            if (inputN <= 0 || inputM <= 0) {
                System.out.println("양수로 재입력하세요: ");
                continue;
            }else{
                break;
            }
        }
        // 예)  M : 3, N : 2
        // * *
        // * *
        // * *
        for (int j = 0; j < inputM; j++) {
            System.out.println();
            for (int k = 0; k < inputN; k++) {
                System.out.print("*");
            }
        }
        System.out.println("\n");

        // 예) M : 3, N : 3
        //   * *
        // *   *
        // * *

        //  a * *
        //    a *
        String space = "a";
        String star = "*";
    }
}
//
////        for (int j = 0 ; j < inputM ; j++){
////            System.out.println();
//            for (int st = 0 ,s = 0; st < inputN ; st++ ,s--) {
//                System.out.print(space + star * () );
//                System.out.println("*");
//            }
//        }
//
//
//    }

