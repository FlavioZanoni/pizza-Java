import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private ModalidadeEntrega modalidadesEntrega;
    private FormaPamento formaPagamento;
    private double valorTotal;
    private List <Cliente> clientes;
    private List <Pizza> pizzas;
    private List <Bebida> bebidas;
    
    public Pedido() {
        this.valorTotal = 0;
        this.bebidas = new ArrayList<Bebida>();
        this.pizzas = new ArrayList<Pizza>();
        this.clientes = new ArrayList<Cliente>();
    }

    public Pedido(ModalidadeEntrega modalidadeEntrega, FormaPamento formaPagamento, double valorTotal, List<Cliente> clientes, List<Pizza> pizzas, List<Bebida> bebidas) {
        this.modalidadesEntrega = modalidadeEntrega;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.clientes = clientes;
        this.pizzas = pizzas;
        this.bebidas = bebidas;
    }

    public ModalidadeEntrega getModalidadesEntrega() {
        return modalidadesEntrega;
    }

    public void setModalidadesEntrega(ModalidadeEntrega modalidadeEntrega) {
        this.modalidadesEntrega = modalidadeEntrega;
    }

    public FormaPamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
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

    public String toString() {
        return "Pedido [bebidas=" + bebidas + ", clientes=" + clientes + ", formaPagamento=" + formaPagamento
                + ", modalidadesEntrega=" + modalidadesEntrega + ", pizzas=" + pizzas + ", valorTotal=" + valorTotal + "]";
    }

}
