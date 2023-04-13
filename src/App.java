import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    static List <Cliente> clientes = new ArrayList<Cliente>();
    static List <Pedido> pedidos = new ArrayList<Pedido>();
    static List <Pizza> pizzas = new ArrayList<Pizza>();
    static List <Bebida> bebidas = new ArrayList<Bebida>();
    static List <Tamanho> tamanhos = new ArrayList<Tamanho>();
    static List <Sabor> sabores = new ArrayList<Sabor>();

    static void populateAll() {
        Tamanho tamanho = new Tamanho("Pequena", 3);
        tamanhos.add(tamanho);
        tamanho = new Tamanho("Media", 5);
        tamanhos.add(tamanho);
        tamanho = new Tamanho("Grande", 7);
        tamanhos.add(tamanho);

        Sabor sabor = new Sabor("Calabresa", 20.00);
        sabores.add(sabor);
        sabor = new Sabor("Portuguesa", 30.00);
        sabores.add(sabor);
        sabor = new Sabor("Frango com Catupiry", 40.00);
        sabores.add(sabor);
        // TODO: add more

        Bebida bebida = new Bebida("Coca-cola", 5.00);
        bebidas.add(bebida);
        bebida = new Bebida("Guaraná", 5.00);
        bebidas.add(bebida);
        bebida = new Bebida("Fanta", 5.00);
        bebidas.add(bebida);
        bebida = new Bebida("Água", 5.00);
        bebidas.add(bebida);
        bebida = new Bebida("Suco de uva", 5.00);
        bebidas.add(bebida);
    }

    static void cadastrarCliente(Scanner sc) {
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        System.out.println("Digite a rua do cliente");
        String rua = sc.nextLine();
        System.out.println("Digite o numero da casa do cliente");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o complemento do cliente");
        String complemento = sc.nextLine();
        System.out.println("Digite o cep do cliente");
        String cep = sc.nextLine();
        Cliente cliente = new Cliente(nome, rua, numero, complemento, cep);
        clientes.add(cliente);
    }

    static void fazerPedido(Scanner sc) {
        Pizza pizza = new Pizza();

        System.out.println("Digite o tamanho da Pizza");
        for (Tamanho tamanho : tamanhos) {
            System.out.println(tamanhos.indexOf(tamanho) + " - " + tamanho.toString());
        }
        String res = sc.nextLine();
        String tamanho = tamanhos.get(Integer.parseInt(res)).getNome();
        int count = 0;

        switch(tamanho) {
            case "Pequena":
                count = tamanhos.get(0).getQtdSabor();
                for (int i = 0; i < count; i++) {
                    System.out.println("Digite o sabor " + (i + 1) +" da pizza");
                    for (Sabor sabor : sabores) {
                        System.out.println( sabores.indexOf(sabor) + " - " + sabor.toString());
                    }
                    int sabor = Integer.parseInt( sc.nextLine());
                    pizza.setSabores(sabores.get(sabor));
                }
                break;
            case "Media":
                count = tamanhos.get(1).getQtdSabor();
                for (int i = 0; i < count; i++) {
                    System.out.println("Digite o sabor " + (i + 1) +" da pizza");
                    for (Sabor sabor : sabores) {
                        System.out.println( sabores.indexOf(sabor) + " - " + sabor.toString());
                    }
                    int sabor = Integer.parseInt( sc.nextLine());
                    pizza.setSabores(sabores.get(sabor));
                }
                break;
            case "Grande":
                count = tamanhos.get(2).getQtdSabor();
                for (int i = 0; i < count; i++) {
                    System.out.println("Digite o sabor " + (i + 1) +" da pizza");
                    for (Sabor sabor : sabores) {
                        System.out.println( sabores.indexOf(sabor) + " - " + sabor.toString());
                    }
                    int sabor = Integer.parseInt( sc.nextLine());
                    pizza.setSabores(sabores.get(sabor));
                }
                break;
        }


        // System.out.println("Digite o sabor da pizza");
        // String sabor = sc.nextLine();
        // System.out.println("Digite o tamanho da pizza");
        // tamanho = sc.nextLine();
        // System.out.println("Digite o valor da pizza");
        // double valor = Double.parseDouble(sc.nextLine());
        // pizzas.add(pizza);

        // System.out.println("Digite o nome da bebida");
        // String nomeBebida = sc.nextLine();
        // System.out.println("Digite o valor da bebida");
        // double valorBebida = Double.parseDouble(sc.nextLine());
        // Bebida bebida = new Bebida(nomeBebida, valorBebida);
        // bebidas.add(bebida);

        // Pedido pedido = new Pedido(cliente, pizza, bebida);
        // pedidos.add(pedido);
    }

    public static void main(String[] args) throws Exception {
        Boolean sair = true;
        populateAll();
       while (sair) {

        System.out.println("Bem vindo a Pizzaria");
        
        System.out.println("Digite 1 para fazer um pedido");
        System.out.println("Digite 2 para cadastrar um cliente");
        System.out.println("Digite 3 para listar os pedidos");

        Scanner sc = new Scanner(System.in);    
        int response = Integer.parseInt(sc.nextLine());

        switch(response) {
            case 1: 
                fazerPedido(sc);
                break;
            case 2:
                cadastrarCliente(sc);
                break;
            case 3:
                for(Pedido pedido : pedidos) {
                    System.out.println(pedido.toString());
                }
                break;
        }
       } 

    }
}

