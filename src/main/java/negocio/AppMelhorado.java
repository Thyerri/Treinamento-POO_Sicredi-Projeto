package negocio;

import dto.ClienteDto;
import dto.ProdutoDto;

import javax.swing.event.ListDataEvent;


public class AppMelhorado {
    public static void main(String[] args) {
        ClienteDto cliente1 = new ClienteDto("Joao", "0987654321", 51);
        VendaMelhorada venda1 = new VendaMelhorada(cliente1);
        ProdutoDto produto1 = new ProdutoDto("feijao", 6.50, 1);
        ProdutoDto produto2 = new ProdutoDto("massa", 3.50, 0.5);

        venda1.adicionaProduto(produto1);
        venda1.adicionaProduto(produto2);
        venda1.adicionaProduto(new ProdutoDto("oleo", 9, 1));
        venda1.adicionaProduto(new ProdutoDto("cafe", 10, 0.5));
        venda1.adicionaProduto(new ProdutoDto("acucar", 4, 1));

        System.out.println(venda1.getListacompras().get(1).getNome());

       // venda1.valorTotal();
        System.out.println(venda1.valorTotal());


//        double totalCompra = 0;
//
//        for(int i=0; i<venda1.getListacompras().size(); i++){
//            totalCompra=totalCompra+venda1.getListacompras().get(i).getValor();
//
//        }
//        System.out.println("O valor total da compra é: R$"+totalCompra);
//
//
//    }

    }
}

//recuperar o total do valor
//criar um metodo dentro da venda melhorada que pode ser chamado aqui
