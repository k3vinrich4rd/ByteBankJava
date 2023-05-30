package br.com.alura.bytebank.test.testesautomatizadosmain;

import br.com.alura.bytebank.exception.InsufficientBalanceException;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;

public class TestBehaviorAccount3 {
    public static void main(String[] args) throws InsufficientBalanceException{

        CurrentAccount currentAccount = new CurrentAccount(new Client(), 500.0);
        CurrentAccount currentAccount2 = new CurrentAccount(new Client(), 0.0);
        currentAccount.transfer(500, currentAccount2);
        System.out.println(currentAccount.getBalance());
        System.out.println(currentAccount2.getBalance());


    }
}