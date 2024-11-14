package lecture;

public class J107 {
    public static void main(String[] args) {
//        int addr1 = 210;
//        int addr2 = 101;
//        int addr3 = 236;
//        int addr4 = 164;
//
//        int mask1 = 255;
//        int mask2 = 255;
//        int mask3 = 255;
//        int mask4 = 0;
//
//        int subAddr1 = addr1 & mask1;
//        int subAddr2 = addr2 & mask2;
//        int subAddr3 = addr3 & mask3;
//        int subAddr4 = addr4 & mask4;
//        System.out.println(subAddr1 + " - " + subAddr2 + " - " + subAddr3 + " - " + subAddr4);
//
//
//        //         210,101,236,164
//        // 16進数➱  D2  65  EC  A4
          // Shift operator ; >> , <<
//        int myIpAddr = 0xD265ECA4; // -765072220
//        // >> と &　演算子を使ってIPv4の各部位の値を各int型変数ipAddrに保存
//        int ipAddr1 = (myIpAddr >> 24) & 0xFF; // D2
//        int ipAddr2 = (myIpAddr >> 16) & 0xFF; // 65
//        int ipAddr3 = (myIpAddr >> 8) & 0xFF;  // EC
//        int ipAddr4 = (myIpAddr) & 0xFF;  // A4
//
//        System.out.println(ipAddr1 + " " + ipAddr2 + " " + ipAddr3 + " " + ipAddr4 );




//        System.out.println(myIpAddr);

        int bar = 1;
        int foo = 16;

        //
        System.out.println(bar << 1); // 2
        System.out.println(bar << 2); // 4
        System.out.println(bar << 3); // 8
        System.out.println(bar << 4); // 16

        System.out.print("");
        System.out.println(foo >> 1); // 8
        System.out.println(foo >> 2); // 4
        System.out.println(foo >> 3); // 2
        System.out.println(foo >> 4); // 1

        //










    }

}
