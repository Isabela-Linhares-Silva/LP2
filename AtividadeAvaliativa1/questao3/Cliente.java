package AtividadeAvaliativa1.questao3;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private Integer telefone;

    Cliente(String nome, String cpf, String email, Integer telefone){
        this.nome = nome;
        if (cpf == null) {
            throw new NullPointerException("CPF INVALIDO!");
        }
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        Cliente c = (Cliente) o;
        return this.cpf.equals(c.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
