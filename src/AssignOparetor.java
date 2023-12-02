            // Practise 1 assign oparator
/*
 public class AssignOparetor {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        x += y;
        System.out.println(x);
    }
}
 */

            // Practise 2 Plus assign oparator

/*
  import java.util.Scanner;

public class AssignOparetor {

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.print("Enter type your first number : ");
        int a = my.nextInt();
        System.out.print("Enter type your second number : ");
        int b = my.nextInt();
        a += b;                     a = a+b
        System.out.println("Your result is : "+a);
    }
}
 */

            // Practise 2 Division & Multification assign oparator

import java.util.Scanner;

/**
 * AssignOparetor
 */
public class AssignOparetor {

    public static void main(String[] args) {
            Scanner results = new Scanner(System.in);      
            System.out.print("Enter type your first number : ");
            int a = results.nextInt();
            System.out.print("Enter type your Second number : ");
            int b = results.nextInt();
            a *= b;                         // a = a*b
            System.out.println("Your multification result is : "+ a);

           

    }
}