package model.exception;

public class WithdrawException extends Exception{

    public static  final long serialVersionUID = 1L;

    public WithdrawException(String message) {
        super(message);
    }

}
