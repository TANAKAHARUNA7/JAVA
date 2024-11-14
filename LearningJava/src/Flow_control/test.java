package Flow_control;

import java.util.Scanner;

public class test {
    public static void main(String[] age){

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("今日は何曜日ですか？:　");

        String today = scanner.nextLine();

        switch (today){
            case "月曜日":
                System.out.println("新しい一週間が始まりました");
                break;
            case "金曜日":
                System.out.println("週末が近づいてきました");
                break;
            case "土曜日":
            case "日曜日":
                System.out.println("楽しい週末をお過ごしください");
                break;
        default:
            System.out.println("楽しい一日をお過ごしください");
        }
        scanner.close();
    }
}
