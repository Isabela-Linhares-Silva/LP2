package SistemaAvaliativoFunc.Exceptions;

public class DadosInvalidosException extends Exception {
    // Deve ser lançada quando valores inválidos forem informados, como:
    // carga horária negativa ou zero
    // número de publicações negativo
    // nota de avaliação fora do intervalo permitido

    public DadosInvalidosException (String msg){
        super(msg);
    }

}
