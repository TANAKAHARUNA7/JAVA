package lectureMaterials;

import java.util.SortedMap;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        //　配列初期化
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int index = 0;

        // 1. 後位増加演算者活用例：　配列要素探索
        System.out.println("後位増加演算者活用例");

        // 配列を順序的に探索しながら値を出力
        while (index < numbers.length) {
            System.out.println("現在の要素（後位）: " + numbers[index++]); // 出力後にINDEXを1増加
        }
        // index初期化
        index = 0;

        // 2．前位増減演算子活用例：特定の条件に合う値だけを増加
        System.out.println("\n前位増減演算子活用例:　");
        // 条件に合う時だけインデックスの値を先に増加させて処理
        while (index < numbers.length) {
                if (++index == 4) { // indexをさきに増加させてから比較
                    System.out.println("4番目の要素に到達した（前位）:　" + numbers[index - 1]); // numbers[3]の値を出力
                    break;
                }
            }

        // 3. 増減演算子と反復文の実際活用例
        System.out.println("\n増減演算子と反復文の例");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) { // 偶数だけ出力
                    System.out.println("偶数要素：　" + numbers[i]);


                }
            }
        }
    }
