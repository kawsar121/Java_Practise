import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input jeta disi oita akta variable dora jaw,, oita jekono nam dewa jabe.. tasada ar kisu change hobe na.
        System.out.print("Enter Type Your Radius : ");
        double radius = input.nextDouble(); // double likhar karon holo doshomik ase tai
        double result = 3.1416 * radius * radius;
        System.out.println("The Circle Is : "+result);
    }
}
