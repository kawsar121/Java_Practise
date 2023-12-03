import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give Me Your Celcius : ");
        double celcius = input.nextDouble();
        double result = celcius * 9/5 + 32;   
        System.out.println("The Fahrenheit Is : "+result);
   
        // oporer ta celcius t farenheit

        // niser ta farenheit to celcius
        System.out.print("Give Me Your Fahrenheit : ");
        double fahrenheit = input.nextDouble();
        double uttor = (fahrenheit - 32) * 5/9;   
        System.out.println("The Celsius Is : "+uttor);

    }
}
