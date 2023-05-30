package br.com.alura.bytebank.test;

import br.com.alura.bytebank.exception.InsufficientBalanceException;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBehaviorAccountTest {

    @Test
    void aContaDeveEfetuarUmDeposito() {
        Client client = new Client();
        CurrentAccount currentAccount = new CurrentAccount(client, 0, 333, 44);
        double deposit = currentAccount.depositInAccount(1000);

        assertEquals(1000.0, deposit);

    }

    @Test
    void aContaDeveEfetuarUmDepositoCorretamente() {
        Client client = new Client();
        CurrentAccount currentAccount = new CurrentAccount(client, 0, 111, 222);
        currentAccount.depositInAccount(1000.0);

        double balanceInAccount = currentAccount.getBalance();

        assertEquals(1000.0, balanceInAccount);
    }

    @Test
    void aContaDeveEfetuarUmaTransferencia() throws InsufficientBalanceException {
        Client client1 = new Client();
        Client client2 = new Client();
        CurrentAccount currentAccount1 = new CurrentAccount(client1, 1000, 333, 444);
        CurrentAccount currentAccount2 = new CurrentAccount(client2, 0, 666, 333);

        double transfer = currentAccount1.transfer(500.0, currentAccount2);
        assertEquals(500.0, transfer);

    }

    @Test
    void aContaDeveTransferirCorretamente() throws InsufficientBalanceException {
        Client client1 = new Client();
        Client client2 = new Client();
        CurrentAccount currentAccount1 = new CurrentAccount(client1, 1000.0, 111, 222);
        CurrentAccount currentAccount2 = new CurrentAccount(client2, 0, 333, 555);

        currentAccount1.transfer(500.0, currentAccount2);
        double balanceInAccount = currentAccount2.getBalance();

        assertEquals(500.0, balanceInAccount);
    }

    @Test
    void aContaDeveEfetuarUmSaque() throws InsufficientBalanceException {
        Client client = new Client();
        CurrentAccount currentAccount = new CurrentAccount(client, 1000);
        double saque = currentAccount.toWithdraw(1000);

        assertEquals(1000.0, saque);
    }

    @Test
    void aContaDeveEfetuarOSaqueCorretamente() throws InsufficientBalanceException {
        Client client = new Client();
        CurrentAccount currentAccount = new CurrentAccount(client, 1000.0);
        currentAccount.toWithdraw(1000.0);
        double balanceInAccount = currentAccount.getBalance();

        assertEquals(0.0, balanceInAccount);
    }


}