package oop;

import java.util.Scanner;

class Stu{
    int id;
    String name;
    private int scoreMath;
    private int scoreEnglish;
    private int scoreKorea;
    private int sum;
    private float avg;

    Stu(int avgId, String avgName){
        id = avgId;
        name = avgName;
    }

    boolean setScore(int argKorea, int argMath, int argEnglish){
        if(argKorea < 0 || argMath < 0 || argEnglish < 0 ){
            return false;
        }
        if(argKorea > 100 || argMath > 100 || argEnglish > 100){
            return false;
        }
        scoreMath = argMath;
        scoreEnglish = argEnglish;
        scoreKorea = argKorea;

        return true;
    }

    int getScoreKorea(){
        return scoreKorea;
    }

    int getScoreEnglish(){
        return scoreEnglish;
    }

    int getScoreMath(){
        return scoreMath;
    }

    int getSum(){
        sum = scoreMath + scoreEnglish + scoreKorea;
        return sum;
    }

    float getAvg(){
        avg = (float) getSum()/ 3;
        return avg;
    }

    void prt(){

        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("scoreMath: " + scoreMath);
        System.out.println("scoreEnglish: " + scoreEnglish);
        System.out.println("scoreKorea: " + scoreKorea);
        System.out.println("--------------" );
        }


}

public class MainTest4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("入力学生数: ");
        int numOfStudents = sc.nextInt();

        Stu[] students = new Stu[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){

            System.out.println("ID: ");
            int stdId = sc.nextInt();

            System.out.println("Name: ");
            String stdName = sc.next();

            Stu st = new Stu(stdId, stdName);

            System.out.println("国語の点数: ");
            int scoreKorea = sc.nextInt();

            System.out.println("英語: ");
            int scoreEng = sc.nextInt();

            System.out.println("数学: ");
            int scoreMath = sc.nextInt();

            if (st.setScore(scoreKorea, scoreMath, scoreEng)){
                students[i] = st;
            }
        }

        for( Stu s: students) {
            if (s != null) {
                s.prt();
            }
        }
        }
    }

