package Model;

import java.util.ArrayList;
import java.util.List;

public class Pomar {
    
     private List<Cliente> cliente = new ArrayList<>();
     private List<Produto> produto = new ArrayList<>();

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
     
     
}
