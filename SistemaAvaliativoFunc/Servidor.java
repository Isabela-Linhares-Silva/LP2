package SistemaAvaliativoFunc;

import SistemaAvaliativoFunc.Exceptions.DadosInvalidosException;

public class Servidor extends Funcionarios implements Avaliavel {
    private String setor;
    private int avaliacaoChefia;

    public Servidor(String nome, Integer matricula, Integer cargaHoraria, String setor, int avaliacaoChefia)throws DadosInvalidosException{
        super(nome, matricula, cargaHoraria);
        this.setor = setor;
        if (avaliacaoChefia <0 && avaliacaoChefia> 10){
            throw new DadosInvalidosException("Avaliação fora do intervalo permitido!");
        }
        this.avaliacaoChefia =  avaliacaoChefia;
    }

    @Override
    public Integer calcularDesempenho() throws DadosInvalidosException {
        return avaliacaoChefia;
    }

    @Override
    public Integer avaliar() throws DadosInvalidosException {
        return calcularDesempenho();
    }

    @Override
    public String getResumo() {
        return super.getResumo() 
        + " Setor: " + setor
        + " Avaliação da Chefia: " + avaliacaoChefia;
    }
}
