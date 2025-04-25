package BasketMain;

public class SG extends Player{
    SG(String name){
        super(name);
    }

    @Override void play(){
        System.out.println( name + " is shooting 3-pointers as a Shooting Guard");
    }
}
