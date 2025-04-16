package SelfStudy;

class Student4 {
    private String name;
    private int score;

    Student4(String name, int score) {
        this.name = name;
        this.score = score;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }
}

public class oop_access_modifier3 {
    public static void main(String[] args) {

        Student4[] stuList = new Student4[5];

        stuList[0] = new Student4("HARUNA", 90);
        stuList[1] = new Student4("TANAKA", 80);
        stuList[2] = new Student4("YAMASITA", 70);
        stuList[3] = new Student4("SATOU", 99);
        stuList[4] = new Student4("TAKAHASI", 79);

        for (int i = 0; i < stuList.length; i++) {
            if (stuList[i].getScore() >= 80) {
                System.out.println("Name:" + stuList[i].getName() + ", Score:" + stuList[i].getScore());
            }
        }

    }
}
