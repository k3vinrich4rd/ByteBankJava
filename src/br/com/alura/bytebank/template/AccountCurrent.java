package br.com.alura.bytebank.template;


/* Subclasse (Classe filha)
AccountCurrent é uma classe filha de Account
Onde estende Account através da aplicação do
conceito de herança
 */
public class AccountCurrent extends Account {

    //Construtor da subclasse
    public AccountCurrent() {
        super(); //construtor baseado na classe mãe (Account)
    }

    public AccountCurrent(Client holder, double balance, int agency, int number) {
        super(holder, balance, agency, number); //construtor baseado na classe mãe (Account)

    }
    
    @Override //polimorfismo do método abstrato de Account
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
    }

}