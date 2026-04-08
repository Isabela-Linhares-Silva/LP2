package DesignPatters.Flyweigth;

public class Circulo {
    private String cor;// estado intríseco

    public Circulo(String cor){
        this.cor = cor;// cor é compatilhado entre circulos da mesma cor 
    }

    public void desenhar(int x, int y, int raio){
        //x,y e raio são estados extrinsecos específicos para cada circulo
        System.out.println("Desenhando um circulo de cor "+ cor+" em ("+x+","+y+") com raio "+raio);
    }
}
