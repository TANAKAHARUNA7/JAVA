package lecture;

public class ExplicitCasting {
    public static void main(String[] args) {
        double realNum = 9.99;
        int num = (int) realNum; // 強制型変換 (double -> int)

        System.out.println("強制型変還後 int の値" + num); // 9 (小数点以下切り捨て)

        char bar = '1';
        String foo = "12";
        int pos = 30;

        float kin = 1.0f / 2.0f;


        System.out.println(kin);


        System.out.println(foo + pos);  // 1230
    }
}
