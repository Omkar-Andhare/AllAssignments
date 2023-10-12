package CleanCode.serviceimpl;

import CleanCode.service.IEvenOdd;

public class EvenOddImpl implements IEvenOdd {
    @Override
    public void isEvenOrOddNumber(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ": is Even Number");
        } else {
            System.out.println(n + ": is Odd Number");
        }

    }
}
