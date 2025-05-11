package Practice_Day;

interface Scan {
    // public abstract void doScan();
    void doScan();

    // public static final int scanNum = 2;
    int scanNum = 2;

    // 普通の一般メソッド
    default void prePaper() {
        System.out.println("Prepaper");
    }
//
//    static void prePower() {
//        System.out.println("Power");
//    }
}
class Equipment implements Scan {
    public void doScan() {
        System.out.println("Equipment scan");
        Scan.super.prePaper();
    }

    @Override
    public void prePaper() {
        Scan.super.prePaper();
        System.out.println("Equipment- Prepaper");
    }
}

class Device implements Scan {
    int scanNum = 10;
    @Override
    public void doScan() {
        System.out.println(Scan.scanNum);
    }
}




public class Day5_7 {
    public static void main(String[] args) {
        Device device = new Device();
        device.doScan();
    }
}
