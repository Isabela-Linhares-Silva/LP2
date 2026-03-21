package RevisaoProva1;

public class Participante {
    String nome;
    String cpf;
    String email;

    Participante (String nome, String cpf, String email){
        this.nome = nome;
        if (cpf == null) {
            throw new NullPointerException("CPF INVALIDO!");
        }
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Cpf invalido");
        }
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        Participante p = (Participante) obj;
        return this.cpf.equals(p.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
