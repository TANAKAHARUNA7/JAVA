package lecture;

public class J96 {
    public static void main(String[] args) {
        byte bar = 127;
        short foo = -3276;
        int kin  = 2147483647;
        long l  = 9223372036854775807L;

        float fBar = 2.0f;
        double pos = 3.14159265358979323846d;

        char sam = 85;
        char sam2 = 'd';

        boolean jos1 = true;
        boolean joe2 = false;

        // int sum = 2 + 3l;  →　int型の2とlong型の値を足しているためエラー発生
        // データ型を合わせる必要がある
        int sum1 = (int) (2 + 3l);
        // または
        long sum2 = 2 + 3l;


        for(char value = 'A'; value <= 'Z'; value++) {
            System.out.println(value);
        }

        System.out.println(bar);
        System.out.println(foo);
        System.out.println(kin);
        System.out.println(l);
        System.out.println(sum1);
    }
}
