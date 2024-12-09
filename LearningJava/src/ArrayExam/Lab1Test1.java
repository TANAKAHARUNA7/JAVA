package ArrayExam;

import java.util.Scanner;

public class Lab1Test1 {

    // 데이터 입력 매서드                    배열                  학생 입력 수
    static boolean addStdToMatrix(float[][] argStdMatrix, int argNumOfStudents) {

        if (argNumOfStudents >= argStdMatrix.length) {
            System.out.println("입력값이 매트릭스 크기를 초과");
            return false;
        }

        Scanner sc = new Scanner(System.in);

        // 학번
        System.out.print("학번을 입력하세요: ");
        argStdMatrix[argNumOfStudents][0] = sc.nextFloat();
        // 국어
        System.out.print("국어 성적: ");
        argStdMatrix[argNumOfStudents][1] = sc.nextFloat();
        // 영어
        System.out.print("영어 성적: ");
        argStdMatrix[argNumOfStudents][2] = sc.nextFloat();
        // 수학
        System.out.print("수학 성적: ");
        argStdMatrix[argNumOfStudents][3] = sc.nextFloat();
        // 국어 + 영어 + 수학
        argStdMatrix[argNumOfStudents][4] = argStdMatrix[argNumOfStudents][1] + argStdMatrix[argNumOfStudents][2] + argStdMatrix[argNumOfStudents][3];
        // 평균
        argStdMatrix[argNumOfStudents][5] = argStdMatrix[argNumOfStudents][4] / 3;

        // 입력 완료 후 "입력이 완료되었습니다." 메시지를 출력하고 메뉴로 복귀
        System.out.println("입력이 완료되었습니다.");

        return true;
    }

    // 데이터 출력 매서드             배열                 학생 입력 수
    static void printMatrix(float[][] argStdMatrix, int argNumOfStudents) {
        if (argNumOfStudents <= 0) {
            System.out.println("학생 수 0: 출력할 데이터가 없습니다.");
            return;
        }

        for (int i = 0; i < argNumOfStudents; i++) {
            System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %.2f, 수학: %.2f, 합계: %.2f, 평균: %.2f\n",
                    argStdMatrix[i][0], argStdMatrix[i][1], argStdMatrix[i][2], argStdMatrix[i][3], argStdMatrix[i][4], argStdMatrix[i][5]);
        }
    }

    // 입력된 학번이 존재하는지 검사 하는 메서드
                                        // ID              배열                 학생 입력 수
    static int getRowIndexByStdId(int argStdId, float[][] argStdMatrix, int argNumOfStudents) {
        for (int i = 0; i < argNumOfStudents; i++) {
            if (argStdMatrix[i][0] == argStdId)
                return i;
        }
        return -1;
    }

    // 삭제 매서드                         ID                 배열                     학생 입력 수
    static boolean delStdFromMatrix(int argRowIndex, float[][] argStdMatrix, int argNumOfStudents) {

        if (argRowIndex >= argNumOfStudents) {
            System.out.println("인덱스 번호 오류 : @ delStdFromMatrix() ");
            return false;
        }

        for (int i = argRowIndex; i < argNumOfStudents - 1; i++) {
            for (int j = 0; j < argStdMatrix[0].length; j++) {
                argStdMatrix[i][j] = argStdMatrix[i + 1][j];
            }
        }

        for (int i = 0; i < argStdMatrix[0].length; i++) {
            argStdMatrix[argNumOfStudents - 1][i] = 0.0f;
        }

        System.out.println("삭제가 완료 돼었읍니다.");

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 학생 정보 count
        int numOfStudents = 0;

        // 2차원 배열의 초기 크기를 3행 6열로 설정
        final int STUDENT_NUMBER = 3;
        final int STUDENT_GRADES = 6;


        // 학생 성적을 저장하는 2차원 배열
        float[][] stdMatrix = new float[STUDENT_NUMBER][STUDENT_GRADES];

        // 프로그램 종료될때 까지 반복
        while (true) {
            // 메뉴를 출력한다
            System.out.println("메뉴\n" +
                    "1. 학생 성적 입력\n" +
                    "2. 입력된 학생 목록 출력\n" +
                    "3. 학생 삭제하기\n" +
                    "4. 종료");
            System.out.print("선택: ");
            // menu 입력을 받는다
            int menu = sc.nextInt();

            // 4.종료
            if (menu == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            // 선택된 menu에 따라 실행
            switch (menu) {
                // 1.성적 입력
                case 1:
                    if (addStdToMatrix(stdMatrix, numOfStudents)) {
                        numOfStudents++;
                    }
                    break;
                //2. 학생 목록 출력
                case 2:
                    printMatrix(stdMatrix, numOfStudents);
                    break;
                // 3. 학생 삭제하기
                case 3:

                    System.out.println("학생 목록: ");
                    printMatrix(stdMatrix, numOfStudents);

                    while (true) {

                        System.out.println("삭제할 학생의 ID를 입력 하세요");
                        int delStdId = sc.nextInt();

                        if (delStdId == -1) {
                            break;
                        }
                        int delRowIndex = getRowIndexByStdId(delStdId, stdMatrix, numOfStudents);

                        if (delRowIndex != -1) {
                            if (delStdFromMatrix(delRowIndex, stdMatrix, numOfStudents)) {
                                numOfStudents--;
                                printMatrix(stdMatrix, numOfStudents);
                                break;
                            }
                        }
                        System.out.println("입력된 정보가 없읍니다. 다시 입력하세요.");
                    }
            }
        }
    }
}






