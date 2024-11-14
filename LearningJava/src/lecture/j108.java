package lecture;

public class j108 {
    public static void main(String[] args) {
        // 255
//        int bar = 0x000000ff; //16進数
//        int foo = 0b11111111; // 2進数
//        int kin = 255; // 10進数
//        System.out.println(bar);
//
        //-----------------------------------------

        int bar =  0b01001010111000100000000010111011;

        // Get : 特定の場所のビット値を読む
        //        - ビットのじゃり数
        int bitPosition = 30; // bit 範囲は31~0
        int mask = 0b01000000000000000000000000000000;
        int smartMask = 1 << bitPosition;
        // 0b00000000000000000000000000000001;
        // 1 << 30
        // 0b01000000000000000000000000000000;

        boolean result = (bar & smartMask) != 0;
        int resultInt = (bar & mask) != 0 ? 1 : 0 ;


        // Set : 特定の場所のビット値を書く
        //        - ビットのじゃり数 、値
        // 0100 1010 1110 0010 0000 0000 1011 1011
        int foo = 0b01000000000000000000000000000000;
        int setPosition = 31;
        boolean value = false;

        int mask1 = ~(1 << 31);
        // 0b00000000000000000000000000000001;
        // 1 << 31
        // 0b10000000000000000000000000000000;
        // ~(1 << 31)
        // 0b01111111111111111111111111111111;

        int result2 = foo & mask1;
        // 1100 1010 1110 0010 0000 0000 1011 1011






    }



}
