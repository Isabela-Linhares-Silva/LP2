package Collections;

import java.util.ArrayList;

public class ImprimeColecao <T> {//UTILIZA O T SÓ PARA DIZER QUE É UM TIPO
    private ArrayList<T> lista = new ArrayList<>();

    public void addValor (T valor){
        lista.add(valor);
    }

    public T primeiro(){// ONDE SERIA UM INTEGER, AGORA É O "T"
        return lista.get(0);
    }

    public void imprimeLista(){
        // for (int i = 0; i < lista.size(); i++) {
        //     System.out.println();
        // }

        for (T valor: lista) {// pra cada valor da lista que existir ele imprime.
            System.out.println(valor);
        }
    }
}
