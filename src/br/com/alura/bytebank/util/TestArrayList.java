package br.com.alura.bytebank.util;

import br.com.alura.bytebank.template.Account;
import br.com.alura.bytebank.template.CurrentAccount;
import br.com.alura.bytebank.template.SavingsAccount;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        SavingsAccount savingsAccount = new SavingsAccount(222, 333);
        CurrentAccount currentAccount1 = new CurrentAccount(444, 333);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(currentAccount);
        accounts.add(savingsAccount);
        accounts.add(currentAccount1);

        System.out.println("Elements in Array: " + accounts.size() + "\n");

        System.out.println("Percorrendo com forEach");
        for (Account account : accounts) {
            System.out.println(account.toString(account.getAgency(), account.getNumber()) + "\n");
        }
        System.out.println("-----------------------------------\n");

        accounts.remove(currentAccount1);
        System.out.println("Elements in Array after removed " + accounts.size());

    }

}