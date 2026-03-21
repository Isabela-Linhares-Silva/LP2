package SistemaBibliotecario;

public abstract class ItemBiblioteca {
    private int codigo;
    private String titulo;
    private int anoPublicacao;
    private boolean emprestado;

    ItemBiblioteca(int codigo, String titulo,int anoPublicacao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    private boolean emprestar() {
        if (emprestado) {
            System.out.println("O item já foi emprestado");
            return emprestado = false;
        }
        else return emprestado  = true;
    }

    
    
    public boolean devolver() {
        if (!emprestado) {
            System.out.println("O item não está emprestado");
            return false;
        } else {
            emprestado = false;
            return true;
        }
    }

    public String getDescricao(){
        return "Titulo: "+ titulo+
        " \nCodigo: "+ codigo+
        " \nAno Publicado: "+ anoPublicacao+
        " \nEsta emprestado: "+ emprestar()+
        " \nFoi devolvido: "+ devolver();
    }


}