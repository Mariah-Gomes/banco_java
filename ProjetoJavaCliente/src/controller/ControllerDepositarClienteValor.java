
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.DebitarClienteValor;
import view.DepositarClienteValor;


public class ControllerDepositarClienteValor {
    private DepositarClienteValor view;
    private String cpf;
    
    public ControllerDepositarClienteValor (DepositarClienteValor view, String cpf){
        this.view = view;
        this.cpf = cpf;
    }
    
    public void depositar(){
        Cliente cliente = new Cliente(cpf);
        double deposito = Double.parseDouble(view.getValorClienteDepositarEntrada().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            double saldo = dao.consultarSaldoCliente(cliente);
            double novoDeposito = saldo + deposito;
            cliente.setSaldo(novoDeposito);
            dao.escolherSaldo(cliente);
            JOptionPane.showMessageDialog(view,"Deposito Realizado",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,"Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
