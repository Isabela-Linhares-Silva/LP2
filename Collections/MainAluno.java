package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", 123);
        Aluno b = new Aluno("Luna", 456);

        ArrayList <Aluno> alunos= new ArrayList<>();

        alunos.add(a);
        alunos.add(b);

        ArrayList <Integer> teste = new ArrayList<>();

        teste.add(10);
        teste.add(20);
        teste.add(5);

        Collections.sort(alunos);
        for (Aluno v : alunos) {
            System.out.println(v.toString());
        }

        
    }
}
