package AtividadeAvaliativa1.questao4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> filmes = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> series = new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> doc = new HashSet<>(Arrays.asList(1,3,6));

        //o total de usuario distintos considerando as tres categorias

        Set<Integer> total = new HashSet<>(filmes);
        total.addAll(series);
        total.addAll(doc);

        for (Integer i : total) {
            System.out.println(i);
            //System.out.println(total.size()); //Sequiser saber apenas o tamanho final
        }

        //os usuarios que consumiram as tres categorias simultaneamente

        Set<Integer> tres = new HashSet<>(filmes);
        tres.retainAll(series);//intercessao
        tres.retainAll(doc);

        System.out.println("O que tem em comum nos tres: "+tres.size());

        //os usuarios que assistiram apenas filmes
        Set<Integer> apenasFilmes = new HashSet<>(filmes);
        apenasFilmes.removeAll(series);
        apenasFilmes.removeAll(doc);
        System.out.println("Apenas filmes: "+apenasFilmes.size());

        //os usuarios que consumiram extamente duas categorias
        

    }
}
