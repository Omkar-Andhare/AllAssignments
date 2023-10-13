package CleanCode.serviceimpl;

import CleanCode.service.IOperationOnNumbers;

public class EvenOddImpl implements IOperationOnNumbers {
    @Override
    public void performCheck(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ": is Even Number");
        } else {
            System.out.println(n + ": is Odd Number");
        }

    }
}
