package br.com.alura.bytebank.ordenacao;

import br.com.alura.bytebank.comparator.AccountHolderComparator;
import br.com.alura.bytebank.template.Account;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;
import br.com.alura.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class CustomerNameOrderingTest1 {
    public static void main(String[] args) {

        CurrentAccount cc1 = new CurrentAccount(22, 33);
        Client clienteCC1 = new Client();
        clienteCC1.setName("Nico");
        cc1.setHolder(clienteCC1);
        cc1.depositInAccount(333.0);

        SavingsAccount cc2 = new SavingsAccount(22, 44);
        Client clienteCC2 = new Client();
        clienteCC2.setName("Guilherme");
        cc2.setHolder(clienteCC2);
        cc2.depositInAccount(444.0);

        CurrentAccount cc3 = new CurrentAccount(22, 11);
        Client clienteCC3 = new Client();
        clienteCC3.setName("Paulo");
        cc3.setHolder(clienteCC3);
        cc3.depositInAccount(111.0);

        SavingsAccount cc4 = new SavingsAccount(22, 22);
        Client clienteCC4 = new Client();
        clienteCC4.setName("Ana");
        cc4.setHolder(clienteCC4);
        cc4.depositInAccount(222.0);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("\nSem o método de AccountHolderComparator");
        for (Account list1 : lista) {
            System.out.println(list1);
        }
        System.out.println();

        //Maneira menos enxuta
        AccountHolderComparator titularDaContaComparator = new AccountHolderComparator();
        lista.sort(titularDaContaComparator);

        System.out.println("Com o método de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }

    }
}