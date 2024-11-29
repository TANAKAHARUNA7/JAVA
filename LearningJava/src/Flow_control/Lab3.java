package Flow_control;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 성적 list
        String GradesList[] = {"A", "B", "C", "D", "F"};

        // 출석 List
        String attendanceList[] = {"EXCELLENT", "AVERAGE", "POOR"};

        // 반복문 종류하기 위한 flag
        boolean flag = true;

        while (flag) {

            // 성적
            String Grades = "";
            // 출석
            String attendance = "";
            // 출석 문자 저리 후
            String result = "";

                // 성적(A, B, C, D, F 중 하나)입력받는다
                System.out.print("성적 등급을 입력하세요: ");
                Grades = sc.nextLine();

                // 출석(Excellent, Average, Poor 중 하나)을 입력받는
                System.out.print("출석 등급을 입력하세요: ");
                attendance = sc.nextLine();

                int GRADES = switch (Grades) {
                    case "A", "a" -> 0;
                    case "B", "b" -> 1;
                    case "C", "c" -> 2;
                    case "D", "d" -> 3;
                    case "F", "f" -> 4;
                    default -> -1;
                };

                // 소문자를 대문자로 변경
                for (int i = 0; i < attendance.length(); i++) {
                    char letter = attendance.charAt(i); // 現在のインデックス一の文字を取得する
                    if (letter >= 'a' && letter <= 'z') {
                        result += (char) (letter - 32);
                    } else {
                        result += letter;
                    }
                }

                // 입력을 제크
                // 잘못된 입력이 있을 경우 다시 입력 받도록 한다
                if (GRADES >= 0 && GRADES <= 4) {
                    if (result.equals(attendanceList[0]) || result.equals(attendanceList[1]) || result.equals(attendanceList[2])) {
                        // 결과를 반단
                        String msg = switch (GRADES) {
                            // 성적 -> A
                            case 0 -> {
                                // 출석 -> Excellent = ＂전액 장학금 및 추가 지원금 지급“
                                if (result.equals(attendanceList[0])) {
                                    yield "전액 장학금 및 추가 지원금 지급";
                                    // 출석 -> Average = ＂전액 장학금"
                                } else if (result.equals(attendanceList[1])) {
                                    yield "전액 장학금";
                                } else {
                                    yield "장학금 없음";
                                }
                            }

                            // 성적 -> B , 출석 -> Excellent = "반액 장학금“
                            case 1 -> {
                                if (result.equals(attendanceList[0])) {
                                    yield "반액 장학금";
                                } else {
                                    yield "장학금 없음";
                                }
                            }
                            // 성적 -> C, D
                            case 2, 3 -> {
                                // 출석 -> Poor =  "장학금없음, 재수강권장“
                                if (result.equals(attendanceList[2])) {
                                    yield "장학금없음, 재수강권장";
                                }// 출석 -> Excellent or Average = "장학금 없음“
                               else {
                                    yield "장학금 없음";
                                }
                            }
                            // 성적 -> F = "장학금 없음, 재 수강 권장“
                            case 4 -> "장학금 없음, 재 수강 권장";

                            // 이외 경우 = “장학금 없음”
                            default -> "장학금 없음";
                        };
                        System.out.println(msg);
                        flag = false;
                        break;

                    } else {
                        System.out.println("재입력 하세요.");
                    }
                } else {
                    System.out.println("재입력 하세요.");
                }

        }
    }
}







