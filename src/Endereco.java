public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco() {
    }

    public Endereco(String rua, int numero, String complemento, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString(){
        return "Rua: " + this.rua + "\n Número: " + this.numero + "\n Complemento: " + this.complemento + "\n CEP: " + this.cep;
    }

}
