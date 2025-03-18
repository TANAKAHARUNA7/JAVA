package SelfStudy;
class Nct{
    String group;
    int memberNum;

    Nct(String argGroup , int argMemberNum){
        group = argGroup;
        memberNum = argMemberNum;
    }

    void prt(){
        System.out.println(group + "\t" + memberNum + "명");
    }

}


public class oopTest {
    public static void main(String[] args) {
        Nct Dream = new Nct("NCT DREAM", 7);
        Dream.prt();

        Nct Nct127 = new Nct("NCT127", 8);
        Nct127.prt();

    }

}
