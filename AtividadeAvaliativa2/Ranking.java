package AtividadeAvaliativa2;

import java.util.Set;
import java.util.TreeSet;

public class Ranking<T extends Comparable<T>> {
    private Set<T> competidores = new TreeSet<>();

    public void adicionar(T item){
        competidores.add(item);
    }

    public void mostrarResultados(){
        for (T t : competidores) {
            System.out.println(t);
        }
    }
}
