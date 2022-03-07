package snakeandladder;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
	public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
	static Random random = new Random();
	
    static int getRandomDieValue(){
        int randomValue = random.nextInt(6) + 1;
        return randomValue;
    }   
    static int getRandomOption() {
        int randomValue1 = random.nextInt(3);
        return randomValue1;
        }
	public static void main(String[] args){
        System.out.println("Snake and Ladder ");           
        System.out.println("-------------------------------");
        Scanner input = new Scanner(System.in);
        int startPosition = 0;
        int currentPosition = 0;
        System.out.println("Player starting on: " + startPosition);
        System.out.println("Enter 1 to roll a die");
        int die = input.nextInt();
        if(die == 1){
            int playerDie = getRandomDieValue();
            System.out.println("-------------------------------");
            System.out.println("Die Face: " +playerDie);
            int option = getRandomOption();
            switch (option) {
                case IS_LADDER:
                    System.out.println("Option: LADDER");
                    currentPosition += playerDie;
                    break;
                case IS_SNAKE:
                    System.out.println("Option: SNAKE");
                    currentPosition -= playerDie;
                    break;
                default:
                    System.out.println("Option: NO PLAY");
                    break;
            }
            System.out.println("Current Position: " +currentPosition);
            System.out.println("-------------------------------");
        }
        else {
            System.exit(0);
        }
        }
}