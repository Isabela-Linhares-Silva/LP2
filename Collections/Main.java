package Collections;

public class Main {
    public static void main(String[] args) {
        ImprimeColecao<Integer> ic = new ImprimeColecao<>();

        ic.addValor(10);
        ic.addValor(8);
        //ic.addValor("Maria");

        ImprimeColecao<String> ic2 = new ImprimeColecao<>();
        ic2.addValor("Joao");

        System.out.println("Primeiro valor: "+ ic.primeiro());

        ic.imprimeLista();
    }
    

}
