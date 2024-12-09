package Method;

import java.util.Scanner;

public class MethodEx3 {
    static String prtSomething(String argName){
        String msg = "こんにちは" + argName + "様";
        return msg;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        String name = sc.nextLine();

        String bar = prtSomething(name);

        System.out.println(bar);


    }
}
