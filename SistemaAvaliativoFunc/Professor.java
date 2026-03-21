package SistemaAvaliativoFunc;

import SistemaAvaliativoFunc.Exceptions.DadosInvalidosException;

public class Professor extends Funcionarios implements Avaliavel {
    private Integer quantidadePublicacoes;
    private Integer horasAulas;

// horas aulas nao podem ser maiores que quantidade de cargahoraria
    public Professor(String nome, Integer matricula, Integer cargaHoraria, Integer quantidadePublicacoes, Integer horasAulas) throws DadosInvalidosException{
        super(nome, matricula, cargaHoraria);
        if (quantidadePublicacoes < 0|| horasAulas< 0) {
            throw new DadosInvalidosException("Valores negativos!");
        }
        if (horasAulas> cargaHoraria) {
            throw new DadosInvalidosException("Horas Aulas excede Carga horaria");
        }
        this.quantidadePublicacoes = quantidadePublicacoes;
        this.horasAulas = horasAulas;

    }

    @Override
    public Integer calcularDesempenho() throws DadosInvalidosException{
        return quantidadePublicacoes + horasAulas;
    }

    @Override
    public Integer avaliar() throws DadosInvalidosException {
        return calcularDesempenho() ;
    }

    @Override
    public String getResumo() {
        return super.getResumo()
        + " Quantidade de Publicações: " + quantidadePublicacoes
        + " Horas aulas: " + horasAulas;
    }


}
