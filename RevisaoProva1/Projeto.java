package RevisaoProva1;

public class Projeto implements Comparable<Projeto>{
    String titulo;
    Double notaInovacao;
    Double notaImpacto;
    Double notaSubmissao;
    Integer anoSubmissao;

    Projeto(String titulo, Double notaInovacao, Double notaImpacto,Double notaSubmissao, Integer anoSubmissao){
        this.titulo = titulo;
        if (notaInovacao>10 || notaInovacao<0|| notaImpacto>10|| notaImpacto<0||notaSubmissao>10||notaSubmissao<0) {
            throw new IllegalArgumentException("Nota invalida!");
        }
        this.notaInovacao = notaInovacao;
        this.notaImpacto = notaImpacto;
        this.notaSubmissao = notaSubmissao;
        this.anoSubmissao = anoSubmissao;
    }

    double Total(){
        return (notaImpacto+ notaInovacao+ notaSubmissao);
    }

    @Override
    public int compareTo(Projeto p) {
        if (Double.compare(Total(),p.Total())!= 0 ) {
            return Double.compare(p.Total(),Total());
        }

        if (Double.compare(this.notaImpacto, p.notaImpacto)!= 0) {
            return Double.compare(p.notaImpacto, this.notaImpacto);
        }

        if (Integer.compare(this.anoSubmissao, p.anoSubmissao)!= 0) {
            return Integer.compare(p.anoSubmissao, this.anoSubmissao);
        }

        return this.titulo.compareTo(p.titulo);
    }

}