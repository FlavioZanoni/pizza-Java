import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Tamanho tamanho;
    private List<Sabor> sabores;

    public Pizza() {
        this.tamanho = new Tamanho();
        this.sabores = new ArrayList<Sabor>();
    }

    public Pizza(Sabor sabor, Tamanho tamanho) {
        this.tamanho = tamanho;
        this.sabores = new ArrayList<Sabor>();
    }

    public void printSabores() {
        for (Sabor sabor : sabores) {
            System.out.println(sabor.getNome());
        }
    }

    public List<Sabor> getSabores() {
        return this.sabores;
    }

    public void setSabores(Sabor sabor) {
        if (this.sabores.size() < this.tamanho.getQtdSabor()) {
            this.sabores.add(sabor);
        } else {
            System.out.println("Quantidade de sabores excedida");
        }
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        double preco = 0;
        for (Sabor sabor : sabores) {
            preco += sabor.getPreco();
        }

        return preco / (double) this.tamanho.getQtdSabor();
    }

}
