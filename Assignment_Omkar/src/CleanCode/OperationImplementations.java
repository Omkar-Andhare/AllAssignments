package CleanCode;

public class OperationImplementations implements Operations {
    @Override
    public boolean isArmstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        int noOfDigit = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, noOfDigit);
            temp /= 10;
        }
        return n == sum;
    }

    @Override
    public boolean isEvenOrOddNumber(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isPalindromeNumber(int n) {
        int r, sum = 0;
        int temp=n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return temp == sum;
    }
}