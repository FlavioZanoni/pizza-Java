public class Sabor {

    private String nome;
    private double preco;

    public Sabor() {
    }

    public Sabor(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return this.nome + ", R$ " + this.preco;
    }
}
