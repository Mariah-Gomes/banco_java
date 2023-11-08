
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Cliente cliente) throws SQLException{
        
        // esta solução não é mais eficiente, pois permite que comandos sql sejam inseridos via campos
        // exemplo com usuário válido: gbiondi '--
        
//        String sql = "select * from aluno where usuario = '" +
//                aluno.getUsuario()+ "' AND senha = '" +
//                aluno.getSenha() + "'";

        String sql = "select * from aluno where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void debitar(Cliente cliente) throws SQLException{
       String sql = "update cliente set senha = ? && cpf = ? where valorConta = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setString(1, cliente.getSenha());
       statement.setString(2, cliente.getCpf());
       statement.setDouble(3, cliente.getValorConta());
       statement.execute();
       conn.close();
    }

}

