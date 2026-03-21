package projetojdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) { 
    Connection connection = null;//conection o com anco
    Statement st = null;// execulta o sql
    ResultSet rs = null;//guarda o resultado do select

    try {
        connection = DB.getConnection();
        st = connection.createStatement();
        rs = st.executeQuery("select nome,cpf from aluno");
        while(rs.next()){
        System.out.println(rs.getString("nome") +
        rs.getString("cpf"));
    }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


    }
}


