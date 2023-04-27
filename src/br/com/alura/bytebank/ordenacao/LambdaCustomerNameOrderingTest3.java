package br.com.alura.bytebank.ordenacao;

import br.com.alura.bytebank.template.Account;
import br.com.alura.bytebank.template.Client;
import br.com.alura.bytebank.template.CurrentAccount;
import br.com.alura.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaCustomerNameOrderingTest3 {
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

        System.out.println("Sem o método de numeroDaContaComparator");
        for (Account list1 : lista) {
            System.out.println(list1);
        }
        System.out.println();

        //Classe anônima, outra forma de implementa
        //Sintaxe:
        Comparator<Account> comparator = new Comparator<Account>() {

            @Override
            public int compare(Account conta1, Account conta2) {
                String nomeTitularConta1 = conta1.getHolder().getName();
                String nomeTitularConta2 = conta2.getHolder().getName();
                return nomeTitularConta1.compareToIgnoreCase(nomeTitularConta2);
                /* return -1; //Vai para a primeira posição
                return 1; //Vai para a última posição
                return 0; //Para número*/
            }
        };

        lista.sort(comparator);

        System.out.println("Com o método de numeroDaContaComparator ");
        lista.forEach((conta) -> System.out.println(conta)); //forEach com lambda

    }
}
