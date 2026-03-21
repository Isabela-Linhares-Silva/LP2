package SistemaBibliotecario;
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "Como eu era antes de voce",2016,"Jojo Moyes", 1535, 320);

        if (livro1.podeSerEmprestado()) {
            System.out.println("O livro está disponível");
        }
        else{
            System.out.println("O livro nao esta disponivel");
        }

        Revista revista1 = new Revista(2, "Capricho", 2015, false, 3, "Abril");

        System.out.println(livro1.getDescricao());
        System.out.println(revista1.getDescricao());


    }
}
