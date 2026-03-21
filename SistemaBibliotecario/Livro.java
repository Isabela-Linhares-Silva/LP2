package SistemaBibliotecario;

public class Livro extends ItemBiblioteca implements Emprestavel{
    private String autor;
    private Integer isbn;
    private Integer numeroPaginas;

    public Livro (int codigo, String titulo, int anoPublicacao,String autor, Integer isbn, Integer numeroPaginas){
        super(codigo,titulo,anoPublicacao);
        this.autor =  autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public int getPrazoEmprestimo() {
        return 20;
    }

    @Override
    public boolean podeSerEmprestado() {
        return true;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+ " Autor: "+ autor
        + " \nisbn: "+ isbn
        + "\nNumero de paginas: "+ numeroPaginas
        + "\nTempo de emprestimo: "+ getPrazoEmprestimo() + " dias.";
    }
}
