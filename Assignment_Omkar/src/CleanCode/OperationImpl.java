package CleanCode;

public class OperationImpl implements IArmstrongNumber, IEvenOdd, IPalindromeNumber {
    @Override
    public void isArmstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        int noOfDigit = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, noOfDigit);
            temp /= 10;
        }
        if (n == sum) {
            System.out.println(n + ": is Armstrong number");
        } else {
            System.out.println(n + ": is not Armstrong number");
        }
    }
    @Override
    public void isEvenOrOddNumber(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ": is Even Number");
        } else {
            System.out.println(n + ": is Odd Number");
        }
    }

    @Override
    public void isPalindromeNumber(int n) {
        int remainder, sum = 0;
        int temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum = (sum * 10) + remainder;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println(temp + ": is Palindrome number");
        } else {
            System.out.println(temp + ": is not palindrome number");
        }
    }
}