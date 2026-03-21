package RevisaoProva1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import AtividadeAvaliativa1.questao1.Repositorio;

public class Main {
    public static void main(String[] args) {
        Set<String> palestras = new HashSet<>(Arrays.asList("123","456","789"));
        Set<String> workshops = new HashSet<>(Arrays.asList("234","123","852"));
        Set<String> hackathons = new HashSet<>(Arrays.asList("987","123","456"));


        Set<String> total = new HashSet<>(palestras);
        total.addAll(workshops);
        total.addAll(hackathons);

        Set<String> tres = new HashSet<>(palestras);
        tres.retainAll(workshops);
        tres.retainAll(hackathons);

        Set<String> apenasPalestras = new HashSet<>(palestras);
        apenasPalestras.removeAll(workshops);
        apenasPalestras.removeAll(hackathons);

        //participantes que participaram de exatamente duas atividades
        Set<String> i1 = new HashSet<>(palestras);
        i1.retainAll(workshops);

        Set<String> i2 = new HashSet<>(palestras);
        i2.retainAll(hackathons);
    
        Set<String> i3 = new HashSet<>(workshops);
        i3.retainAll(hackathons);

        i1.addAll(i2);
        i1.addAll(i3);

        i1.removeAll(tres);

        System.out.println(i1);

        //participantes que não participaram de hackathons, mas participaram de pelo menos uma das outras
        Set<String> menosHackaton = new HashSet<>(palestras);
        menosHackaton.addAll(workshops);
        menosHackaton.removeAll(hackathons);

        ArrayList<Participante> p1 = new ArrayList<>();// permite elementos duplicados pois ele nao faz a verificação pelo equals e hashcode como o hashset
        Set<Participante> p2 = new HashSet<>();//faz a verificação se já existe na lista, se sim ele continua contando como apenas 1 e nao ocupa outro espaço na memoria
        
        p1.add(new Participante("a", "123", "a@gmail.com"));
        p1.add(new Participante("b", "123", "b@gmail.com"));
        p1.add(new Participante("c", "321", "c@gmail.com"));

        p2.add(new Participante("a", "123", "a@gmail.com"));
        p2.add(new Participante("b", "123", "b@gmail.com"));
        p2.add(new Participante("c", "321", "c@gmail.com"));

        Repositorio<Projeto> rep1 = new Repositorio<>();

        rep1.add(new Projeto("aaaaa", 10.0, 9.0, 10.0, 2025));
        
    }
}
