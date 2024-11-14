package special_class;
import java.util.Scanner;
public class test11 {
    public static void main(String[] args) {
        // 메뉴를 선택하세요
        // 1. 1번째 실행 // 게임 실행 횟수 출력
        // 1. M X N Matrix를 출력
        // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 4. 종료

        // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력
        // 1 ~ 4 이외 값 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력


        // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //   * *
        //   * *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     * *
        //   *   *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력


        // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     *
        //   *   *
        //     *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        ////////////////////////////////////////////////////////////

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int selectedMenu = 0;

        // 메뉴 출력
        while (true) {
            // 프로그램 실행 회수를 출력
            System.out.print("\n" + "프로그램 실행 횟수: " + count + "\n");

            // 메뉴를 출력
            System.out.println("\n-------------------");
            System.out.println("메뉴를 선택하세요.\n" +
                    "1. M X N Matrix를 출력\n" +
                    "2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력\n" +
                    "3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력\n" +
                    "4. 종료");
            System.out.println("-------------------");

            // user로부터 입력을 받는다
            while(true) {
                System.out.print("메뉴 선택: ");
                selectedMenu = sc.nextInt();

                //  1 ~ 4 이외의 입력은 제입력을 받는다
                if(selectedMenu >= 1 && selectedMenu <= 4) {
                    break;
                }
                System.out.println("1~4 범위 내 값을 입력하세요");
            }

            // 메뉴에 따라 출력
            // 4. 종료
            if (selectedMenu == 4) {
                System.out.print("프로그램 종료");
                break;   // break の下の文はelse if ではなくif文　から始める
            }

            // M,N값을 초기화
            int inputM = 0;
            int inputN = 0;
            // 반복 문
            while (true) {
                // 사용자로부터 M 정수를 입력 받는다
                System.out.print("M값을 입력하세요: ");
                inputM = sc.nextInt();

                // 사용자로부터 N 정수를 입력 받는다
                System.out.printf("N값을 입력하세요: ");
                inputN = sc.nextInt();

                // M 과 N이 0 또는 음의 정수인 경우, 재입력
                if (inputN > 0 && inputM > 0) {
                    break;
                }
                System.out.print("재입력");
            }

            // 1. M X N Matrix를 출력
            if (selectedMenu == 1) {
                // M X N Matrix를 출력
                for (int j = 0; j < inputM; j++) {
                    System.out.println();
                    for (int i = 0; i < inputN; i++) {
                        System.out.print("*");
                    }
                }

            // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
            } else if ((selectedMenu == 2)) {
                for (int j = 0; j < inputM; j++) {
                    System.out.println();
                    for (int i = 0; i < inputN; i++) {
                        // 대각선에 space를 출력
                        if (j == i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
            } else if ((selectedMenu == 3)) {
                // 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
                for (int j = 0; j < inputM; j++) {
                    System.out.println();
                    for (int i = 0; i < inputN; i++) {
                        // 좌상단->우하단 + 우상단->좌하단
                        if (i == j || i + j == inputN - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }

            // 프로그램 실행 횟수 count
            count++;
        }
    }
}















