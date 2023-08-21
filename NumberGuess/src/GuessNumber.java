import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {

        System.out.println("------------------------------------");
        System.out.println("          Pick any Number  ");
        System.out.println("------------------------------------");
        System.out.println();

        Random random = new Random();
        int randomNumber = random.nextInt(100); 

        Scanner userInput = new Scanner(System.in);
        System.out.println(" Guess a number between 0 and 100! ");
        int guess;
        int noOfTries = 1;
        boolean win = false;

        while (!win)
        {
            guess = userInput.nextInt();

            if (noOfTries < 6)
            {

                if (guess == randomNumber) {
                    System.out.println();
                    System.out.println("Winner!! Number guessed is: " + randomNumber);
                    System.out.println("It took " + noOfTries + " guesses to get it correct");
                    userInput.close();
                    win = true;
                }
                else if (guess < randomNumber)
                {
                    System.out.println("Guess failed!! Number guessed is too low ");
                    System.out.println();
                    System.out.println("Please guess again: ");

                }
                else
                {
                    System.out.println("Guess failed!! Number guessed is much high");
                    System.out.println();
                    System.out.println("Please guess again: ");
                }
            }
            else if (noOfTries == 6)
            {
                if(guess == randomNumber)
                {
                    System.out.println();
                    System.out.println("Winner!! Number guessed is: " + randomNumber);
                    System.out.println("It took " + noOfTries + " guesses to get it correct");
                    userInput.close();
                    win = true;
                }
                if(guess != randomNumber)
                {
                    System.out.println();
                    System.out.println("Sorry you ran out of attempts.The correct number is: " + randomNumber);
                    userInput.close();
                    break;
                }
            }
            noOfTries = noOfTries + 1;
        }
    }
}
