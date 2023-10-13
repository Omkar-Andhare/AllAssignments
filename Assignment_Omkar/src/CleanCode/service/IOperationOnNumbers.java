package CleanCode.service;

public interface IOperationOnNumbers {

    default void performCheck(int n) {
        System.out.println("Hey this is a default method for checking number");
    }
}
