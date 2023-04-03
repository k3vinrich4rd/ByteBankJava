package br.com.alura.bytebank.template;

/*‘Interface’ criada para efetuar um contrato com as classes que a implementar
onde é definido que toda a classe que implementar essa ‘interface’, tem que
sobrescrever seus comportamentos abstratos
 */
public interface Authentication {

    //Métodos abstratos
    void setLogin(String login);
    void setPassword(int password);
    boolean authenticatedLoginAndPassword(String login, int password);

}