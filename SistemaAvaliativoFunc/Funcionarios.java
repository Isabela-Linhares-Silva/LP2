package SistemaAvaliativoFunc;

import SistemaAvaliativoFunc.Exceptions.DadosInvalidosException;

public abstract class Funcionarios {
    protected String nome;
    protected Integer matricula;
    protected Integer cargaHoraria;

    public Funcionarios (String nome, Integer matricula, Integer cargaHoraria){
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
    }
    public abstract Integer calcularDesempenho() throws DadosInvalidosException;// add o thros 

    public String getResumo(){
        return "Nome: " + nome
        + " Matricula: " + matricula
        + " Carga horaria: " + cargaHoraria;
    }
}