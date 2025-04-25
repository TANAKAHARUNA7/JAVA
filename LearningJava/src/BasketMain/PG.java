package BasketMain;

public class PG extends Player{
    PG(String name){
        super(name);
    }

    @Override void play(){
        System.out.println( name + " is making assists as a point Guard");
    }
}
