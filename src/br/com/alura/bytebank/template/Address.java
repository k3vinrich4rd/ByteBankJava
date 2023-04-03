package br.com.alura.bytebank.template;

/* Classe Address, utilizada como composição na classe client
sendo assim para um client existir, depende de endereço e vice versa
 */
public class Address {
    //Atributos da classe
    private String publicPlace;
    private int number;
    private String neighborhood;
    private String city;
    private String state;
    private String cep;
    private String complement;

    public Address() {

    }

    //Construtor da classe

    public Address(String publicPlace,
                   int number,
                   String neighborhood,
                   String city,
                   String state,
                   String cep,
                   String complement) {
        this.publicPlace = publicPlace;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.complement = complement;
    }

    //Métodos assessores da classe

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
