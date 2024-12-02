package ArrayExam;

import java.util.Scanner;

public class test6 {

    static Scanner sc = new Scanner(System.in);
    static float[][] students = new float[3][6];
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    setStudents();
                    break;

                case 2:
                    studentInformation();
                    break;

                case 3:
                    delete();

            }


        }

    }

    public static void menu() {
        System.out.println("메뉴" +
                "\n1. 학생 성적 입력" +
                "\n2. 입력된 학생 목록 출력" +
                "\n3. 학생 삭제하기" +
                "\n4. 종료");
        System.out.print("선택: ");
    }

    public static void setStudents() {
        System.out.print("학번을 입력하세요: ");
        float id = sc.nextFloat();

        System.out.print("국어: ");
        float national = sc.nextFloat();

        System.out.print("영어: ");
        float eng = sc.nextFloat();

        System.out.print("수학: ");
        float math = sc.nextFloat();

        float sum = national + eng + math;

        float avg = sum / 3;

        students[count][0] = id;
        students[count][1] = national;
        students[count][2] = eng;
        students[count][3] = math;
        students[count][4] = sum;
        students[count][5] = avg;

        count++;
        System.out.println("입력이 완료되었습니다.");

    }

    public static void studentInformation() {

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %2f, 수학: %.2f, 합계: %2f, 평균: %2f\n",
                        students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], students[i][5]);
            }
        } else {
            System.out.println("입력된 학생 정보가 없습니다.");
        }
    }

    public static void delete() {
        while (true){
            // 현재 입력된 학생들의 목록을 출력
            System.out.println("삭제할 학생의 목록: ");
            for (int i = 0 ; i < count ; i++ ){
                System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %2f, 수학: %.2f, 합계: %2f, 평균: %2f\n",
                        students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], students[i][5]);
            }
            // 삭제할 학생의 학번을 입력
            System.out.print("삭제할 학");
            float delId = sc.nextFloat();

            // 학번 존재 - 해당 학생 데이터 삭제
            for( int i = 0 ; i < count ; i++ ){
                if(students[i][0] == delId){
                    for ( int j = 0; j < students[i].length ; j++ ){
                        students[i][j] = students[i + 1][j];
                    }
                }
            }

            // 마지막 행을 0으로 초기화
            for( int i = 0 ; i < students.length ;  ){


            }


        }
    }







}

