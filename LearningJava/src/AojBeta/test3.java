package AojBeta;

import java.util.Scanner;

public class test3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        int h = second / 3600;

        int m = second % 3600 / 60;

        int s = second % 60;
        System.out.println(h + ":" + m + ":" + s);


    }
}
