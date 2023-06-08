package br.com.alura.bytebank.test;

import br.com.alura.bytebank.exception.InsufficientBalanceException;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;

public class TestBehaviorAccount2 {
    public static void main(String[] args) throws InsufficientBalanceException {

        CurrentAccount currentAccount = new CurrentAccount(new Client(), 500.0);
        currentAccount.depositInAccount(500);
        currentAccount.toWithdraw(300.0);
        System.out.println(currentAccount.getBalance());


    }
}