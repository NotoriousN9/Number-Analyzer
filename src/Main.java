//IMPORTANT NOTE:- Always try methods that save as much memory and time. And implement them later on as we progress.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        //TODO: Keep on adding number identifiers
        System.out.println("""
                Available Operations:-
                1. Analyze Number
                2. Prime Number Check
                3. Armstrong Number Check
                4. Palindrome Number Check
                5. Perfect Number Check
               """);


        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        System.out.println("You chose " + choice);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number < 0) {
            System.out.println("Not Applicable.");
            return;
        }


        switch (choice) {
            case 1:
                System.out.println("===ANALYSIS REPORT===");
                System.out.println("Prime: " + (NumberProperties.isPrime(number) ? "Yes" : "No"));
                System.out.println("Armstrong: " + (NumberProperties.isArmstrong(number) ? "Yes" : "No"));
                System.out.println("Palindrome: " + (NumberProperties.isPalindrome(number) ? "Yes" : "No"));
                System.out.println("Perfect: " + (NumberProperties.isPerfect(number) ? "Yes" : "No"));
                break;

            case 2:
                System.out.println(NumberProperties.isPrime(number) ? "Prime Number" : "Not a Prime Number");
                break;

            case 3:
                System.out.println(NumberProperties.isArmstrong(number) ? "Armstrong Number" : "Not an Armstrong Number");
                break;

            case 4:
                System.out.println(NumberProperties.isPalindrome(number) ? "Palindrome Number" : "Not a Palindrome Number");
                break;

            case 5:
                System.out.println(NumberProperties.isPerfect(number) ? "Perfect Number" : "Not a Perfect Number");
                break;

            default:
                System.out.println("Choose correctly.");
        }
    }
}