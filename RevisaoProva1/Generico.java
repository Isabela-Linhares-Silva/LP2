package RevisaoProva1;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Generico<T extends Comparable<T>> {
    List<T> lista;

    public void adicionar(T elemento){
        if (elemento == null) {
            throw new NullPointerException("Elemento nao pode ser nulo");
        }
        lista.add(elemento);
    }

    public void remover(T elemento){
        if (!lista.contains(elemento)) {
            throw new NoSuchElementException("Elemento nao existe!");
        }
        lista.remove(elemento);
    }

    public T buscar(int indice){
        if (indice < 0 || indice >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return lista.get(indice);
    }
       
    public void listar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i);
        }
    }

    public int quantidade(){
        return lista.size();
    }

    public void ordenar(){
        Collections.sort(lista);
    }
}
