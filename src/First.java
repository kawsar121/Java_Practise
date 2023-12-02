                            // ⭐Practise:1
/* 

public class First {

    public static void main(String[] args) {
        System.out.print("Tohidul Islam Kawsar Bhuiyan");
        System.out.print("Roll:683480");
        System.out.print("Institue:FCI");
        System.out.print("Regestration: 683480");
    }
}
 */





                                    // ⭐Practise:1-alternative(simple:hahaaa) \n mane new line create kora 
/*   

public class First {

    public static void main(String[] args) {
        System.out.print("Tohidul Islam \n Roll:683480 \n Institue:FCI \n Regestration: 683480 ");
    }
}
 
*/

            // ⭐practise 2 , \t mane holo 2 ta jinish likhle potom ta dekhanor por ditiyo ta dekhabe
/*
 public class First {

    public static void main(String[] args) {
        System.out.print("1 \t 2");
        System.out.print("3 \t 4");

    }
}


*/

            // ⭐practise 3 shortcut (psvm)

/*
 public class First {

    public static void main(String[] args) { 
        int a;
        int b; 
        a = 2;
        b= 3;
        int addition= a+b;
        System.out.print(addition);
    } 
}
 */

            // ⭐practise 4

/*
 import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in) ;
        int number;
        System.out.print("Enter type your number");
        number = my.nextInt();
        System.out.print("The number is : " + number);
    }
}
 */


            // ⭐practise 4 er shortcut with addition
/* 
import java.util.Scanner;


 public class First {

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.print("The number 1 is : " );
        int number1 = my.nextInt();
        System.out.print("The number 2 is : " );
        int number2 = my.nextInt();
        int addition = number1+number2;
        System.out.print("The addition is : "+ addition);
    }
}
 */

                    // ⭐practise 5 Subtraction

/*
    import java.util.Scanner;

public class First {
 
        public static void main(String[] args) {
            Scanner you = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            int number1 = you.nextInt();
            System.out.print("Enter the second number : ");
            int number2 = you.nextInt();
            int subtruction = number1-number2;
            System.out.print("The subtruction is : "+subtruction);            
        }
 }
 */

                // ⭐practise 5 multification

/*
    import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.print("First number is : ");
        int number1 = pop.nextInt(); 
        System.out.print("Second number is : ");
        int number2 = pop.nextInt();
        int multification = number1*number2;
        System.out.print(multification);
    }
}

 */
// Jodi intijer na niya string ni tahle nextInt er jawgaw voshve nextline()
// Jodi intijer na niya DOuble ni tahle nextInt er jawgaw voshve nextDouble()
// Jodi intijer na niya Float ni tahle nextInt er jawgaw voshve nextFloat()


                      // ⭐practise 6 Rombosher khetropol nirnow

/*
    import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner outi = new Scanner(System.in);
        System.out.print("Enter type First number:");
        int d1 = outi.nextInt();
        System.out.print("Enter type second number:");
        int d2 = outi.nextInt();
        System.out.print(0.5*(d1*d2));
    }
}
 */

                    // ⭐practise 7 if else er programmer

/*
 import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner pol = new Scanner(System.in);
        System.out.print("Enter type a : ");
        int a = pol.nextInt();
        System.out.print("Enter type b : ");
        int b = pol.nextInt();
        System.out.print("Enter type c : ");
        int c = pol.nextInt();
        if(a>b){
            System.out.print("A is gaterthan");
        }
        else if (b>c) {
            System.out.print("B is gaterthan");
        }
        else{
            System.out.print("C is gaterthan");
        }
    }
}
 */

            // ⭐practise 7 Result cheek korar programme  

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.print("Enter Type Your Marks : ");
        double number = result.nextDouble();
        if (number>=80) {
            System.out.print("Your result is : A+");
        }
        else if (number>=70) {
            System.out.print("Your result is : A");
        }
        else if (number>=60) {
            System.out.print("Your result is : A-");
        }
        else if (number>=50) {
            System.out.print("Your result is : B");
        }
        else if (number>=40) {
            System.out.print("Your result is : C");
        }
        else if (number>=33) {
            System.out.print("Your result is : D");
        }
        else{
            System.out.print("You Are Failed");
        }
    }
    
}