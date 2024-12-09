package FinalExam;

import java.util.Scanner;

public class test2 {
    // 발생 빈도 분석 메서드






    // 출력
    static void printMatrix(int[][][] argBar) {

        for (int page = 0; page < argBar.length; page++) {
            System.out.println("\n빙고 매트릭스 # " + (page + 1));
            for (int row = 0; row < argBar[0].length; row++) {
                for (int col = 0; col < argBar[0][0].length; col++) {
                    System.out.print(argBar[page][row][col] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // random number 작성 후 빈고방에 set하기
    static int[][][] madeMatrix(int argM, int argN,int argStart,int argEnd) {

        int[][][] bingoMatrix = new int[argM][argN][argN];
        int bordValue = argN * argN;
        int[] randList = new int[bordValue];
        boolean flag = false;

        // - 난수는 중복되지 않은 숫자(범위: start ~ end)로 M개의 NxN 빙고판을 생선함
        for (int page = 0; page < argM; page++) {

            for (int i = 0; i < bordValue; ) {
                int rndNum = (int) (Math.random() * (argEnd - argStart + 1)) + argStart;
                flag = false;

                for (int j = 0; j < i; j++) {
                    if (randList[i] == rndNum) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    randList[i] = rndNum;
                    i++;
                }
            }

            int v= 0;
            for(int row = 0; row < argN; row++){
                for(int col = 0 ;col < argN ; col++){
                    bingoMatrix[page][row][col] = randList[v];
                v++;
                }
            }
        }
        return bingoMatrix;
    }
    // 입력 메서드
    static int[] userInput() {
        Scanner sc = new Scanner(System.in);

        int n, m, start, end;

        // N입력 받음
        while (true) {
            // - 핑고판 크기 N (3~9의 홀수로)입력을받는다
            System.out.print("N갑을 3~9의 홀수로 입력하세요: ");
            n = sc.nextInt();
            // 유호하는 정수가 입력 될 떄까지 반복
            if (n >= 3 && n <= 9 && n % 2 != 0) {
                break;
            }
            System.out.println("N값은 3~9의 홀수 값만 입력가능.");
        }

        // start, end 값 입력받음
        while (true) {

            // - 난수 범위의 start, end 값을 받는다: (end - start + 1) >= N x N
            System.out.print("난수 범위의 start값을 입력하세요: ");
            start = sc.nextInt();

            System.out.print("난수 범위의 end값을 입력하세요: ");
            end = sc.nextInt();

            // 유호하는 정수가 입력 될 떄까지 반복
            if ((end - start + 1) >= n * n) {
                break;
            }
            System.out.println("end - start갑이 NxN 보다 쿠거나 같아야 합니다.");
        }


        // M입력을 받음
        while (true) {
            // - 빙고 매트릭스 수 M (1~7)정수를 받는다
            System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요(1~7): ");
            m = sc.nextInt();

            // 유호하는 정수가 입력 될 떄까지 반복
            if (m >= 1 && m <= 7) {
                break;
            }
        }
        return new int[]{m,n,start,end};
    }

    // menu　출력
    static int menu() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("===== 빙고 게임 메뉴 =====\n"
                + "1. 빙고판 생선\n"
                + "2. 숫자별 발생 빈도 분석\n"
                + "3. 빙고판 출력\n"
                + "4. 종료\n"
                + "메뉴 선택: ");
        choice = sc.nextInt();
        return choice;
    }

    // 메인
    public static void main(String[] args) {

        int[][][] bar = null;

        while (true) {
            // 메뉴 출력
            int choice = menu();

            // 입력에 따라 실행
            // 4. 종료
            if (choice == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (choice) {
                // 1. 빙고판 생선
                case 1:
                    int [] input = userInput();
                    bar = madeMatrix(input[0],input[1],input[2],input[3]);
                    break;

                // 2. 숫자별 발생 빈도 분석 콤보 점수 계산
                case 2:






                    break;

                // 3. 빙고판 출력
                case 3:
                    printMatrix(bar);
                    break;


            }
        }


    }

}

