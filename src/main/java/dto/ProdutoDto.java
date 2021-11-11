package dto;

public class ProdutoDto {
    private String nome;
    private double valor;
    private double peso;

    public ProdutoDto(String nome, double valor, double peso){
        this.nome=nome;
        this.valor=valor;
        this.peso = peso;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public String getNome(){
        return this.nome;
    }
    public double getValor(){
        return this.valor;
    }
    public double getPeso(){
        return this.peso;
    }
}
