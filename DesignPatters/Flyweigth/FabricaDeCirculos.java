package DesignPatters.Flyweigth;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeCirculos {// flyweight
    private Map<String, Circulo> circulos = new HashMap<>();

    public Circulo getCirculo(String cor){
        Circulo c = circulos.get(cor);

        if (c == null) {
            c = new Circulo(cor);
            circulos.put(cor, c);
            System.out.println("Criando um circulo de cor: "+cor);
        }

        return c;
    }
}
