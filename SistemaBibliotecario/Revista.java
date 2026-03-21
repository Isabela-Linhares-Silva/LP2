package SistemaBibliotecario;

public class Revista extends ItemBiblioteca {
    private int edicao;
    private String mesPublicacao;

    Revista(int codigo, String titulo, int anoPublicacao,boolean emprestado,int edicao, String mesPublicacao){
        super(codigo, titulo,anoPublicacao);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao()
        + " \nEdicao: "+ edicao
        + " \nMes de publicação: "+ mesPublicacao;
    }
}