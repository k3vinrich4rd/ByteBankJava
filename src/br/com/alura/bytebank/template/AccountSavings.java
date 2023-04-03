package br.com.alura.bytebank.template;


/* Subclasse (Classe filha)
AccountCurrent é uma classe filha de Account
Onde estende Account através da aplicação do
conceito de herança
 */
public class AccountSavings extends Account {

    public AccountSavings() {
        super(); //construtor baseado na classe mãe (Account)
    }

    public AccountSavings(Client client, double balance, int agency, int number) {
        super(client, balance, agency, number); //construtor baseado na classe mãe (Account)
    }

    @Override //polimorfismo do método abstrato de Account
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
    }
}