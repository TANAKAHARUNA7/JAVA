package AojBeta;

import java.util.Scanner;

public class test8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0){
                break;
            }
            if (x > y){
                // 小　大の順にするため
                int max = x;
                x = y;
                y = max;
            }
            System.out.println(x + " " + y);
            }
        }

    }
