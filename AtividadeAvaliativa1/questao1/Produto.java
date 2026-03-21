package AtividadeAvaliativa1.questao1;

public class Produto {
    private Integer codigo;
    private String nome;
    private Double preco;

    Produto (Integer codigo,String nome,Double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto :" + 
        "\nCodigo: "+ codigo
        +"\nNome: "+nome
        +"\nPreco: "+preco;
    }
}
