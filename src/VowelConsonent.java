/*
  import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter type your letter : ");
        char result = input.next().charAt(0);  // jehutu nextChr nai tai .chrAt eta use korte hobe
        if (result == 'a') {
            System.out.println("Voewl");
        }
        else if (result == 'e') {
            System.out.println("Voewl");
        }
        else if (result == 'i') {
            System.out.println("Voewl");
        }
        else if (result == 'o') {
            System.out.println("Voewl");
        }
        else if (result == 'u') {
            System.out.println("Voewl");
        }
        else{
            System.out.println("Consonent");
        }
    }
}

 */

                // Oporer kaz ta aro shundor babe kora jabe

import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Type Your Letter : ");
        char result = input.next().charAt(0);
        if (result == 'a' || result == 'e' || result == 'i' || result == 'o' || result == 'u') {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}