import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class TemperatureCalculator {

    public static void main (String [] args) {
        //scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the scale in which you want to convert your temperature (F for Fahrenheit or C for Celsius): ");
        //stores the temperature the user wants to convert to
        String scale = scanner.nextLine();

        System.out.println("Please enter the temperature in digits: ");

        //stores the starting temperature
        double temperature = scanner.nextDouble();
        //placeholder for the new temperature
        double newTemp = 0;

        //checks input
        if (scale.equalsIgnoreCase("F")){
            //performs calculations
            newTemp = (temperature-32) * (0.55556);
            System.out.println(temperature + " degrees Fahrenheit is equal to " + newTemp + " degrees Celsius.");
        }


        //checks input
        else if (scale.equalsIgnoreCase("C")){
            //performs calculations
            newTemp = (temperature * 1.8) + 32;
            System.out.println(temperature + " degrees Celsius is equal to " + newTemp + " degrees Fahrenheit.");

        }

        else {
            System.out.println("Invalid input");
        }

        System.out.println("Thanks for playing, goodbye!");
        scanner.close();
    }




}
