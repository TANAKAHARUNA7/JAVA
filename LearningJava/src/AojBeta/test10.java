package AojBeta;

import java.util.Scanner;

public class test10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            char op = sc.next().charAt(0);
            int b = sc.nextInt();

            if (op == '?'){
                break;
            }

            switch (op){
                case '+':
                    int avg = a + b;
                    System.out.println(avg);
                    break;
                case '-':
                    int add = a - b;
                    System.out.println(add);
                    break;
                case '*':
                    int mul = a * b;
                    System.out.println(mul);
                    break;
                case '/':
                    int div = a / b;
                    System.out.println(div);
                    break;
                default:
                    break;
            }
        }

    }
}
