import java.util.Scanner;
public class TemperatureCalculator {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the scale in which you want to convert your temperature (F for Fahrenheit or C for Celsius): ");

        String scale = scanner.nextLine();

        System.out.println("Please enter the temperature in numbers (ex. 45.1): ");

        double temperature = scanner.nextDouble();

        double newTemp = 0;

        if (scale.equalsIgnoreCase("F")){

            newTemp = (temperature-32) * (0.55556);
            System.out.println(temperature + " degrees Fahrenheit is equal to " + newTemp + " degrees Celsius.");
        }


        else if (scale.equalsIgnoreCase("C")){

            newTemp = (temperature * 1.8) + 32;

            System.out.println(temperature + " degrees Celsius is equal to " + newTemp + " degrees Fahrenheit.");

        }

        else {
            System.out.println("Invalid input");
        }

    }


}
