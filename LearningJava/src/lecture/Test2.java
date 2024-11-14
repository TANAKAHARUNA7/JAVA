package lecture;

public class Test2 {
    public static void main (String [] args) {


        // 成績　[A, B, C] , 出席 [PASS, FAIL]
        // 成績がAで出席がPASS　➱　全額＋追加奨学金出力
        // 成績がAで出席がFAIL　➱　全額
        // 成績がBで出席がPASS　➱　半額
        // 残りは奨学金なし

        String grade = "B";
        String attendance = "PASS";

        String scholarship = switch (grade) {
            case "A" -> {
                if (attendance.equals("PASS")) {
                    yield "全額＋追加諸学金";
                } else {
                    yield "全額";
                }
            }
            case "B" -> {
                if (attendance.equals("PASS")) {
                    yield "半額";
                } else {
                    yield "奨学金なし";
                }
            }
            default -> "奨学金なし";
        };
        System.out.println(scholarship);
    }

}
