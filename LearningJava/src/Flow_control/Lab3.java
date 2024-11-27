package Flow_control;

import java.util.Scanner;

public class Lab3 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String Grades = "";
        String GradesList[] = {"A", "B", "C", "D", "F"};

        String attendance = "";
        String attendanceList[] = {"Excellent", "Average", "Poor"};

        while (true) {
            // 성적(A, B, C, D, F 중 하나)입력받는다
            System.out.print("성적 등급을 입력하세요: ");
            Grades = sc.nextLine();
            ;

            // 출석(Excellent, Average, Poor 중 하나)을 입력받는
            System.out.print("출석 등급을 입력하세요: ");
            attendance = sc.nextLine();


            int GRADES = switch (Grades) {
                case "A" -> 0;
                case "B" -> 1;
                case "C" -> 2;
                case "D" -> 3;
                case "F" -> 4;
                default -> -1;
            };

            int atd = switch (attendance){
                case "Excellent" -> 0;
                case "Average" -> 1;
                case "Poor" -> 2;
                default -> -1;
            };

            if ( GRADES == 0 || GRADES == 1 || GRADES == 2 || GRADES == 3 || GRADES == 4){
                if (atd == 0 || atd == 1 || atd == 2){
                    break;
                }
            // 잘못된 입력이 있을 경우 다시 입력 받도록 한다
            }else{
                System.out.println("재입력 하세요.");
            }
            }



            // 성적 -> A , 출석 -> Excellent = ＂전액 장학금 및 추가 지원금 지급“

            // 성적 -> A , 출석 -> Average = ＂전액 장학금"

            // 성적 -> B , 출석 -> Excellent = "반액 장학금“

            // 성적 -> C, D
            // 출석 -> Poor =  "장학금없음, 재수강권장“
            // 출석 -> Excellent or Average = "장학금 없음“

            // 성적 -> F = "장학금 없음, 재 수강 권장“
            // 이외 경우 = “장학금 없음”





        }
    }
