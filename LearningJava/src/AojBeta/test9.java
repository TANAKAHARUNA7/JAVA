package AojBeta;

import java.util.Scanner;

public class test9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int div = a / b;

        int r = a % b;

        float f = (float)a / (float)b;
        System.out.printf(div + "\t" + r + "\t" + "%.5f",f);
    }
}
