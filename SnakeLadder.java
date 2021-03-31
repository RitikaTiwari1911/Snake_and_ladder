import java.util.Random;

public class SnakeLadder{
    public static void main(String args[]){
        Random random=new Random();
        int diceRoll=random.nextInt(6);
        int finalDiceRoll=diceRoll+1;
        int position=0;
        System.out.println("dice roll no is: "+finalDiceRoll);
        System.out.println("current position:"+position);
    }
}
