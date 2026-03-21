package AtividadeAvaliativa1.questao5;

public class Main {
    public static void main(String[] args) {
        ControleAcademico ca = new ControleAcademico();
        
        Disciplina d1= new Disciplina("Programacao Orientada a Objetos", "Marciano");
        Disciplina d2= new Disciplina("Engenharia de Software", "Andressa");
        ca.cadastrarDisciplina("POO", d1);
        ca.cadastrarDisciplina("ES", d2);

        d1.matricular(1);
        d1.matricular(2);

        d2.matricular(2);
        d2.matricular(3);
        d2.matricular(4);

        System.out.println(ca.buscarDisciplina("POO"));

        ca.listarDisciplinasComMaisDe(2);
        

    }
}
