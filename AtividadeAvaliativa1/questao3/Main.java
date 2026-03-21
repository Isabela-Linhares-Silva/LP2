package AtividadeAvaliativa1.questao3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> lista1 = new ArrayList<>();
        Set<Cliente> lista2 = new HashSet<>();
        
        lista1.add(new Cliente("Luna", "11111111111", "luninha@gmail.com", 123456789));
        lista1.add(new Cliente("Leticia", "22222222222", "Let@gmail.com", 987654321));
        lista1.add(new Cliente("Donato", "11111111111", "Donuts@gmail.com", 147258369));

        lista2.add(new Cliente("Luna", "11111111111", "luninha@gmail.com", 123456789));
        lista2.add(new Cliente("Leticia", "22222222222", "Let@gmail.com", 987654321));
        lista2.add(new Cliente("Donato", "11111111111", "Donuts@gmail.com", 147258369));

        System.out.println(lista1.size());
        System.out.println(lista2.size());
    }
}
