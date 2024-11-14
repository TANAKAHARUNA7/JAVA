package special_class;
import java.util.Scanner;
public class test {
    public static void main(String [] args){

        // 키보드로부터 정수 N을 입력 받아,
        // N개의 int형 원소를 가지는 1차원 배열을 작성하시오.
        // 단 N 값은 1이상 10이하이며, 이외 값이 입력 될 경우 재입력 실시
        // 생성된 N 개의 원소에 정수 값을 입력하는 구문을 작성하시오.

        Scanner sc = new Scanner(System.in);

        // Task 1
        // 整数Nを入力受ける
        int N = 0; // 初期化　(String -> "" , char -> '')

        // Nの値は1～10　それ以外の入力は再入力を促す
        while (true) {
            System.out.print("整数を入力してください:　");
            N = sc.nextInt();
            if (N >= 1 && N <= 10) {
                break;
            }
        }
        //  Task 2
        // N個のint型の元素をもつ1次元の配列を生成
        int array [] = new int [N];


        // 生成されたN個の元素に整数値の入力を受ける
        for ( int i = 0; i < array.length ; i++ ){
            System.out.print((i+1) + "番目の整数を入力してください：　");
            array[i] = sc.nextInt();
        }

        // 入力された元素の値を出力する
        for ( int value : array){
            System.out.print(value + " ");
        }

        // 配列内の全体の元素の最小値と最大値と平均値を出力
        // 最大値
        int maxValue = array[0];
        for ( int value : array){
            if (value > maxValue ){
                maxValue = value;
            }
        }

        // 最小値
        int minValue = array[0];
        for (int value : array){
            if (value < minValue){
                minValue = value;
            }
        }

        // 平均値
        int sum = 0;
        for (int value : array){
            sum += value;
        }
        float avg = ((float )sum) / array.length;

        // 出力
        System.out.println("最大値は: " + maxValue);
        System.out.println("最小値は: " + minValue);
        System.out.printf("平均値は: %.2f",avg);


    }
}
