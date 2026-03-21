package AtividadeAvaliativa1.questao2;

public class Projeto implements Comparable<Projeto>{
    private String titulo;
    private Float notaOriginalidade;
    private Float notaImpacto;
    private Float notaViabilidade;
    private Integer anoSubmissao;

    Projeto (String titulo, Float notaOriginalidade,Float notaImpacto,Float notaViabilidade, Integer anoSubmissao)throws IllegalArgumentException{
        this.titulo = titulo;
        if (notaOriginalidade<0 || notaOriginalidade>10) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.notaOriginalidade = notaOriginalidade;
        if (notaImpacto<0 || notaImpacto>10) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.notaImpacto = notaImpacto;
        if (notaViabilidade<0 || notaViabilidade>10) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.notaViabilidade = notaViabilidade;
        this.anoSubmissao = anoSubmissao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getNotaOriginalidade() {
        return notaOriginalidade;
    }

    public void setNotaOriginalidade(Float notaOriginalidade) {
        this.notaOriginalidade = notaOriginalidade;
    }

    public Float getNotaImpacto() {
        return notaImpacto;
    }

    public void setNotaImpacto(Float notaImpacto) {
        this.notaImpacto = notaImpacto;
    }

    public Float getNotaViabilidade() {
        return notaViabilidade;
    }

    public void setNotaViabilidade(Float notaViabilidade) {
        this.notaViabilidade = notaViabilidade;
    }

    public Integer getAnoSubmissao() {
        return anoSubmissao;
    }

    public void setAnoSubmissao(Integer anoSubmissao) {
        this.anoSubmissao = anoSubmissao;
    }

    public Float total(){
        return notaImpacto + notaOriginalidade + notaViabilidade;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo
        + "\nNota Originalidade: "+ notaOriginalidade
        + "\nNota Impacto:"+ notaImpacto
        + "\nNota Viabilidade: "+ notaViabilidade
        + "\nAno Submissao: "+ anoSubmissao;
    }

    @Override
    public int compareTo(Projeto o) {
        if (Float.compare(o.total(),this.total())!=0) {
            return Float.compare(o.total(),this.total());
        }

        if (Float.compare(o.notaImpacto,this.notaImpacto)!= 0 ) {
            return Float.compare(this.notaImpacto, o.notaImpacto);
        }

        if (Float.compare(this.anoSubmissao, o.anoSubmissao)!= 0 ) {
            return Float.compare(this.anoSubmissao, o.anoSubmissao);
        }

        return this.titulo.compareTo(o.titulo);// returna a comparação por nome

    }
}
