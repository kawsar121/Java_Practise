import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Type Base : ");
        double base = input.nextDouble();
        System.out.print("Enter Type Height : ");
        double height = input.nextDouble();
        double result = 0.5 * base * height;
        System.out.println("The Triangle is : "+result);

    }
}
