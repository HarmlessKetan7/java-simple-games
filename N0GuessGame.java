import java.util.Random;
import java.util.Scanner;

public class N0GuessGame {
    public static void main(String[] args) {

        //Number Guessing Game;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int Guess;
        int Attempts = 0;
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(min, max + 1);


        System.out.println("Number Guessing Game.");
        System.out.printf("Guess a number between %d-%d\n", min, max);


        do{
            System.out.print("Enter a Guess: ");
            Guess = scanner.nextInt();
            Attempts ++;

            if(Guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(Guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# Attempts: " + Attempts);
            }

        }while(Guess != randomNumber);

        System.out.println("You have won");

        scanner.close();
    }
}