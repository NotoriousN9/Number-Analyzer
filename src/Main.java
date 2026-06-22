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
        }


        switch (choice) {
            case 1:
                System.out.println("===ANALYSIS REPORT===");
                System.out.println("Prime: " + (isPrime(number) ? "Yes" : "No"));
                System.out.println("Armstrong: " + (isArmstrong(number) ? "Yes" : "No"));
                System.out.println("Palindrome: " + (isPalindrome(number) ? "Yes" : "No"));
                System.out.println("Perfect: " + (isPerfect(number) ? "Yes" : "No"));
                break;

            case 2:
                if(isPrime(number)) {
                    System.out.println("Prime Number");
                }
                else {
                    System.out.println("Not a Prime Number");
                }
                break;

            case 3:
                if(isArmstrong(number)) {
                    System.out.println("Armstrong Number");
                }
                else {
                    System.out.println("Not an Armstrong Number");
                }
                break;

            case 4:
                if(isPalindrome(number)) {
                    System.out.println("Palindrome Number");
                }
                else {
                    System.out.println("Not a Palindrome Number");
                }
                break;

            case 5:
                if(isPerfect(number)) {
                    System.out.println("Perfect Number");
                }
                else {
                    System.out.println("Not a Perfect Number");
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


    public static boolean isPalindrome(int number) {
        int rev = 0;
        int temp = number;

        while(temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            rev = rev * 10 + lastDigit;
        }

        return rev == number;
    }

    public static boolean isPerfect(int number) {
        int total = 0;

        if(number == 1) {
            return false;
        }

        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return total == number;
    }
}