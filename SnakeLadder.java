import java.util.Random;

public class SnakeLadder{
    public static void main(String args[]) {
        Random random = new Random();

        int diceRoll = random.nextInt(6);
        int options = random.nextInt(3);
        //Constants
        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;

        //Variables
        int finalDiceRoll = diceRoll + 1;
        int position = 0;

        System.out.println("dice roll no is: " + finalDiceRoll);
        System.out.println("playing option is :"+options);
        if (options == NO_PLAY)
            position = position + 0;
        else if (options == LADDER)
            position = position + finalDiceRoll;
        else {
            position = position - finalDiceRoll;
            if (position <= 0)
                position = 0;
        }
        System.out.println("current position:"+position);
    }
    }
