package FinalExam;

import java.util.Scanner;

public class test1 {

    // 출력
    static void printMatrix(int[][][]argBar){

        for (int page = 0 ; page < argBar.length ; page++ ) {
            System.out.println("빙고 매트릭스 # " + (page + 1 ));
            for (int row = 0 ; row < argBar[0].length ; row++ ) {
                for (int col = 0 ; col < argBar[0][0].length ; col++ ) {
                    System.out.print(argBar[page][row][col] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }


    // random number 작성
    static int[][][] rndNum(int [][][]argMatrix, int argStart, int argEnd){
        // - 난수는 중복되지 않은 숫자(범위: start ~ end)로 M개의 NxN 빙고판을 생선함
        for (int page = 0 ; page < argMatrix.length ; page++ ) {
            for (int row = 0 ; row < argMatrix[0].length ; row++ ) {

                for (int col = 0 ; col < argMatrix[0][0].length ; col++ ) {
                    while(true) {
                        int rndNum = (int) (Math.random() * (argEnd - argStart + 1) + argStart);
                        if (argMatrix[page][row][col] != rndNum) {
                            argMatrix[page][row][col] = rndNum;
                        }else {
                            break;
                        }
                    }
                }
            }
        }
        return argMatrix;
    }

    // 빙고판 작성 크기       madeMatrix(m,n,start,end);
    static int[][][] madeMatrix(int argM, int argN, int argStart , int argEnd){
        Scanner sc = new Scanner(System.in);

        // N입력 받음
        while(true) {
            // - 핑고판 크기 N (3~9의 홀수로)입력을받는다
            System.out.print("N갑을 3~9의 홀수로 입력하세요: ");
            argN = sc.nextInt();
            // 유호하는 정수가 입력 될 떄까지 반복
            if (argN >= 3 && argN <= 9) {
                if(argN % 2 != 0) {
                    break;
                }
            }
            System.out.println("N값은 3~9의 홀수 값만 입력가능.");
        }

        // start, end 값 입력받음
        while(true) {

            // - 난수 범위의 start, end 값을 받는다: (end - start + 1) >= N x N
            System.out.print("난수 범위의 start값을 입력하세요: ");
            argStart = sc.nextInt();

            System.out.print("난수 범위의 end값을 입력하세요: ");
            argEnd = sc.nextInt();

            // 유호하는 정수가 입력 될 떄까지 반복
            if((argEnd - argStart + 1) >= argN * argN) {
                break;
            }
            System.out.println("end - start갑이 NxN 보다 쿠거나 같아야 합니다.");
        }


        // M입력을 받음
        while(true) {
            // - 빙고 매트릭스 수 M (1~7)정수를 받는다
            System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요(1~7): ");
            argM = sc.nextInt();

            // 유호하는 정수가 입력 될 떄까지 반복
            if(argM >= 1 && argM <= 7) {
                break;
            }
        }

        int [][][] bingoMatrix = new int[argM][argN][argN];

        rndNum(bingoMatrix,argStart,argEnd);

        System.out.println("빙고 마트릭스가 왕성되었습니다.");

        return bingoMatrix;
    }




    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        int n =0;
        int m = 0;

        int start = 0;
        int end = 0;

        int [][][] bar = new  int [m][n][n];
        while(true) {
            // 메뉴 출력
            System.out.print("===== 빙고 게임 메뉴 =====\n"
                    +"1. 빙고판 생선\n"
                    +"2. 숫자별 발생 빈도 분석\n"
                    +"3. 빙고판 출력\n"
                    +"4. 종료\n"
                    +"메뉴 선택: ");

            choice = sc.nextInt();

            // 입력에 따라 실행
            // 4. 종료
            if (choice == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch(choice) {

                // 1. 빙고판 생선
                case 1:


                    bar = madeMatrix(m,n,start,end);
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
