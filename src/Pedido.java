import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private ModalidadeEntrega modalidadeEntrega;
    private FormaPamento formaPagamento;
    private double valorTotal;
    private Cliente cliente;
    private List<Pizza> pizzas;
    private List<Bebida> bebidas;

    public Pedido() {
        this.valorTotal = 0;
        this.bebidas = new ArrayList<Bebida>();
        this.pizzas = new ArrayList<Pizza>();
    }

    public Pedido(ModalidadeEntrega modalidadeEntrega, FormaPamento formaPagamento, double valorTotal, Cliente cliente,
            List<Pizza> pizzas, List<Bebida> bebidas) {
        this.modalidadeEntrega = modalidadeEntrega;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.pizzas = pizzas;
        this.bebidas = bebidas;
    }

    public ModalidadeEntrega getModalidadesEntrega() {
        return modalidadeEntrega;
    }

    public void setModalidadeEntrega(ModalidadeEntrega modalidadeEntrega) {
        this.modalidadeEntrega = modalidadeEntrega;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "Pedido [bebidas=" + bebidas + ", clientes=" + cliente + ", formaPagamento=" + formaPagamento
                + ", modalidadesEntrega=" + modalidadeEntrega + ", pizzas=" + pizzas + ", valorTotal=" + valorTotal
                + "]";
    }

}
