public class Cliente {
    private String nome;

    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String rua, int numero, String complemento, String cep) {
        this.nome = nome;
        Endereco endereco = new Endereco(rua, numero, complemento, cep);
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEndereco(String rua, int numero, String complemento, String cep) {
        Endereco endereco = new Endereco(rua, numero, complemento, cep);

        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n Endereço: " + this.endereco.toString();
    }
}
