package AtividadeAvaliativa2;

public class Jogador implements Comparable<Jogador> {
    private String nome;
    private Integer pontuacao;

    Jogador (String nome, Integer pontuacao){
        this.nome= nome;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Jogador: " +
        "\nnome: "+ nome +
        "\npontuação: " + pontuacao;
    }

    @Override
    public int compareTo(Jogador j) {
        if (Integer.compare(this.pontuacao, j.pontuacao)!= 0) {
            return Integer.compare(j.pontuacao, this.pontuacao);
        }
        return this.nome.compareTo(j.nome);
    }
    
}
