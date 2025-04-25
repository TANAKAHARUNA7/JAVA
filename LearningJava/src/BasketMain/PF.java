package BasketMain;

public class PF extends Player{
    PF(String name){
        super(name);
    }
    @Override void play(){
        System.out.println( name + "is boxing out as a Power Forward");
    }
}
