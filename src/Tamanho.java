public class Tamanho {

    private String nome;
    private int qtdSabor;

    public Tamanho() {
    }

    public Tamanho(String nome, int qtdSabor) {
        this.nome = nome;
        this.qtdSabor = qtdSabor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdSabor() {
        return qtdSabor;
    }

    public void setQtdSabor(int qtdSabor) {
        this.qtdSabor = qtdSabor;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.qtdSabor + " sabores";
    }
}
