package AtividadeAvaliativa1.questao1;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    //pode ter uma restrição da classe generica, poe exemplo extender comparable

    List <T> lista = new ArrayList<>();

    public void add(T elemento){
        lista.add(elemento);
    }

    public void remove(T indice){
        lista.remove(indice);
    }

    public void listar(){
        for (T i : lista) {
            System.out.println(i);
        }
    }

    public Integer quantidade(){
        return lista.size();
    }

    public T buscar (Integer indice){
        return lista.get(indice);
    }

    //criar restricoes
}
