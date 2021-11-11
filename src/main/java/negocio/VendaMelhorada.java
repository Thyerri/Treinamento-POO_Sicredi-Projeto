package negocio;

import dto.ClienteDto;
import dto.ProdutoDto;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class VendaMelhorada {
    private ClienteDto cliente;
    private List<ProdutoDto> listacompras;

    public VendaMelhorada(ClienteDto cliente) {
        this.cliente = cliente;
        this.listacompras = new ArrayList<>();
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public ClienteDto getCliente() {
        return this.cliente;

    }

    public void adicionaProduto(ProdutoDto produto) {
        listacompras.add(produto);

    }

    public void removeProduto(ProdutoDto produto) {
        listacompras.remove(produto);
    }

    public List<ProdutoDto> getListacompras() {
        return this.listacompras;
    }

    public double valorTotal(){
        double totalCompra = 0;

        for (int i = 0; i<getListacompras().size(); i++) {
            totalCompra=totalCompra+(getListacompras().get(i).getValor());

        }
       // System.out.println("O valor total da compra é: R$"+ totalCompra);
        return totalCompra;
    }


}



