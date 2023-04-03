package br.com.alura.bytebank.test;

import br.com.alura.bytebank.template.AccountCurrent;
import br.com.alura.bytebank.template.AccountSavings;
import br.com.alura.bytebank.template.Address;
import br.com.alura.bytebank.template.Client;

public class TestBehaviorAccount {
    public static void main(String[] args) {

        Address address = new Address("Rua Tim Maia", 333,
                "Jd musical", "Osasco", "São paulo",
                "0000-000", "Casa");

        Client client = new Client("Kevin Richard", "000.000.000-00", address);

        AccountSavings accountSavings = new AccountSavings(client, 0, 1, 2);
        AccountCurrent accountCurrent = new AccountCurrent();


        System.out.println("Efetuando deposito");
        accountCurrent.depositInAccount(1000);
        System.out.println("Balance in account " + accountCurrent.getBalance() + "\n");

        System.out.println("Efetuando o saque, com erro");
        accountCurrent.toWithdraw(100000);
        System.out.println();

        System.out.println("Efetuando a transferência: ");
        accountCurrent.transfer(500, accountSavings);
        System.out.println("Balance in account após a transferência: " + accountSavings.getBalance());
    }
}