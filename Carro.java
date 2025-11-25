public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    private double potenciaMotor;

    public Carro(String marca, String modelo, int ano, double precoBase, int numeroPortas, String tipoCombustivel, double potenciaMotor){
        super(marca, modelo, ano, precoBase);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMotor = potenciaMotor;
    }

//MÉT. CONCRETOS

    @Override //p/ indicar q estou subscrevendo um mét. da classe pai
    public double calcularPrecoVenda(){
        double precoVenda = getPrecoBase(); //começa com o preço base
        if(potenciaMotor > 2.0) precoVenda += 5000; //+= atribui a uma variavel o valor dela somada ao valor de um operando
        if(numeroPortas > 4) precoVenda += 3000;
        return precoVenda; //retorna preço final
    }

    @Override
    public double calcularSeguro(){
        double seguro = getPrecoBase() * 0.03;
        if(potenciaMotor > 2.0) seguro *= 1.5;
        return seguro;
    }

//MÉT. GET
    public int getNumeroPortas(){
        return numeroPortas;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    public double getPotenciaMotor(){
        return potenciaMotor;
    }

//MÉT. toString() herdado da mãe
    @Override
    public String toString(){
        return "Carro - %s" +
                "Portas: %d" + numeroPortas +
                "Combustível: %s" + tipoCombustivel +
                "Potência: %.1f" + potenciaMotor +
                "Preço de Venda: %.2f" + calcularPrecoVenda() +
                "Seguro: R$ %.2f" + calcularSeguro() +
                super.toString();
    }
}