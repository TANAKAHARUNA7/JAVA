package Flow_control;

public class NestedEx {
    public static void main(String[] args) {

        // 学生たちの成績平均を基準に単位を付ける
        // 学生たちの成績を2次元配列に管理
        int[][] scores = {
                {85, 90, 60},  // 0学生
                {92, 88, 95},  // 1学生
                {70, 60, 75},  // 2学生
                {55, 20, 60}   // 3学生
        };

        // 全体
        for (int i = 0; i < scores.length; i++) {
            float total = 0;
            String msg = "";
            // 各学生の点数合計計算
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            float avg = (float) (total / scores[i].length);
            System.out.print(i + "番目学生の合計点数:" + (int) total);
            System.out.printf("\t平均点数:%.2f\t", avg);

            if (avg >= 90) {
                msg = "A";
            } else if (avg >= 70) {
                msg = "B";
            } else if (avg >= 60) {
                msg = "C";
            } else {
                msg = "F";
            }
            System.out.println("評価:　" + msg);

            ///////////////////////////////////

        }
    }
}
