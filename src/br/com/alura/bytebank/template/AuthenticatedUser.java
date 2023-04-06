package br.com.alura.bytebank.template;

public class AuthenticatedUser {

    //Atributos da classe
    private String login;
    private int password;


    //Métodos de definição de login e senha
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    //Método de autenticação
    public boolean firstAuthentication(String login, int password) {
        if (!this.login.equalsIgnoreCase(login) || this.password != password) {
            System.out.println("Access denied");
            return false;
        }
        System.out.println("Access granted");

        return true;
    }
}