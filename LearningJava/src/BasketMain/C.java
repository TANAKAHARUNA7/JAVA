package BasketMain;

public class C extends Player{
    C(String name){
        super(name);
    }
    @Override void play(){
        System.out.println( name + " is defending the paint as a Center");
    }
}
