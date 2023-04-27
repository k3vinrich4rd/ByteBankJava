package br.com.alura.bytebank.comparator;

import br.com.alura.bytebank.template.Account;

import java.util.Comparator;

public class AccountHolderComparator implements Comparator<Account> {

    @Override
    public int compare(Account conta1, Account conta2) {
        String nomeTitularConta1 = conta1.getHolder().getName();
        String nomeTitularConta2 = conta2.getHolder().getName();
        return nomeTitularConta1.compareToIgnoreCase(nomeTitularConta2);
       /*
       Se for menor - Retornar -1
       Se for maior - Retorna 1
       Se for igual - Retorna 0
        */

    }
}