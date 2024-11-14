public class bit {
    public static void main(String[] args) {
        int a = 0b00000000001111111111000000000010;
        int not = ~a;
        String binaryString = Integer.toBinaryString(not);
        System.out.println(binaryString);

    }
}
