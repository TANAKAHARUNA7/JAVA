package lectureMaterials;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
//        System.out.println("今日は何曜日ですか？" );
//        String day = sc.next();
//
//        String typeOfDay = switch (day){
//            case "SATURDAY", "SUNDAY" -> "Weekend";
//            case "MONDAY", "TUESDAY" , "WEDESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
//            default -> throw new IllegalArgumentException("Invalid day: " + day);
//        };
//        System.out.println(typeOfDay);

        // スコアの入力を受けて階級を出力

        // スコアの入力を受ける
        System.out.println("スコアを入力してください:　");
        int score = sc.nextInt();

        // スコアを10で割ったときに出た値によって階級をつける
        String result = switch (score / 10){
            // 10,9 -> A
            case 10, 9 -> "A";
            // 8 -> B
            case 8 -> "B";
            // 7 -> 75以上でC＋　75以下はC
            case 7 ->{
                if (score >= 75){
                    yield "C+";
                }else{
                    yield "C";
                }
            }
            // 6 -> D
            case 6 -> "D";
            // それ以外はF　
            default -> "F";
        };
        System.out.println(result);
    }
}
