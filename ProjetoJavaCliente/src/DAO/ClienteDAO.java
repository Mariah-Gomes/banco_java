
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        String sql = "select * from clientes where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void debitar(Cliente cliente) throws SQLException{
       String sql = "update clientes set saldo = ? where cpf = ? where senha = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setString(1, cliente.getSenha());
       statement.setString(2, cliente.getCpf());
       statement.setString(3, cliente.saldo());
       statement.execute();
       conn.close();
    }
    
    public double consultarSaldoCliente(Cliente cliente) throws SQLException {
        String sql = "select saldo from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        double saldo = 0.0;
        if (resultado.next()) {
            saldo = resultado.getDouble("saldo");
        }
        return saldo;
    }
    
    public String consultarContaCliente(Cliente cliente) throws SQLException {
        String sql = "select conta from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        String conta = null;
        if (resultado.next()) {
            conta = resultado.getString("conta");
        }
        return conta;
    }
    
        public void escolherSaldo(Cliente cliente) throws SQLException{
        String sql = "update clientes set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cliente.getSaldo());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
        
        public void salvarExtrato(Cliente cliente) throws SQLException{
        String sql = "update extratos set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cliente.getSaldo());
        statement.setString(2, cliente.getCpf());
        //statement.setString(3, cliente.getTarifa());
        //
        statement.execute();
        conn.close();
    }
}

