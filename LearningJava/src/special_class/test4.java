package special_class;

public class test4 {
    public static void main(String [] args){

                // 랜덤 함수
                // Math.random()は0以上1未満のランダムな小数（浮動小数点数）を返す
                // Math.random() -> 0.0 <= rand value < 1.0
                // 1~10사이의 정수 중 난수값 5개를 출력
                for (int i = 0 ; i < 10 ; i ++ ) {
                    double randValue = (int)(Math.random() * 10 + 1);
                    // 0.0 <= rand value < 11.0
                    // 0.0 <= rand value < 10.0 -> 0.0 ~ 9.9999999....
                    // 1 + 0.0 <= rand value < 10 +1
                    // 1.0 <= rand value < 11.0 -> 0.0 ~ 10.9999999....

                    // 1 <= rand value <= 10
                    System.out.println(randValue);
                }
            }
        }
