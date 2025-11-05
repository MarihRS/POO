public class Mercadinho {
    private Cliente[] cliente;
    private int qtde;

    public Mercadinho() {
        this.cliente = new Cliente[qtde];
        this.qtde = 0;
    }

    public void adicionarCliente(Cliente c) {
        if(qtde == this.cliente.length)
        cliente[qtde++] = c;
        
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < qtde; i++) {
            total += cliente[i].calcularPagamento();
        }
        return total;
    }

    public void imprimir(){
        for (int i = 0; i < qtde; i++) {
           System.out.println("Cliente:" + cliente[i].getnome() + "ValorTotal");
        }

    }
}