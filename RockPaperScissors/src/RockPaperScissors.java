import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main (String []args){
        //creates object of Random class
        Random random = new Random();
        //creates object of Scanner class
        Scanner scanner = new Scanner(System.in);
        //array of turns for rock, paper, scissors
        String [] turnsArray  = {"Rock", "Paper", "Scissors"};

        //prints game introduction
        System.out.println("Welcome to Rock, Paper, Scissors! Play your turn by entering the word \"Rock\", \"Paper\", or \"Scissors\" ");
        //this stores the user's turn
        String userTurn = scanner.nextLine();
        //random integer generated to pick cpu's turn
        int randomTurn = random.nextInt(turnsArray.length-1);

        //conditions for cpu playing rock
        if (randomTurn == 0){ //this means the cpu will return rock

            System.out.println("The computer played: "+turnsArray[randomTurn]);

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

            else {

                System.out.println("Invalid input");
            }


        }

        //conditions for cpu playing paper
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

            else {

                System.out.println("Invalid input");
            }

        }

        //conditions for cpu playing scissors
        else if(randomTurn == 2) { //this means the cpu will return scissors

            System.out.println("The computer played: "+turnsArray[randomTurn]);

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

            else {

                System.out.println("Invalid input");
            }


        }

    }
}
