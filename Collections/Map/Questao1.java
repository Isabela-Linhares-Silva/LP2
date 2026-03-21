package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Questao1 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();


    }

    public static void adicionar (Map<String, Integer> estoque, String produto, Integer qtd){
        estoque.put(produto, qtd);
    }

    public static void remover (Map<String, Integer> estoque, String produto, Integer qtd){// diminuir a quantidade do estoque
        Integer quantidade = estoque.get(produto);
        estoque.put(produto, quantidade-qtd);
    }//criar excessoes

    public static void exibir (Map<String, Integer> estoque){
        //criar
    }
}
