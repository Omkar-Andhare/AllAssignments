package CleanCode.serviceimpl;

import CleanCode.service.IOperationOnNumbers;

public class ArmstrongImpl implements IOperationOnNumbers {
    @Override
    public void performCheck(int n) {
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
}
