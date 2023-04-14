import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Cliente> clientes = new ArrayList<Cliente>();
    static List<Pedido> pedidos = new ArrayList<Pedido>();
    static List<Pizza> pizzas = new ArrayList<Pizza>();
    static List<Bebida> bebidas = new ArrayList<Bebida>();
    static List<Tamanho> tamanhos = new ArrayList<Tamanho>();
    static List<Sabor> sabores = new ArrayList<Sabor>();
    static List<ModalidadeEntrega> modalidadesEntrega = new ArrayList<ModalidadeEntrega>();
    static List<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();

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
        sabor = new Sabor("Marguerita", 50.00);
        sabores.add(sabor);
        sabor = new Sabor("Quatro Queijos", 60.00);
        sabores.add(sabor);
        sabor = new Sabor("Napolitana", 70.00);
        sabores.add(sabor);
        sabor = new Sabor("Brigadeiro", 80.00);
        sabores.add(sabor);
        sabor = new Sabor("Chocolate", 90.00);
        sabores.add(sabor);
        sabor = new Sabor("Banana", 100.00);
        sabores.add(sabor);
        sabor = new Sabor("Morango", 110.00);
        sabores.add(sabor);

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

        ModalidadeEntrega modalidadeEntrega = new ModalidadeEntrega("Retirada no local", 0.00);
        modalidadesEntrega.add(modalidadeEntrega);
        modalidadeEntrega = new ModalidadeEntrega("Entrega", 10.00);
        modalidadesEntrega.add(modalidadeEntrega);
        modalidadeEntrega = new ModalidadeEntrega("A la carte", 0.00);
        modalidadesEntrega.add(modalidadeEntrega);

        FormaPagamento FormaPagamento = new FormaPagamento("Cartão de crédito");
        formasPagamento.add(FormaPagamento);
        FormaPagamento = new FormaPagamento("Cartão de debito");
        formasPagamento.add(FormaPagamento);
        FormaPagamento = new FormaPagamento("PIX");
        formasPagamento.add(FormaPagamento);
    }

    static void cadastrarCliente(Scanner sc) {
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        System.out.println("Digite a rua do cliente");
        String rua = sc.nextLine();
        System.out.println("Digite o numero da casa do cliente");
        int numero = 0;
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("numero invalido");
        }
        System.out.println("Digite o complemento do cliente");
        String complemento = sc.nextLine();
        System.out.println("Digite o cep do cliente");
        String cep = sc.nextLine();
        Cliente cliente = new Cliente(nome, rua, numero, complemento, cep);
        clientes.add(cliente);
    }

    static void fazerPedido(Scanner sc) {
        Pedido pedido = new Pedido();
        Boolean continuar = true;

        // add pizza
        while (continuar) {
            List<Pizza> pizzas = new ArrayList<Pizza>();
            Pizza pizza = new Pizza();

            System.out.println("Digite o tamanho da Pizza");
            for (Tamanho tamanho : tamanhos) {
                System.out.println(tamanhos.indexOf(tamanho) + " - " + tamanho.toString());
            }
            String res = sc.nextLine();
            Tamanho tamanho = tamanhos.get(Integer.parseInt(res));
            int count = 0;

            pizza.setTamanho(tamanho);

            switch (tamanho.getNome()) {
                case "Pequena":
                    count = tamanhos.get(0).getQtdSabor();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Digite o sabor " + (i + 1) + " da pizza");
                        for (Sabor sabor : sabores) {
                            System.out.println(sabores.indexOf(sabor) + " - " + sabor.toString());
                        }
                        int sabor = Integer.parseInt(sc.nextLine());
                        pizza.setSabores(sabores.get(sabor));
                    }
                    break;
                case "Media":
                    count = tamanhos.get(1).getQtdSabor();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Digite o sabor " + (i + 1) + " da pizza");
                        for (Sabor sabor : sabores) {
                            System.out.println(sabores.indexOf(sabor) + " - " + sabor.toString());
                        }
                        int sabor = Integer.parseInt(sc.nextLine());
                        pizza.setSabores(sabores.get(sabor));
                    }
                    break;
                case "Grande":
                    count = tamanhos.get(2).getQtdSabor();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Digite o sabor " + (i + 1) + " da pizza");
                        for (Sabor sabor : sabores) {
                            System.out.println(sabores.indexOf(sabor) + " - " + sabor.toString());
                        }
                        int sabor = Integer.parseInt(sc.nextLine());
                        pizza.setSabores(sabores.get(sabor));
                    }
                    break;
            }

            pizzas.add(pizza);
            pedido.setPizzas(pizzas);
            System.out.println("Gostaria de pedir mais uma pizza? (S/N)");
            res = sc.nextLine();
            if (res.equals("N") || res.equals("n")) {
                continuar = false;
            }
        }

        // add bebida
        System.out.println("Gostaria de adicionar bebida? (S/N)");
        String response = sc.nextLine();

        if (response.equals("S") || response.equals("s")) {
            Boolean more = true;
            List<Bebida> bebidasPedido = new ArrayList<Bebida>();

            while (more) {
                System.out.println("Digite o numero da bebida");
                for (Bebida bebida : bebidas) {
                    System.out.println(bebidas.indexOf(bebida) + " - " + bebida.toString());
                }
                int bebida = Integer.parseInt(sc.nextLine());
                bebidasPedido.add(bebidas.get(bebida));

                System.out.println("Gostaria de adicionar mais bebidas? (S/N)");
                response = sc.nextLine();
                if (response.equals("N") || response.equals("n")) {
                    more = false;
                }
            }
            pedido.setBebidas(bebidasPedido);
        }

        System.out.println("Digite o numero da modalidade de entrega");
        for (ModalidadeEntrega modalidade : modalidadesEntrega) {
            System.out.println(modalidadesEntrega.indexOf(modalidade) + " - " + modalidade.toString());
        }
        int modalidade = Integer.parseInt(sc.nextLine());
        pedido.setModalidadeEntrega(modalidadesEntrega.get(modalidade));

        if (modalidade != 2) {
            System.out.println("Digite o numero do cliente");
            for (Cliente cliente : clientes) {
                System.out.println(clientes.indexOf(cliente) + " - " + cliente.toString());
            }
            int cliente = Integer.parseInt(sc.nextLine());
            pedido.setCliente(clientes.get(cliente));
        }

        System.out.println("Digite o numero da forma de pagamento");
        for (FormaPagamento forma : formasPagamento) {
            System.out.println(formasPagamento.indexOf(forma) + " - " + forma.toString());
        }
        int forma = Integer.parseInt(sc.nextLine());
        pedido.setFormaPagamento(formasPagamento.get(forma));

        pedidos.add(pedido);
    }

    public static void main(String[] args) throws Exception {
        Boolean sair = false;
        populateAll();
        while (!sair) {

            System.out.println("Bem vindo a Pizzaria do Flavin");

            System.out.println("Digite 1 para fazer um pedido");
            System.out.println("Digite 2 para cadastrar um cliente");
            System.out.println("Digite 3 para listar os pedidos");

            Scanner sc = new Scanner(System.in);
            int response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    fazerPedido(sc);
                    break;
                case 2:
                    cadastrarCliente(sc);
                    break;
                case 3:
                    for (Pedido pedido : pedidos) {
                        System.out.println(pedido.toString());
                    }
                    break;
            }

            if (response != 1) {
                continue;
            } else {
                System.out.println("Resumo do pedido");
                System.out.println(pedidos.get(pedidos.size() - 1).toString());
                System.out.println("Obrigado por utilizar o sistema da Pizzaria");
                System.out.println("Gostaria de fazer outro pedido? (S/N)");
                String res = sc.nextLine();
                if (res.equals("N") || res.equals("n")) {
                    sair = true;
                }
            }
        }
    }
}
