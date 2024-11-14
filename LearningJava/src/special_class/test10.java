package special_class;
import java.util.Scanner;
public class test10 {
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

        /////////////////////////////////////////////

        // 자용자로부터 M , N 정수를 입력을 받는다
        Scanner sc = new Scanner(System.in);
        int inputM = 0;
        int inputN = 0;

        while (true) {
            //  M 정수를 입력을 받는다
            System.out.print("M의 정수를 입력하세요: ");
            inputM = sc.nextInt();

            //  N 정수를 입력을 받는다
            System.out.print("N의 정수를 입력하세요: ");
            inputN = sc.nextInt();

            // 0또는 음의 정수인 경우, 재입력
            if (inputM > 0 && inputN > 0) {
                break;
            } else {
                System.out.println("양의 정수를 입력하세요.");
            }
        }
        // 예) M : 3, N :2
        // * *
        // * *
        // * *
        for (int M = 0; M < inputM; M++) {
            System.out.println();
            for (int N = 0; N < inputN; N++) {
                System.out.print("*");
            }
        }
        System.out.println();

        // 문제는 동일, 출력값 변경
        // 예) M : 3, N : 3
        //   * *
        // *   *
        // * *

        for (int M = 0; M < inputM; M++) {
            System.out.println();
            for (int N = 0; N < inputN; N++) {
                if (M == N ){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
        }


        // L3
        // 문제는 동일, 출력값 변경
        //  *
        //*   *
        //  *
        for (int M = 0 ; M < inputM ; M++) {
            for (int N = 0; N < inputN; N++) {
                if (M == N){
                    System.out.print(" ");
                } else if (M + N == 2){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }



    }
}