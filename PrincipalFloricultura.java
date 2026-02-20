import java.util.Scanner;

public class PrincipalFloricultura{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CadastrarCliente cadastroCliente = new CadastrarCliente(50);
        CadastroProduto cadastroProduto = new CadastroProduto(50);
        CadastroFlor cadastroFlor = new CadastroFlor(50);
        CadastroArranjo cadastroArranjo = new CadastroArranjo(50);
        CadastroPedido cadastroPedido = new CadastroPedido(50);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA FLORICULTURA =====");
            System.out.println("1 - Cliente");
            System.out.println("2 - Produto");
            System.out.println("3 - Flor");
            System.out.println("4 - Arranjo");
            System.out.println("5 - Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                // ================= CLIENTE =================
                case 1:
                    int opCliente;
                    do {
                        System.out.println("\n--- MENU CLIENTE ---");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Listar");
                        System.out.println("0 - Voltar");
                        opCliente = sc.nextInt();

                        if (opCliente == 1) {
                            sc.nextLine();
                            System.out.print("ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Telefone: ");
                            int telefone = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Endereço: ");
                            String endereco = sc.nextLine();

                            cadastroCliente.adicionar(new Cliente(id, nome, telefone, endereco));
                            System.out.println("Cliente cadastrado!");
                        }

                        if (opCliente == 2) {
                            cadastroCliente.listarClientes();
                        }

                    } while (opCliente != 0);
                    break;

                // ================= PRODUTO =================
                case 2:
                    int opProduto;
                    do {
                        System.out.println("\n--- MENU PRODUTO ---");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Listar");
                        System.out.println("3 - Buscar por ID");
                        System.out.println("4 - Excluir");
                        System.out.println("0 - Voltar");
                        opProduto = sc.nextInt();

                        if (opProduto == 1) {
                            System.out.print("ID Produto: ");
                            int id = sc.nextInt();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            cadastroProduto.adicionarProduto(new Produto(id, preco));
                            System.out.println("Produto cadastrado!");
                        }

                        if (opProduto == 2) {
                            cadastroProduto.listarProdutos();
                        }

                        if (opProduto == 3) {
                            System.out.print("Digite o ID: ");
                            int id = sc.nextInt();
                            Produto p = cadastroProduto.buscarPorID(id);

                            if (p != null)
                                p.exibirInfo();
                            else
                                System.out.println("Produto não encontrado!");
                        }

                        if (opProduto == 4) {
                            System.out.print("Digite o ID para excluir: ");
                            int id = sc.nextInt();
                            cadastroProduto.excluirProduto(id);
                            System.out.println("Produto excluído (se existia).");
                        }

                    } while (opProduto != 0);
                    break;

                // ================= FLOR =================
                case 3:
                    int opFlor;
                    do {
                        System.out.println("\n--- MENU FLOR ---");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Listar");
                        System.out.println("3 - Buscar por ID");
                        System.out.println("4 - Excluir");
                        System.out.println("0 - Voltar");
                        opFlor = sc.nextInt();

                        if (opFlor == 1) {
                            sc.nextLine();
                            System.out.print("ID Flor: ");
                            int idFlor = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Tipo: ");
                            String tipo = sc.nextLine();

                            System.out.print("Cor: ");
                            String cor = sc.nextLine();

                            System.out.print("Tamanho: ");
                            String tamanho = sc.nextLine();

                            System.out.print("Estoque: ");
                            int estoque = sc.nextInt();

                            System.out.print("ID Produto: ");
                            int idProd = sc.nextInt();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            cadastroFlor.adicionarFlor(
                                new Flor(idFlor, tipo, cor, tamanho, estoque, idProd, preco)
                            );
                            System.out.println("Flor cadastrada!");
                        }

                        if (opFlor == 2) {
                            cadastroFlor.listarFlor();
                        }

                        if (opFlor == 3) {
                            System.out.print("Digite o ID: ");
                            int id = sc.nextInt();
                            Flor f = cadastroFlor.buscarPorID(id);

                            if (f != null)
                                f.exibirInfo();
                            else
                                System.out.println("Flor não encontrada!");
                        }

                        if (opFlor == 4) {
                            System.out.print("Digite o ID para excluir: ");
                            int id = sc.nextInt();
                            cadastroFlor.excluirFlor(id);
                            System.out.println("Flor excluída (se existia).");
                        }

                    } while (opFlor != 0);
                    break;

                // ================= ARRANJO =================
                case 4:
                    int opArr;
                    do {
                        System.out.println("\n--- MENU ARRANJO ---");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Listar");
                        System.out.println("3 - Buscar por ID");
                        System.out.println("4 - Excluir");
                        System.out.println("0 - Voltar");
                        opArr = sc.nextInt();

                        if (opArr == 1) {
                            sc.nextLine();
                            System.out.print("ID Arranjo: ");
                            int idArr = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Tipo: ");
                            String tipoArr = sc.nextLine();

                            System.out.print("ID Produto: ");
                            int idProd = sc.nextInt();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            Produto prod = new Produto(idProd, preco);

                            cadastroArranjo.adicionarArranjo(
                                new Arranjo(idArr, tipoArr, prod, idProd, preco)
                            );
                            System.out.println("Arranjo cadastrado!");
                        }

                        if (opArr == 2) {
                            cadastroArranjo.listarArranjo();
                        }

                        if (opArr == 3) {
                            System.out.print("Digite o ID: ");
                            int id = sc.nextInt();
                            Arranjo a = cadastroArranjo.buscarPorID(id);

                            if (a != null)
                                a.exibirInfo();
                            else
                                System.out.println("Arranjo não encontrado!");
                        }

                        if (opArr == 4) {
                            System.out.print("Digite o ID para excluir: ");
                            int id = sc.nextInt();
                            cadastroArranjo.excluirArranjo(id);
                            System.out.println("Arranjo excluído (se existia).");
                        }

                    } while (opArr != 0);
                    break;

                // ================= PEDIDO =================
                case 5:
                    int opPedido;
                    do {
                        System.out.println("\n--- MENU PEDIDO ---");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Listar");
                        System.out.println("3 - Buscar por ID");
                        System.out.println("4 - Excluir");
                        System.out.println("0 - Voltar");
                        opPedido = sc.nextInt();

                        if (opPedido == 1) {
                            System.out.print("ID Pedido: ");
                            int id = sc.nextInt();

                            System.out.print("Valor Total: ");
                            double valor = sc.nextDouble();

                            cadastroPedido.adicionar(new Pedido(id, valor, null));
                            System.out.println("Pedido cadastrado!");
                        }

                        if (opPedido == 2) {
                            cadastroPedido.listarPedidos();
                        }

                        if (opPedido == 3) {
                            System.out.print("Digite o ID: ");
                            int id = sc.nextInt();
                            Pedido p = cadastroPedido.buscarPorID(id);

                            if (p != null)
                                p.exibirInfo();
                            else
                                System.out.println("Pedido não encontrado!");
                        }

                        if (opPedido == 4) {
                            System.out.print("Digite o ID para excluir: ");
                            int id = sc.nextInt();
                            cadastroPedido.excluirPedido(id);
                            System.out.println("Pedido excluído (se existia).");
                        }

                    } while (opPedido != 0);
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}