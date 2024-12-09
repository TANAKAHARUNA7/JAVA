package ArrayExam;
import java.util.Scanner;
public class Lab1Sinwo {
    static Scanner scanner = new Scanner(System.in);
    static float[][] students = new float[3][6];
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }
            switch (choice) {
                case 1:  // 학생 성적 입력
                    studentInformation();
                    break;

                case 2:  // 입력된 학생 목록 출력
                    studentList();
                    break;

                case 3: // 학생 정보 삭제
                    delete();
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }


    public static void menu() {
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
        System.out.print("선택: ");
    }

    public static void studentInformation() {
        System.out.print("학번을 입력하세요: ");
        float id = scanner.nextFloat();
        System.out.print("국어 성적: ");
        float korean = scanner.nextFloat();
        System.out.print("영어 성적: ");
        float english = scanner.nextFloat();
        System.out.print("수학 성적: ");
        float math = scanner.nextFloat();
        scanner.nextLine();

        float total = korean + english + math;
        float average = total / 3;

        // 학생 정보 배열에 저장
        students[count][0] = id;
        students[count][1] = korean;
        students[count][2] = english;
        students[count][3] = math;
        students[count][4] = total;
        students[count][5] = average;

        count++;
        System.out.println("입력이 완료되었습니다.");
    }

    public static void studentList() {
        if (count == 0) {
            System.out.println("입력된 학생 정보가 없습니다.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %.2f, 수학: %.2f, 합계: %.2f, 평균: %.2f\n", students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], students[i][5]);
            }
        }
    }

    public static void delete() {
        while (true) {
            // 현재 입력된 학생들의 목록을 출력
            System.out.println("삭제할 학생의 목록:");
            for (int i = 0; i < count; i++) {
                System.out.printf("[학번: %.0f] 국어: %.2f, 영어: %.2f, 수학: %.2f, 합계: %.2f, 평균: %.2f\n", students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], students[i][5]);
            }
            // 삭제할 학생의 학번을 입력
            System.out.print("삭제할 학생의 학번을 입력하세요 (-1 : 이전 메뉴로): ");
            float delId = scanner.nextFloat();

            // 학번 존재 - 해당 학생 데이터 삭제
            for (int i = 0; i < count; i++) {
                if (students[i][0] == delId) {
                    for (int j = i; j < count-1; j++) {
                        students[j] = students[j + 1];
                    }
                    count--;
                    System.out.println("삭제가 완료되었습니다.");
                    break;
                } else { // 학번 미존재 - 학번 존재 X 출력
                    System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                }
            }

            // 입력값 = -1 메뉴로 복귀
            if (delId == -1) {
                System.out.println("삭제 메뉴를 종료합니다.");
                if (count > 0) {// 삭제 후 업데이트된 목록 출력
                    System.out.println("학생 목록:");
                    studentList();
                    break;
                }
                break;
            }
        }
    }


}
