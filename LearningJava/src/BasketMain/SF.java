package BasketMain;

public class SF extends Player{
    SF(String name){
        super(name);
    }

    @Override void play(){
        System.out.println( name + " is driving to the basket as a Small Forward");
    }
}
