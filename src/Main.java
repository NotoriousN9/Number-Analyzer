//IMPORTANT NOTE:- Always try methods that save as much memory and time. And implement them later on as we progress.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        //TODO: Keep on adding number identifiers
        System.out.println("""
                Available Operations:-
                1. Prime Number Check
                2. Armstrong Number Check
                3. Palindrome Number Check
               """);

        System.out.print("Enter your choice: ");
        number = scanner.nextInt();

        System.out.println("You chose " + number);
    }
}