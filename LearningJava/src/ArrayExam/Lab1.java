package ArrayExam;

import java.util.Scanner;

public class Lab1 {
    static Scanner sc = new Scanner(System.in);
    // 학생 정보 count
    static int count = 0;

    // 2차원 배열의 초기 크기를 3행 6열로 설정
    static final int STUDENT_NUMBER = 3;
    static final int STUDENT_GRADES = 6;

    // 데이터 입력 함수
    static void setStudent(float[][] Grades) {
        // 학번
        System.out.print("학번을 입력하세요: ");
        Grades[count][0] = sc.nextFloat();
        // 국어
        System.out.print("국어 성적: ");
        Grades[count][1] = sc.nextFloat();
        // 영어
        System.out.print("영어 성적: ");
        Grades[count][2] = sc.nextFloat();
        // 수학
        System.out.print("수학 성적: ");
        Grades[count][3] = sc.nextFloat();
        // 국어 + 영어 + 수학
        Grades[count][4] = Grades[count][1] + Grades[count][2] + Grades[count][3];
        // 평균
        Grades[count][5] = Grades[count][4] / 3;

        // 입력 완료 후 "입력이 완료되었습니다." 메시지를 출력하고 메뉴로 복귀
        System.out.println("입력이 완료되었습니다.");
        count++;
    }

    // 데이터 출력 함수
    static void StudentInformation(float[][] Grades) {
        for (int i = 0; i < count; i++) {
            System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %.2f, 수학: %.2f, 합계: %.2f, 평균: %.2f\n",
                    Grades[i][0], Grades[i][1], Grades[i][2], Grades[i][3], Grades[i][4], Grades[i][5]);
        }
    }

    // 삭제 함수
    static void delete(float[][] Grades) {
        boolean flag = true;

        while (flag == true) {
            // 삭제할 학생의 학번을 입력받음
            System.out.print("삭제할 학생의 학번을 입력하세요: ");
            int delStuNum = sc.nextInt();

            //사용자가 -1을 입력하면 삭제 메뉴 종료 후 전체 메뉴로 복귀
            if (delStuNum == -1) {
                break;
            }

            // 학번이 존재하는지 검색
            for (int i = 0; i < count ; i++) {
                // 학번 존재 시: 해당 학생의 데이터를 삭제
                if (Grades[i][0] == delStuNum) {
                    for (int j = 0 ; j < Grades[i].length ; j++) {
                        if (i < 2) {
                            Grades[i][j] = Grades[i + 1][j];
                            Grades[i + 1][j] = 0;
                            if (Grades[i + 2][j] != 0){
                                Grades[i + 1][j] = Grades[i + 2][j];
                                Grades[i + 2][j] = 0;
                            }
                        }
                    }
                    Grades[Grades.length - 1] = new float [STUDENT_GRADES];

                    System.out.println("삭제 완료 되었습니다.");
                    count--;

                    // 업데이터 한 학생 정보 출력
                    System.out.println("학생 목록:");
                    StudentInformation(Grades);

                    // while문 종료
                    flag = false;
                }

            }//학번 미존재: 재입력
            if (flag == true) {
                System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {



        // 학생 성적을 저장하는 2차원 배열
        float[][] Grades = new float[STUDENT_NUMBER][STUDENT_GRADES];

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
                    if (count < 3){
                        setStudent(Grades);
                    }else {
                        System.out.println("더 이상 입력할 수 없읍니다.");
                    }
                    break;

                //2. 학생 목록 출력
                case 2:
                    // 데이터가 없는 경우 "입력된 학생 정보가 없습니다." 출력
                    if (count == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        StudentInformation(Grades);
                    }
                    break;

                // 3. 학생 삭제하기
                case 3:

                    if (count == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        // 학생 목록출력
                        StudentInformation(Grades);
                        // 삭제 함수
                        delete(Grades);
                    }
            }
        }
    }
}





