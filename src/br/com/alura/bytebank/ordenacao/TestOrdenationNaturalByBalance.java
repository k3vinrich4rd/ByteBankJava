package br.com.alura.bytebank.ordenacao;

import br.com.alura.bytebank.template.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenationNaturalByBalance {
    public static void main(String[] args) {

        Address address = new Address("Rua Tim Maia", 333,
                "Jd musical", "Osasco", "São paulo",
                "0000-000", "Casa");


        CurrentAccount cc1 = new CurrentAccount(11, 33);
        Client clienteCC1 = new Client();
        clienteCC1.setName("Nico");
        clienteCC1.setCpf("000.000.000-00");
        clienteCC1.setAddress(address);
        cc1.setHolder(clienteCC1);
        cc1.depositInAccount(333.0);

        SavingsAccount cc2 = new SavingsAccount(22, 44);
        Client clienteCC2 = new Client();
        clienteCC2.setName("Guilherme");
        clienteCC2.setCpf("000.000.000-00");
        clienteCC2.setAddress(address);
        cc2.setHolder(clienteCC2);
        cc2.depositInAccount(444.0);

        CurrentAccount cc3 = new CurrentAccount(22, 11);
        Client clienteCC3 = new Client();
        clienteCC3.setName("Paulo");
        clienteCC3.setCpf("000.000.000-00");
        clienteCC3.setAddress(address);
        cc3.setHolder(clienteCC3);
        cc3.depositInAccount(111.0);

        SavingsAccount cc4 = new SavingsAccount(22, 22);
        Client clienteCC4 = new Client();
        clienteCC4.setName("Ana");
        clienteCC4.setCpf("000.000.000-00");
        clienteCC4.setAddress(address);
        cc4.setHolder(clienteCC4);
        cc4.depositInAccount(222.0);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("\nSem o método de numeroDaContaComparator");
        for (Account list1 : lista) {
            System.out.println("\n" + list1);
        }
        System.out.println();


        //Definindo a ordem natural da lista pelo critério de saldo
        Collections.sort(lista);

         /* Importante → Para utilizar o método compare podemos criar um objeto
         e uma variável de referência, mas como usamos a variável para passar
         apenas dentro do argumento do (sort), podemos fazer de uma maneira mais enxuta:*/
        // lista.sort(new TitularDaContaComparator());

        //Maneira menos enxuta
        // TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();
        //lista.sort(titularDaContaComparator);

        System.out.println("Com o método de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }

    }
}