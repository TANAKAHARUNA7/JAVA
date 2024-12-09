package Method;

public class MethodEx2 {
    public static int calculateDiscount(int amount) {
        if (amount >= 30000) {
            return (int) (amount * 0.2);
        } else if (amount >= 20000) {
            return (int) (amount * 0.1);
        } else {
            return (int) (amount * 0.05);
        }
    }
        public static void main(String [] args){

            int totalDiscount = 0;
            int [] purchases = {10000, 20000, 30000};

            for (int i = 0 ; i < purchases.length ; i++ ){
                totalDiscount += calculateDiscount(purchases[i]);
                System.out.println("割引価格: " + totalDiscount);
            }


        }
    }

