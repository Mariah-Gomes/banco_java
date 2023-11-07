
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Cliente;

public class ClienteDAO {
    
    private Connection conn;

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    // consultar cpf cliente (cpf)
    public ResultSet consultarCliente(Cliente cliente) throws SQLException{
        String sql = "select * from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    // cadastrar cliente (nome, cpf, valor inicial, senha)
    public void inserirCliente(Cliente cliente) throws SQLException{
        String sql = "insert into clientes (nome, cpf, saldo, senha) values ('" 
                + cliente.getNome() + "','" + cliente.getCpf()+ "','" 
                + cliente.getSaldo() + "','" + cliente.getSenha()+ "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    // criar conta cliente (tipo conta)
    // é com botão esse, ai tenho que ver com a Prof. Gabi como fazer
    
    // excluir cliente (cpf)
    public void removerCliente(Cliente cliente) throws SQLException{
        String sql = "delete from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
}
