import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        System.out.println("------------------------------------");
        System.out.println("             Lets Play  ");
        System.out.println("------------------------------------");
        System.out.println();

        Scanner userInput = new Scanner(System.in);


        while(true){
            System.out.println("To start the Game ,Enter rock ,paper or scissors!! To quit the game enter quit.");

            String userMove = userInput.nextLine();

            if(userMove.equals("quit"))
            {
                break;
            }

            if(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")){
                System.out.println("Your move isn't valid!");
            }
            else
            {

                int number = (int)(Math.random()*3);
                String opponentMove = "";
                if(number == 0)
                {
                    opponentMove = "rock";
                }
                else if (number == 1)
                {
                    opponentMove = "paper";
                }
                else
                {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move = " + opponentMove);

                if(userMove.equals(opponentMove))
                {
                    System.out.println("Game is tied");
                }
           else if((userMove.equals("rock") && opponentMove.equals("scissors")) ||
                                (userMove.equals("scissors") && opponentMove.equals("paper"))
                                || (userMove.equals("paper") && opponentMove.equals("rock")))
                {
                    System.out.println("You won the game!!!");
                }
                else
                {
                    System.out.println("You lose the game!!!");
                }
            }
        }
    }
}
