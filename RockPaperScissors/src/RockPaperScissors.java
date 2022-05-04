import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main (String []args){

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        String [] generatedTurns  = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors! Play your turn by entering the word \"Rock\", \"Paper\", or \"Scissors\" ");
        String turn = scanner.nextLine();

        int turnPicker = random.nextInt(generatedTurns.length-1);

        if (turnPicker == 0){ //this means the cpu will return rock
            System.out.println("The computer played: " + generatedTurns[turnPicker]);

            if (turn.equalsIgnoreCase("rock")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (turn.equalsIgnoreCase("paper")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (turn.equalsIgnoreCase("scissors")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");


            }

        }

        else if(turnPicker == 1){// this means the cpu will return paper
            System.out.println("The computer played: "+generatedTurns[turnPicker]);

            if (turn.equalsIgnoreCase("rock")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (turn.equalsIgnoreCase("paper")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (turn.equalsIgnoreCase("scissors")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");

            }

        }

        else { //this means the cpu will return scissors
            System.out.println("The computer played: " + generatedTurns[turnPicker]);

            if (turn.equalsIgnoreCase("rock")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (turn.equalsIgnoreCase("paper")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (turn.equalsIgnoreCase("scissors")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");


            }


        }




    }
}
