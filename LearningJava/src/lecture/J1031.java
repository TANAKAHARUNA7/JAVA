package lecture;
import java.util.Scanner;
public class J1031 {
    public static void main (String [] args){
        // switch文を利用して下記の文を作成
        // キーボードから整数の入力を受けて
        // 1, python
        // 2, Java
        // 3, C++
        // 4 JavaScript  を出力

        // キーボードから入力を受ける
        Scanner sc = new Scanner(System.in);

        System.out.println("数字を入力してください");

        int input = sc.nextInt();

        String meesage = "";
        // 入力に合わせて結果を出力
        switch (input){
            case 1:
                meesage = "python";
                break;
            case 2:
                meesage = "Java";
                break;
            case 3:
                meesage = "C++";
                break;
            case 4:
                meesage = "JavaScript";
        }
        System.out.println(meesage + "です");

        int inputValue = 2;

        String selectedLang = switch(inputValue){
            case 1,5 -> "python";
            case 2 -> "Java";
            case 3 -> "C++";
            case 4 -> "Javascript";
            default -> "Unknown";

        };


//        enum Selection {YCJUNG, RICHARD;}
//        Selection mySelection = Selection.YCJUNG;
//
//        boolean myType = false;
//
//        String bar = switch(myType){
//            case true -> "python";
//            case false -> "Java";
//        };



    }
}
