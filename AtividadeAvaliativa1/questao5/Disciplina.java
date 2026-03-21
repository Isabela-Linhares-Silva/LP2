package AtividadeAvaliativa1.questao5;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String professor;
    private List<Integer> alunos = new ArrayList<>();

    Disciplina(String nome, String professor){
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Integer matricula){
        alunos.add(matricula);
    }

    public void remove (Integer matricula){
        alunos.remove(matricula);
    }

    public Integer total(){
        return alunos.size();
    }

    @Override
    public String toString() {
        
        return "Disciplina "+ 
        "\nnome: " + nome +
        "\nprofessor: " + professor +
        "\ntotal: " +total()+" alunos";
    }
}
