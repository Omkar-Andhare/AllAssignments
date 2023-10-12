package CleanCode.serviceimpl;

import CleanCode.service.IPalindrome;

public class PalindromeImpl implements IPalindrome {
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
