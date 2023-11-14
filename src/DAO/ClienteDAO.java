
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    
    public ArrayList<Cliente> consultarContasCliente() throws SQLException{
        ArrayList<Cliente> clientesComConta = new ArrayList<>();
        String sql = "select * from clientes where conta is not null";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();
        while(resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setCpf(resultado.getString("cpf"));
            cliente.setTipoConta(resultado.getString("conta"));
            cliente.setSaldo(resultado.getDouble("saldo"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setSenha(resultado.getString("senha"));
            clientesComConta.add(cliente);
        }
        return clientesComConta;
    }
    
    // cadastrar cliente (nome, cpf, senha)
    public void inserirCliente(Cliente cliente) throws SQLException{
        String sql = "insert into clientes (nome, cpf, senha) values ('" 
                + cliente.getNome() + "','" + cliente.getCpf()+ "','" +
                cliente.getSenha()+ "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    // criar conta cliente (tipo conta)
    public void escolherConta(Cliente cliente) throws SQLException{
        String sql = "update clientes set conta = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getTipoConta());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void escolherSaldo(Cliente cliente) throws SQLException{
        String sql = "update clientes set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cliente.getSaldo());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    // excluir cliente (cpf)
    public void removerCliente(Cliente cliente) throws SQLException{
        String sql = "delete from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
}
