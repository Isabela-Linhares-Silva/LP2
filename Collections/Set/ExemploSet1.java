package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploSet1 {
    public static void main(String[] args) {
        Set<Integer> c1 = new HashSet<>();// utiliza quando nao quer uzar valores repetidos, pois ele considera como se fosse apenas 1 
        //imprime de forma aleatoria;
        c1.add(1);
        c1.add(10);
        c1.add(5);
        c1.add(8);

        for (Integer i : c1) {
            System.out.println(i);
        }

        Set<Integer> c2 = new LinkedHashSet<>();// imprime na ordem em que foi inserido
        c2.add(1);
        c2.add(13);
        c2.add(50);
        c2.add(9);

        for (Integer i : c2) {
            System.out.println(i);
        }

        
        System.out.println("\n"+c1.contains(5));

        c1.remove(8);//remove o elemento em si, pelo "valor"
        c1.removeIf(x->x>5);// remore expecificamente os valores maiores que 5 
        for (Integer i : c1) {
            System.out.println(i);
        }

        Set<Integer> c3 = new HashSet<>(Arrays.asList(1,5,20,30));

        Set<Integer> c4 = new HashSet<>(c1);
        //c4.addAll(c3);//UNIAO

        c4.retainAll(c3);//pega oq tem em comun nos dois(intercessao)
        c4.removeAll(c3);//pega oq esta no primeiro e nao esta no segundo
    }
}
