
package br.com.alura.bytebank.comparator;

import br.com.alura.bytebank.template.Account;

import java.util.Comparator;

public class AccountNumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account conta1, Account conta2) {
        return Integer.compare(conta1.getNumber(), conta2.getNumber());

        //return conta1.getNumero() - conta2.getNumero(); //simplificando

        //para fazer a mesma coisa abaixo:
//        if (conta1.getNumero() < conta2.getNumero()) {
//            return -1; //Vai para a primeira posição
//        } else if (conta1.getNumero() > conta2.getNumero()) {
//            return 1; //Vai para a última posição
//        }
//        return 0; //Para número iguais

    }
}