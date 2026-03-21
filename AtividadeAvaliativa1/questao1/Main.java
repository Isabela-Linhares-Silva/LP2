package AtividadeAvaliativa1.questao1;

public class Main {
    public static void main(String[] args) {
        Repositorio r = new Repositorio();

        r.add(new Produto(1,"Arroz",5.60));
        r.add(new Disciplina("Linguagem de Programação 2", "Marciano"));
        r.listar();
    }
    
}
