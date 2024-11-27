package ArrayExam;

import java.util.Scanner;

public class Lab1 {
    static Scanner sc = new Scanner(System.in);

    // 데이터 출력 함수
    static void StudentGrades(float[][] Grades) {
        for (int i = 0; i < Grades.length; i++) {
            for (int j = 0; j < Grades[i].length; j++) {
                System.out.printf("[학번:%.0f ]" , Grades[i][0] , "]\t");

                System.out.printf("국어:%.2f " , Grades[i][1] , "\t");

                System.out.printf("영어:%.2f " , Grades[i][2] , "\t");

                System.out.printf("수학%.2f " , Grades[i][3] , "\t");

                System.out.printf("합게:%.2f " , Grades[i][4] , "\t");

                System.out.printf("평균: %.2f" , Grades[i][5] , "\t");
                System.out.println();
                break;
            }
        }
    }

    static void delete(float[][] Grades) {
        while (true) {

            // 삭제할 학생의 학번을 입력받음
            System.out.print("삭제할 학생의 학번을 입력하세요: ");

            int StudentNumber = sc.nextInt();


            //사용자가 -1을 입력하면 삭제 메뉴 종료 후 전체 메뉴로 복귀
            if (StudentNumber == -1) {
                break;
            }
            // 학번 존재 시: 해당 학생의 데이터를 삭제
            for (int col = 0; col < Grades.length; col++) {
                if (Grades[col][0] == StudentNumber) {
                    for (int row = 0; row < Grades[col].length; row++) {
                        Grades[col][row] = Grades[col + 1][row];
                        Grades[Grades.length - 1][row] = Grades[col + 1][row];
                    }
                    System.out.println("삭제 완료 되었습니다.");
                    StudentGrades(Grades);
                    break;
                }
                //학번 미존재: 재입력
                else {
                    System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                    break;
                }
            }
        }


    }

    public static void main(String[] args) {

        int count = 0;

        float StudentNumber = 0;

        // 2차원 배열의 초기 크기를 3행 6열로 설정
        final int STUDENT_NUMBER = 3;
        final int STUDENT_GRADES = 6;

        float[][] Grades = new float[STUDENT_NUMBER][STUDENT_GRADES];

        // 메뉴를 출력한다
        // 프로그램 종료될때 까지 반복
        while (true) {
            System.out.println("메뉴\n" +
                    "1. 학생 성적 입력\n" +
                    "2. 입력된 학생 목록 출력\n" +
                    "3. 학생 삭제하기\n" +
                    "4. 종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();

            // 4.종료
            if (menu == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (menu) {
                // 1.성적 입력
                case 1:
                    for (int i = 0; i < Grades[i].length; i++) {
                        System.out.print("학번을 입력하세요: ");
                        StudentNumber = sc.nextInt();
                        Grades[count][0] = StudentNumber;

                        System.out.print("국어 성적: ");
                        Grades[count][1] = sc.nextFloat();

                        System.out.print("영어 성적: ");
                        Grades[count][2] = sc.nextFloat();

                        System.out.print("수학 성적: ");
                        Grades[count][3] = sc.nextFloat();

                        Grades[count][4] = Grades[count][1] + Grades[count][2] + Grades[count][3];

                        Grades[count][5] = Grades[count][4] / 3;
                        break;
                    }
                    // 입력 완료 후 "입력이 완료되었습니다." 메시지를 출력하고 메뉴로 복귀
                    System.out.println("입력이 완료되었습니다.");
                    count++;
                    break;

                //2. 학생 목록 출력
                case 2:
                    // 데이터가 없는 경우 "입력된 학생 정보가 없습니다." 출력
                    if (count == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        StudentGrades(Grades);
                    }
                    break;

                // 3. 학생 삭제하기
                case 3:
                    StudentGrades(Grades);
                    delete(Grades);
                    // 현재 입력된 학생들의 목록을 출력
//                        StudentGrades(Grades);
//
//                        while (true) {
//
//                            // 삭제할 학생의 학번을 입력받음
//                            System.out.print("삭제할 학생의 학번을 입력하세요: ");
//
//                            StudentNumber = sc.nextInt();
//
//                                //사용자가 -1을 입력하면 삭제 메뉴 종료 후 전체 메뉴로 복귀
//                            if (StudentNumber == -1) {
//                                break;
//                            }
//                            // 학번 존재 시: 해당 학생의 데이터를 삭제
//                            for(int col = 0 ; col < Grades.length ; col++ ){
//
//                                if(Grades[col][0] == StudentNumber){
//                                    for( int row = 0 ; row < Grades[col].length  ; row++ ){
//                                        Grades[col][row] = 0;
//
//                                    }System.out.println("삭제 완료 되었습니다.");
//                                }
//                                // 학번 미존재: 재입력
////                                else{
////                                    System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
////                                }
//                            }break;
//
//
//
//
//                        }
                    // 삭제 완료 후 업데이트된 목록 출력


            }
        }
    }
}





