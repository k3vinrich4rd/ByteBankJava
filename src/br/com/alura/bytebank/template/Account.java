package br.com.alura.bytebank.template;
/* Classe abstrata de Account, onde serve como progenitora para as classes filhas poderem
reutilizar e sobrescrever comportamentos que se tem em comum, através da utilização da herança
isso é possível por conta do paradigma poo
 */

import br.com.alura.bytebank.exception.InsufficientBalanceException;

/**
 * Classe abstrata de Account, onde serve como progenitora para as classes filhas poderem
 * reutilizar e sobrescrever comportamentos que se tem em comum, através da utilização da herança
 * isso é possível por conta do paradigma Poo
 *
 * @author Kevin Richard
 */
public abstract class Account implements Comparable<Account> {
    /**
     * Atributo da classe
     */
    private Client holder;
    /**
     * Atributo da classe
     */
    protected double balance;
    /**
     * Atributo da classe
     */
    private int agency;
    /**
     * Atributo da classe
     */
    private int number;

    /**
     * Membro estático da classe (Somente a classe pode acessar)
     */
    private static int total;

    /**
     * Construtor da classe abstrata
     */
    public Account() {
        Account.total++;
    }

    /**
     * Construtor da classe abstrata
     */
    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
        Account.total++;
    }

    /**
     * Construtor da classe abstrata
     */
    public Account(Client holder, double balance, int agency, int number) {
        this.holder = holder;
        this.balance = balance;
        this.agency = 1;
        this.number = 1;
        Account.total++;
    }

    /**
     * Construtor da classe abstrata
     */
    public Account(Client holder, double balance) {
        this.holder = holder;
        this.balance = balance;
        this.agency = 1;
        this.number = 1;
        Account.total++;
    }

    /**
     * Construtor da classe abstrata
     */
    public Account(Client holder) {
        this.holder = holder;
        Account.total++;
    }


    /**
     * Método acessor da classe
     *
     * @return Client
     */
    public Client getHolder() {
        return this.holder;
    }

    /**
     * Método acessor da classe
     *
     * @param holder
     */
    public void setHolder(Client holder) {
        this.holder = holder;
    }

    /**
     * Método acessor da classe
     *
     * @return double
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Método acessor da classe
     *
     * @return int
     */
    public int getAgency() {
        return this.agency;
    }

    /**
     * método accessor com lógica, onde impede o usuário de setar o número agencia
     * com um número menor que zero ou igual a zero
     *
     * @param agency
     */
    public void setAgency(int agency) {
        if (this.agency <= 0) {
            System.out.println("The agency number cannot be less than or equal to zero");
            return;
        }
        this.agency = agency;
    }

    /**
     * Método acessor da classe
     *
     * @return int
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * método accessor com lógica, onde impede o usuário de setar o número da conta
     * com um número menor que zero ou igual a zero
     *
     * @param number
     */
    public void setNumber(int number) {
        if (this.number <= 0) {
            System.out.println("Account number cannot be less than or equal to zero");
            return;
        }
        this.number = number;
    }

    /**
     * Método acessor estático da classe, onde só a classe pode acessar
     *
     * @return resultado da interação do campo estático
     */
    public static int getTotal() {
        return Account.total;
    }

    /**
     * Sobrescrita de toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return
                "Holder: " + holder + "\n" +
                        "Balance in account: " + balance + "\n" +
                        "Agency: " + agency + "\n" +
                        "Number account: " + number;
    }

    /**
     * Sobrecarga toString
     */

    public String toString(int agency, int number) {
        return
                "Agency: " + agency + "\n" +
                        "Number account: " + number;
    }

    /**
     * Sobrecarga toString
     */
    public String toString(Client holder, double balance) {
        return
                "Holder: " + holder + "\n" +
                        "Balance in account: " + balance;
    }

    /**
     * Sobrecarga toString
     */
    public String toString(Client holder) {
        return "Holder: " + holder;
    }

    /**
     * Método abstrato que retorna vazio (void)
     * para as subclasses já implementarem (Classes filhas)
     * esse método possibilita o usuário de fazer um depósito em sua conta
     * como esse método é abstrato por default ele é publico
     *
     * @param value
     * @return
     */
    abstract double depositInAccount(double value);

    /**
     * método publico que retorna vazio (void)
     * onde sua finalidade é possibilitar o usuário de uma conta sacar uma quantia de dinheiro,
     * mas só é possível o usuário fazer isso se a conta do mesmo usuário seguir as condições
     * pre estabelecidas pela lógica do método
     *
     * @param value
     * @throws InsufficientBalanceException
     */
    public double toWithdraw(double value) throws InsufficientBalanceException {
        if (this.balance < value) {
            System.out.println("Balance in account: " + this.balance + " value to withdraw: " + value);
             throw new InsufficientBalanceException();
        }
        else {
            this.balance -= value;
            System.out.println("Withdrawal action performed successfully");
            return value;
        }

    }

    /**
     * método publico que retorna boolean (True or False)
     * onde sua finalidade é possibilitar o usuário de uma conta transferir uma quantia de dinheiro,
     * ara outra conta, mas só é possível o usuário fazer isso, se a conta do mesmo usuário seguir
     * as condições pre estabelecidas pela lógica do método
     *
     * @param value
     * @param account
     * @return
     * @throws InsufficientBalanceException
     */
    public double transfer(double value, Account account) throws InsufficientBalanceException {
        if (this.balance <= 0 || this.balance < value) {
            System.out.println("Impossible to perform transfer action");
            return value;
        }
        this.toWithdraw(value);
        account.depositInAccount(value);
        System.out.println("Transfer performed successfully");
        return value;
    }
}