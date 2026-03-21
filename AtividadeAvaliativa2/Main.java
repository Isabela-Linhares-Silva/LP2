package AtividadeAvaliativa2;

public class Main {
    public static void main(String[] args) {
        Ranking<Jogador> jogadores = new Ranking<>();

        jogadores.adicionar(new Jogador("Joao", 100));
        jogadores.adicionar(new Jogador("Donato", 94));
        jogadores.adicionar(new Jogador("Kessya", 95));
        jogadores.adicionar(new Jogador("Rebeca", 94));
        jogadores.adicionar(new Jogador("Donato", 94));

        jogadores.mostrarResultados();
    }
}
