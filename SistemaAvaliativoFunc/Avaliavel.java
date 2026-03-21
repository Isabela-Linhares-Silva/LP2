package SistemaAvaliativoFunc;

import SistemaAvaliativoFunc.Exceptions.DadosInvalidosException;

public interface Avaliavel {
    Integer avaliar() throws DadosInvalidosException;
}
