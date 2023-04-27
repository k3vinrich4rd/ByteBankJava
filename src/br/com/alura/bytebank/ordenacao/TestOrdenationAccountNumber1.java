package br.com.alura.bytebank.ordenacao;

import br.com.alura.bytebank.comparator.AccountNumberComparator;
import br.com.alura.bytebank.template.*;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenationAccountNumber1 {
    public static void main(String[] args) {

        Address address = new Address();
        Client cliente = new Client("Kevin Richard", "333.333.333-33", address);
        Client cliente2 = new Client("Abigail Richard", "333.333.333-33", address);

        CurrentAccount cc1 = new CurrentAccount(22, 33);
        cc1.depositInAccount(333.0);
        cc1.setHolder(cliente);
        SavingsAccount cc2 = new SavingsAccount(22, 44);
        cc2.depositInAccount(444.0);
        cc2.setHolder(cliente2);
        CurrentAccount cc3 = new CurrentAccount(22, 11);
        cc3.depositInAccount(111.0);
        cc3.setHolder(cliente);
        SavingsAccount cc4 = new SavingsAccount(22, 22);
        cc4.depositInAccount(222.0);
        cc4.setHolder(cliente);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Sem o método de numeroDaContaComparator");
        for (Account list : lista) {
            System.out.println(list);
        }
        System.out.println();


        //Maneira menos enxuta
        AccountNumberComparator numeroDaContaComparator = new AccountNumberComparator();
        lista.sort(numeroDaContaComparator);

        System.out.println("Com o método de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }

    }
}