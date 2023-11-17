package ExceptionHandling.CustomException;

public class ATMPinCheckException extends Exception {
    public ATMPinCheckException(String s) {
        super(s);
    }
}
