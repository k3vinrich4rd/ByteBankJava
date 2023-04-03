package br.com.alura.bytebank.template;

/*Classe System Intern. Representando o sistema bancário de bytebank-java
para os clientes autenticados  */
public class SystemIntern {

    //Atributos da classe
    public int password;
    public String login;

    /* Método publico e retorna vazio (Void)
    cujo objetivo é recebe a ‘interface’ (E assim quem a implementou)
    e passar no parâmetro um "Login" e "password"

    E assim aplicando uma lógica condicional, que é
    se o login e a password informados pelo client forem aceitos
    ele terá acesso ao sistema do bytebank-java*/
    public void authentication(Authentication authentication, String login, int password) {
        boolean authentic = authentication.authenticatedLoginAndPassword(this.login = login, this.password = password);
        if (!authentic) {
            System.out.println("Access not released, password or incorrect login");
            return;
        }
        System.out.println("Welcome to bytebank-java");
    }
}