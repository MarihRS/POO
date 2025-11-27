public class Concessionaria {
    private Veiculo[] veiculos;
    private int qntdVeiculos;

    public Concessionaria(){
        this.veiculos = new Veiculo[10];
        this.qntdVeiculos = 0;
    }

//MÉTODOS
//1 - para adicionar veículo a concessionária;
    public void adicionarVeiculo(Veiculo v){ //add qualquer veículo
        if(qntdVeiculos < this.veiculos.length)
        veiculos[qntdVeiculos++] = v; //++ adiciona a prox. posição livre e 1 ao valor atual
    }

//2- para listar veículos da concessionária;
    public void listarVeiculos(){ 
        System.out.println("\n == Veículos Cadastrados ==");
        for(int i = 0; i < qntdVeiculos; i++){
            System.out.println(veiculos[i].toString()); //retornando diferentes ts de diferentes subclasses
        }
    }

//3- para calcular o valor total do preço de venda dos veículos da concessionária;
    public double calcularValorTotalEstoque() {
        double totalEstoque = 0;
        for (int i = 0; i < qntdVeiculos; i++){ //soma chamando os calcular[...] de cada veículo
            totalEstoque += veiculos[i].calcularPrecoVenda(); //resgatamos os preços calculados de formas diferentes das sub.
        }
        return totalEstoque;
    }

//4- para buscar um veículo pela marca na concessionária;
    public void buscarPorMarca(String marca) {
        System.out.println("\n== Resultado da Busca:\""+ marca + "\" ==");
        boolean encontrou = false;

        for (int i = 0; i < qntdVeiculos; i++){ 
            if (veiculos[i].getMarca().equalsIgnoreCase(marca)) { //equals- compara duas strings ignorando letras maiúsculas e minúsculas
                System.out.println(veiculos[i].toString()); //retornando diferentes ts de diferentes subclasses
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veículo encontrado.");
        }
    }

//5- para retornar o veículo mais caro da concessionária;
     public Veiculo veiculoMaisCaro() {
        if (qntdVeiculos == 0) {
            return null;
        }
        Veiculo maisCaro = veiculos[0];
        for (int i = 1; i < qntdVeiculos; i++) { //retorna + caro comparando todos
            if (veiculos[i].calcularPrecoVenda() > maisCaro.calcularPrecoVenda()) { //retornando diferentes formas calcularPrecoVenda das diferentes sub
                maisCaro = veiculos[i];
            }
        }
        return maisCaro;
    }

//6- para calcular o valor total do seguro dos veículos da concessionária.
    public double calcularSeguroTotal() {
        double totalSeguro = 0;
        for(int i = 0; i < qntdVeiculos; i++) { //soma de todos os vetores
            totalSeguro += veiculos[i].calcularSeguro(); //retornando diferentes formas calcularSeguro das dif. sub
        }
        return totalSeguro;
    }

    public int getQntdVeiculos(){
        return qntdVeiculos;
    }
}


