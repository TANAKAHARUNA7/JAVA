package SelfStudy;

class Student3{
    private String name;
    private int score;

    void setName(String argName){
        if (argName != null && !argName.isEmpty()){
            name = argName;
        }
    }
    void setScore(int argScore){
        if(argScore <= 100 && argScore >= 0){
            score = argScore;
        }
    }String getName(){
        return name;
    }
    int getScore(){
        return score;
    }
}

public class oop_access_modifier2 {
    public static void main(String[] args) {
        Student3 stu = new Student3();
        stu.setName("HARUNA");

        stu.setScore(99);
        System.out.println(stu.getScore() + stu.getName());
    }
}
