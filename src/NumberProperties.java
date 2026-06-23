public class NumberProperties {

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

        if(number <= 0) {
            return false;
        }

        while (temp1 > 0) {
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

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return total == number;
    }


}
