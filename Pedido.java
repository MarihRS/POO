import java.util.ArrayList;
import java.util.List;

public class Pedido {
   private int idPedido; 
   private double valorTotal;
   private Cliente cliente;
   List<ItemPedido> itens = new ArrayList<ItemPedido>();
   


   public Pedido(int idPedido, double valorTotal,Cliente cliente) {
       this.idPedido = idPedido;
       this.valorTotal = valorTotal;
       this.cliente = cliente;
   }

   
    public int getIdPedido() {
         return idPedido;
    }

    public double getValorTotal() {
         return valorTotal;
    }

    public Cliente getCliente() {
         return cliente;
     }

     public String toString(){
          return "Id do Pedido: " + idPedido +
               "Valor Total: " + valorTotal +
               "Cliente: " + cliente +
               "Itens: " + itens.toString();
     }

     public void exibirInfo(){
        System.out.println(toString());
    }
}