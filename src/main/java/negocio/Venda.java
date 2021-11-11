package negocio;

import dto.ClienteDto;
import dto.ProdutoDto;

public class Venda {

    private ClienteDto cliente;
    private ProdutoDto produto;

    public Venda(ClienteDto cliente, ProdutoDto produto){
        this.cliente=cliente;
        this.produto=produto;

    }
    //fazer gets e sets

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }
    public void setProduto(ProdutoDto produto) {
        this.produto = produto;
    }

    public ProdutoDto getProduto() {
        return this.produto;
    }

    public ClienteDto getCliente() {
        return this.cliente;
    }
}
