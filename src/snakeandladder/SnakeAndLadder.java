package snakeandladder;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
	static Random random = new Random();
    static int getRandomDieValue()
    {
        int randomValue = random.nextInt(6) + 1;
        return randomValue;
    }

	    public static void main(String[] args)
	    {
        System.out.println("Snake and Ladder ");           
        System.out.println("-------------------------------");
        int startPosition = 0;
        System.out.println("Player starting on: " + startPosition);
        System.out.println("Enter 1 to roll a die");
        Scanner input = new Scanner(System.in);
        int die = input.nextInt();
        if(die == 1)
        {
            int playerDie = getRandomDieValue();
            System.out.println("Die Face: " +playerDie);
        }
        else 
        {
            System.exit(0);
        }
        }
}