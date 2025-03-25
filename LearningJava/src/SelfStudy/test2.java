package SelfStudy;

public class test2 {
    public static void main(String[] args) {
        int score = 70;
//        String grade;
//
//        if (score < 0 || score > 100){
//            grade = "無効な入力";
//        }else if(score >= 90){
//            grade = "A";
//        }else if(score >= 70){
//            grade = "B";
//        }else if(score >= 50){
//            grade = "C";
//        }else{
//            grade = "D";
//        }

        String grade = (score < 0 || score > 100) ? "無効な入力"
                        : (score >= 90) ? "A"
                        : (score >= 70) ? "B"
                        : (score >= 50) ? "C"
                        : "D";

        System.out.println("評価は" + grade);
    }
}
