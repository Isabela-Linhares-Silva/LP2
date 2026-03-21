package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// diferença dos Array é que no Set nao tem indice e nao mostra numerosrepetidos
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> TurmaA = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o codigo do aluno: ");
            TurmaA.add(sc.nextInt());
        }

        Set<Integer> TurmaB = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o codigo do aluno: ");
            TurmaB.add(sc.nextInt());
        }

        Set<Integer> TotalAlunos = new HashSet<>(TurmaA);
        TotalAlunos.addAll(TurmaB);

        for (Integer i : TotalAlunos) {
            System.out.println(i);
        }

        sc.close();
    }
}
