package br.com.alura.bytebank.test;


import br.com.alura.bytebank.template.AccountCurrent;
import br.com.alura.bytebank.template.Address;
import br.com.alura.bytebank.template.Client;



public class TestBehaviorClientAndAccount {
    public static void main(String[] args) {

        Address address = new Address("Rua Tim Maia", 333,
                "Jd musical", "Osasco", "São paulo",
                "0000-000", "Casa");

        Client kevinRichard = new Client("Kevin Richard", "000.000.000-00", address);

        AccountCurrent accountCurrent = new AccountCurrent(kevinRichard, 200, 121, 333);

        System.out.println("Holder account: " + accountCurrent.getHolder().getName());
        System.out.println("Address holder: " + accountCurrent.getHolder().getAddress().getPublicPlace());
        System.out.println("Balance in Account: " + accountCurrent.getBalance());


    }
}