
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Gerente;

public class GerenteDAO {
    
    private Connection conn;

    public GerenteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultarGerente(Gerente gerente) throws SQLException{
        String sql = "select * from gerentes where login = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getLogin());
        statement.setString(2, gerente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserirGerente(Gerente gerente) throws SQLException{
        String sql = "insert into gerentes (nome, login, senha) values ('" +
                gerente.getNome() + "','" + gerente.getLogin()+ "','" + 
                gerente.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
}
