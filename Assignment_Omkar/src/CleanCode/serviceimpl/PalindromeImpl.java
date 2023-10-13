package CleanCode.serviceimpl;

import CleanCode.service.IOperationOnNumbers;

public class PalindromeImpl implements IOperationOnNumbers {
    @Override
    public void performCheck(int n) {
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
