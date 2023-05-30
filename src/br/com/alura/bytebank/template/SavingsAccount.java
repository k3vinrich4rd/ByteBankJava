package br.com.alura.bytebank.template;

/**
 * Subclasse (Classe filha)
 * AccountCurrent é uma classe filha de Account
 * Onde estende Account através da aplicação do
 * conceito de herança
 *
 * @author Kevin Richard
 */
public class SavingsAccount extends Account {

    /**
     * Construtor da subclasse
     * utilizando o construtor da super classe
     */
    public SavingsAccount() {
        super();
    }

    /**
     * Construtor da subclasse
     * utilizando o construtor da super classe
     */
    public SavingsAccount(Client client, double balance, int agency, int number) {
        super(client, balance, agency, number); //construtor baseado na classe mãe (Account)
    }

    /**
     * Construtor da subclasse
     * utilizando o construtor da super classe
     */
    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    /**
     * Construtor da subclasse
     * utilizando o construtor da super classe
     */
    public SavingsAccount(Client holder, double balance) {
        super(holder, balance);
    }

    /**
     * Construtor da subclasse
     * utilizando o construtor da super classe
     */
    public SavingsAccount(Client holder) {
        super(holder);
    }

    /**
     * polimorfismo do método abstrato de Account
     *
     * @param value
     * @return
     */
    @Override
    public double depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit action performed successfully");
        return value;
    }

    /**
     * Sobrescrita do toString
     * @return String
     */
    @Override
    public String toString() {
        return "Type account: Savings Account " + "\n" +
                super.toString();
    }

    /**
     * Sobrescrita do toString
     * @param agency
     * @param number
     * @return String
     */
    @Override
    public String toString(int agency, int number) {
        return "Type account: Savings Account " + "\n"
                + super.toString(agency, number);
    }

    /**
     * Sobrescrita do toString
     * @param holder
     * @param balance
     * @return String
     */
    @Override
    public String toString(Client holder, double balance) {
        return "Type account: Savings Account " + "\n" +
                super.toString(holder, balance);
    }


    /**
     *
     * @param account the object to be compared.
     * @return Double
     */
    @Override
    public int compareTo(Account account) {
        return Double.compare(this.balance, account.balance);
    }

    /**
     * Sobrescrita do toString
     * @param holder
     * @return String
     */

    @Override
    public String toString(Client holder) {
        return "Type account: Savings Account " + "\n"
                + super.toString(holder);
    }


}