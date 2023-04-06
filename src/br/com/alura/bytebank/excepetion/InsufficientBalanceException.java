package br.com.alura.bytebank.excepetion;

import br.com.alura.bytebank.enums.ExceptionsEnum;

public class InsufficientBalanceException extends Exception {

    @Override
    public String getMessage() {
        return ExceptionsEnum.INSUFFICIENT_BALANCE.getException();
    }
}