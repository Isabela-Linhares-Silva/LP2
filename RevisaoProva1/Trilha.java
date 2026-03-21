package RevisaoProva1;

import java.util.List;

public class Trilha {
    String nome;
    String palestrante;
    List<String> participantes;
    

    public void inscreverParticipante(String cpf){
        participantes.add(cpf);
    }

    public void removerParticipante(String cpf){
        participantes.remove(cpf);
    }

    public int totalParticipantes(){
        return participantes.size();
    }

    @Override
    public String toString() {
        return "Nome: "+nome +
        "Palestrante: "+ palestrante+
        "Total de participantes: "+ totalParticipantes();
    }
}
