package TimeSpaceComplexityTask.serviceimpl;

import TimeSpaceComplexityTask.service.IOperation;

public class FibonacciImpl implements IOperation {

    @Override
    public int findNthNumber(int number) {
        if (number <= 1) {
            return number;
        }

        int prevNumber = 0, currentNumber = 1;
        for (int i = 2; i <= number; i++) {
            int nextNumber = prevNumber + currentNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }
        return currentNumber;
    }
}
