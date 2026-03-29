
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args){

        // RockPaperScissorsGame

   String[] choices = {"rock", "paper", "scissors"};
   String PlayerChoice;
   String ComputerChoice;
   String PlayAgain = "yes";

   Scanner scanner = new Scanner(System.in);
   Random random = new Random();


        System.out.print("Chose your move (rock/paper/scissors): ");
        PlayerChoice = scanner.nextLine().toLowerCase();


        do{if(!PlayerChoice.equals("rock") &&
               !PlayerChoice.equals("paper") &&
               !PlayerChoice.equals("scissors") ){

           System.out.println("INVALID CHOICE!");
       }

           ComputerChoice = choices[random.nextInt(3)];
           System.out.println("Computer choice " + ComputerChoice);

           if(PlayerChoice.equals(ComputerChoice)){
               System.out.println("ITS A TIE!");
           }
           else if((PlayerChoice.equals("paper") && ComputerChoice.equals("rock")) ||
                   (PlayerChoice.equals("rock") && ComputerChoice.equals("scissors")) ||
                   (PlayerChoice.equals("scissors") && ComputerChoice.equals("paper"))){
               System.out.println("YOU WIN!");
           }else{
               System.out.println("YOU LOSE!");
           }

           System.out.println("Play again (yes/No): ");
           PlayAgain = scanner.nextLine().toLowerCase();

       }while(PlayAgain.equals("Yes"));

        System.out.println("Thanks for Playing!");



        scanner.close();
    }
}
