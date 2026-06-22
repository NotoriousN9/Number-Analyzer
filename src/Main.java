//IMPORTANT NOTE:- Always try methods that save as much memory and time. And implement them later on as we progress.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        //TODO: Keep on adding number identifiers
        System.out.println("""
                Available Operations:-
                1. Prime Number Check
                2. Armstrong Number Check
                3. Palindrome Number Check
               """);


        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        System.out.println("You chose " + choice);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();


        switch (choice) {
            case 1:
                if(isPrime(number)) {
                    System.out.println("Prime Number");
                }
                else {
                    System.out.println("Not a Prime Number");
                }
                break;

            case 2:
                if(isArmstrong(number)) {
                    System.out.println("Armstrong Number");
                }
                else {
                    System.out.println("Not an Armstrong Number");
                }
                break;

            default:
                System.out.println("Choose correctly.");
        }
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(number);
        for (int i = 3; i <= limit; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArmstrong(int number) {
        int temp1 = number;
        int temp2 = number;

        int count = 0;
        while (temp1 > 0) {
            int remainder = temp1 % 10;
            count++;
            temp1 /= 10;
        }

        int total = 0;
        while(temp2 > 0) {
            int remainder = temp2 % 10;
            temp2 /= 10;
            total += (int) Math.pow(remainder, count);
        }

        return total == number;
    }

}