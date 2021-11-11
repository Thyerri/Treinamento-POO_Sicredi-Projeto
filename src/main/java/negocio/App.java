package negocio;

import dto.ClienteDto;
import dto.ProdutoDto;

public class App {
    public static void main(String[] args) {
        ClienteDto cliente1 = new ClienteDto("Diogo", "1234567890", 40);
        ProdutoDto produto1 = new ProdutoDto("arroz", 5, 1);
        Venda venda1 = new Venda(cliente1, produto1);
        System.out.println("Nome do produto: " + venda1.getProduto().getNome());
        System.out.println("Peso do produto: " + venda1.getProduto().getPeso()+" kg");
        System.out.println("Valor do produto: R$" + venda1.getProduto().getValor());

        System.out.println("Nome do cliente: " + venda1.getCliente().getNome());
        System.out.println("CPF: " + venda1.getCliente().getCpf());
        System.out.println("Idade: " + venda1.getCliente().getIdade());
    }
}
