package RevisaoProva1;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ControleEvento {
    Map<String, Trilha> controle = new HashMap<>();

    public void cadastrarTrilha(String codigo, Trilha trilha){
        controle.put(codigo, trilha);
    }

    public Trilha buscarTrilha(String codigo){
        if (controle.containsKey(codigo)) {
            return controle.get(codigo);
        }
        else{
            throw new NoSuchElementException();
        }
    }

    public void listarTrilhasComMaisDe(int quantidadeParticipantes){
        for (Map.Entry<String, Trilha> i : controle.entrySet()) {
            if (i.getValue().totalParticipantes()> quantidadeParticipantes) {
                System.out.println(i.getValue().toString());
            }
        }
    }
}