import java.util.Scanner;

public class Quizgame
{
    public static void main(String[] args)
    {

        String[] Questions = {"Where is the New York located?",
                             "Capital city of India?",
                             "Who invented the computer?",
                             "Who wins most Mr. Olympia?",
                             "Which is fast growing country in the world?",
                             "Where is the largest cricket stadium in the world?"};

         String[][] Options = {{"1. Asia", "2. China", "3. India", "4. America"},
                              {"1. Bangalore", "2. Noida", "3. Delhi", "4. Mumbai"},
                              {"1. Elon musk", "2. Charles Babbage", "3. Einstein", "4. Larry Page"},
                              {"1. Ronnie Coleman", "2. Arnold Schwarzenegger", "3. Chris Bumstead", "4. Reign"},
                              {"1. India", "2. America", "3. Australia", "4. Singapore"},
                              {"1. Lords", "2. Melbourne", "3. Narendra Modi", "4. Vankhede"}};



         int[] Answers = {4, 3, 2, 1, 1, 3};
         int Score = 0;
         int Guess;
         Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Welcome to the java Quiz Game!");
        System.out.println("------------------------------");

        for(int i = 0; i < Questions.length; i++)
        {
            System.out.println(Questions[i]);

            for(String Option : Options[i])
             {
                System.out.println(Option);
             }

                System.out.print("Enter your guess: ");
                Guess = scanner.nextInt();

                if(Guess == Answers[i]) {
                    System.out.println("|*|CORRECT|*|");
                    Score++;
                }else
                {
                    System.out.println("|*|WRONG|*|");
                }
        }
            System.out.println("Your Final Score is " + Score + " out of 6");

            scanner.close();
    }
}



