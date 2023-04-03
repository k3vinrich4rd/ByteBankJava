package br.com.alura.bytebank.template;
/* Classe abstrata de Account, onde serve como progenitora para as classes filhas poderem
reutilizar e sobrescrever comportamentos que se tem em comum, através da utilização da herança
isso é possível por conta do paradigma poo
 */

public abstract class Account {
    private Client holder;
    protected double balance;
    private int agency;
    private int number;

    public Account() {

    }

    //Construtor
    public Account(Client holder, double balance, int agency, int number) {
        this.holder = holder;
        this.balance = balance;
        this.agency = 1;
        this.number = 1;
    }

    //Métodos assessores da classe:
    public Client getHolder() {
        return this.holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    /*método accessor com lógica, onde impede o usuário de setar o número agencia
   com um número menor que zero ou igual a zero*/
    public void setAgency(int agency) {
        if (this.agency <= 0) {
            System.out.println("The agency number cannot be less than or equal to zero");
            return;
        }
        this.agency = agency;
    }

    public int getNumber() {
        return this.number;
    }

    /*método accessor com lógica, onde impede o usuário de setar o número da conta
    com um número menor que zero ou igual a zero*/
    public void setNumber(int number) {
        if (this.number <= 0) {
            System.out.println("Account number cannot be less than or equal to zero");
            return;
        }
        this.number = number;
    }

    /* Método abstrato que retorna vazio (void)
    para as subclasses já implementarem (Classes filhas)
    esse método possibilita o usuário de fazer um depósito em sua conta
    como esse método é abstrato por default ele é publico
     */
    abstract void depositInAccount(double value);

    /* método publico que retorna vazio (void)
    onde sua finalidade é possibilitar o usuário de uma conta sacar uma quantia de dinheiro,
    mas só é possível o usuário fazer isso se a conta do mesmo usuário seguir as condições
    pre estabelecidas pela lógica do método
     */
    public void toWithdraw(double value) {
        if (this.balance <= 0 || this.balance < value) {
            System.out.println("Unable to perform a withdrawal action, insufficient balance");
            return;
        }
        System.out.println("Withdrawal action performed successfully");
    }


    /* método publico que retorna boolean (True or False)
    onde sua finalidade é possibilitar o usuário de uma conta transferir uma quantia de dinheiro,
    para outra conta, mas só é possível o usuário fazer isso, se a conta do mesmo usuário seguir
     as condições pre estabelecidas pela lógica do método
    */
    public boolean transfer(double value, Account account) {
        if (this.balance <= 0 || this.balance < value) {
            System.out.println("Impossible to perform transfer action");
            return false;
        }
        this.toWithdraw(value);
        account.depositInAccount(value);
        System.out.println("Transfer performed successfully");
        return true;
    }

}