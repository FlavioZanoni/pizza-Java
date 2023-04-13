import java.util.ArrayList;
import java.util.List;

public class Pizzaria {
    
    private String nome;
    private String endereco;
    private List <Pizza> pizzas;
    private List <Bebida> bebidas;
    private List <Cliente> clientes;

    public Pizzaria() {
        this.pizzas = new ArrayList<Pizza>();
        this.bebidas = new ArrayList<Bebida>();
        this.clientes = new ArrayList<Cliente>();
    }

    public Pizzaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pizzas = new ArrayList<Pizza>();
        this.bebidas = new ArrayList<Bebida>();
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
