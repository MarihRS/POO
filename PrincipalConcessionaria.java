public class PrincipalConcessionaria {
    public static void main(String[] args) {
        
//Crie um objeto
        Concessionaria c = new Concessionaria();
    
//Adicione alguns Carros, Motos e Caminhões
    Carro carro1 = new Carro("Volkswagen", "Gol", 2010, 23000.0, 4, "Flex", 76.0);
    Carro carro2 = new Carro("Honda", "Civil EXL", 2021, 155000.0, 4, "Flex", 173.0);
    c.adicionarVeiculo(carro1);
    c.adicionarVeiculo(carro2);

    Moto moto1 = new Moto("Honda", "CG 160", 2023, 15000.0, 160, "Elétrica", true);
    Moto moto2 = new Moto("Yamaha", "MT-09", 2024, 50000.0, 847, "Elétrica", false);
    c.adicionarVeiculo(moto1);
    c.adicionarVeiculo(moto2);

    Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", 2023, 350000.0, 25.0, 6, "Baú");
    Caminhao caminhao2 = new Caminhao("Mercedes", "Actros", 2024, 400000.0, 30.0, 7, "Sider");
    c.adicionarVeiculo(caminhao1);
    c.adicionarVeiculo(caminhao2);

    System.out.println("\nTotal de veículos cadastrados: " + c.getQntdVeiculos());

//Liste os veículos cadastrados.
    c.listarVeiculos();

//Mostre o valor total do estoque.
    double totalEstoque = c.calcularValorTotalEstoque();
    System.out.printf("\nValor total do estoque: R$ %.2f\n", totalEstoque);

//Busque e exiba um veículo pela marca.
    c.buscarPorMarca("Mercedes");

//Exibir o veículo mais caro.
         Veiculo maisCaro = c.veiculoMaisCaro();
        if (maisCaro != null) {
            System.out.println("\nVeículo mais caro:");
            System.out.println(maisCaro.toString());
        } else {
            System.out.println("\nNenhum veículo cadastrado.");
        }

//Exibir o total anual de seguro.
    double totalSeguro = c.calcularSeguroTotal();
        System.out.printf("\nTotal anual do seguro (todos os veículos): R$ %.2f\n", totalSeguro);

    }
}

