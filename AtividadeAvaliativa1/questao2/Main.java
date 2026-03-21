package AtividadeAvaliativa1.questao2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Projeto p1 = new Projeto("Projeto 1", 10.0f, 9.0f, 10.0f, 2020);
        Projeto p2 = new Projeto("Segundo", 7.0f, 6.0f, 10.0f, 2021);

        ArrayList<Projeto> listaProjetos = new ArrayList<>();

        listaProjetos.add(p1);
        listaProjetos.add(p2);

        Collections.sort(listaProjetos);

        for (Projeto i : listaProjetos) {
            System.out.println(i);
        }

        
    }
}
