public class Concessionaria {
    private Veiculo[] veiculos;
    private int qntdVeiculos;

    public Concessionaria(){
        this.veiculos = new Veiculo[10];
        this.qntdVeiculos = 0;
    }

//MÉTODOS
//1 - para adicionar veículo a concessionária;
    public void adicionarVeiculo(Veiculo v){
        if(qntdVeiculos == this.veiculos.length)
        veiculos[qntdVeiculos++] = v;
    }

//2- para listar veículos da concessionária;
    public void listarVeiculos(){ 
        System.out.println("\n == Veículos Cadastrados ==");
        for(int i = 0; i < qntdVeiculos; i++){
            System.out.println(veiculos[i].toString());
        }
    }

//3- para calcular o valor total do preço de venda dos veículos da concessionária;
    public double calcularValorTotalEstoque() {
        double totalEstoque = 0;
        for (int i = 0; i < qntdVeiculos; i++){
            totalEstoque += veiculos[i].calcularPrecoVenda();
        }
        return totalEstoque;
    }

//4- para buscar um veículo pela marca na concessionária;
    public void buscarPorMarca(String marca) {
        System.out.println("\n== Resultado da Busca ==");
        boolean encontrou = false;

        for (int i = 0; i < qntdVeiculos; i++){ 
            if (veiculos[i].getMarca().equals(marca)) { //equals- 
                System.out.println(veiculos[i].toString());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veículo encontrado.");
        }
    }

//5- para retornar o veículo mais caro da concessionária;
    public Veiculo veiculoMaisCaro(){
        Veiculo maisCaro = veiculos[0]; //começa com o primeiro veículo
        for (int i = 1; i < qntdVeiculos; i++) { //i recebe 1 pq o índice 0 já tá sendo usado como valor inicial
            if(veiculos[i].calcularPrecoVenda() > maisCaro.calcularPrecoVenda()) {
                maisCaro = veiculos[i]; //atualiza para esse ser o mais caro
            }
        }
        return maisCaro;
    }

//6- para calcular o valor total do seguro dos veículos da concessionária.
    public double calcularSeguroTotal() {
        double totalSeguro = 0;
        for(int i = 0; i < qntdVeiculos; i++) {
            totalSeguro += veiculos[i].calcularSeguro();
        }
        return totalSeguro;
    }

    public int getQntdVeiculos(){
        return qntdVeiculos;
    }

}
