import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main (String []args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String [] turnsArray  = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors! Play your turn by entering the word \"Rock\", \"Paper\", or \"Scissors\" ");
        String userTurn = scanner.nextLine();

        int randomTurn = random.nextInt(turnsArray.length-1);

        if (randomTurn == 0){ //this means the cpu will return rock
            System.out.println("The computer played: " + turnsArray[randomTurn]);

            if (userTurn.equalsIgnoreCase("rock")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (userTurn.equalsIgnoreCase("paper")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (userTurn.equalsIgnoreCase("scissors")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");

            }

        }

        else if(randomTurn == 1){// this means the cpu will return paper
            System.out.println("The computer played: "+turnsArray[randomTurn]);

            if (userTurn.equalsIgnoreCase("rock")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");


            }

            else if (userTurn.equalsIgnoreCase("paper")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (userTurn.equalsIgnoreCase("scissors")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");

            }

        }

        else { //this means the cpu will return scissors
            System.out.println("The computer played: " + turnsArray[randomTurn]);

            if (userTurn.equalsIgnoreCase("rock")){
                System.out.println("You lose!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (userTurn.equalsIgnoreCase("paper")){
                System.out.println("You win!");
                scanner.close();
                System.out.println("Goodbye!");

            }

            else if (userTurn.equalsIgnoreCase("scissors")){
                System.out.println("It's a draw!");
                scanner.close();
                System.out.println("Goodbye!");
            }


        }

    }
}
