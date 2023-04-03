package br.com.alura.bytebank.test;

import br.com.alura.bytebank.template.AccountCurrent;

public class TestBehaviorConstructor {
    public static void main(String[] args) {

        AccountCurrent accountCurrent = new AccountCurrent();
        accountCurrent.setNumber(-1);
        accountCurrent.setAgency(-1);
    }
}