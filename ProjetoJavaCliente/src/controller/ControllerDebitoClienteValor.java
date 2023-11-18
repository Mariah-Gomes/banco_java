
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.DebitarCliente;
import view.DebitarClienteValor;

public class ControllerDebitoClienteValor {
    private DebitarClienteValor view;
    private String cpf;
    
    public ControllerDebitoClienteValor (DebitarClienteValor view, String cpf){
        this.view = view;
        this.cpf = cpf;
    }
    
    public void debitar(){
        Cliente cliente = new Cliente(cpf);
        double debito = Double.parseDouble(view.getValorCienteDebitarEntrada().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            String conta = dao.consultarContaCliente(cliente);
            double saldo = dao.consultarSaldoCliente(cliente);
            if (conta.equals("Poupança")){
                if(saldo < debito){
                    JOptionPane.showMessageDialog(view,"Operação Inválida",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    double novoDebito = saldo - debito;
                    cliente.setSaldo(novoDebito);
                    dao.escolherSaldo(cliente);
                    JOptionPane.showMessageDialog(view,"Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else if (conta.equals("Corrente")){
                double limite = -1.000;
                double taxa = 0.01;
                double novaTaxa = debito * taxa;
                double valorTotal = debito + novaTaxa;
                double novoDebito = saldo - valorTotal;
                if(novoDebito < limite){
                    JOptionPane.showMessageDialog(view,"Operação Inválida",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    cliente.setSaldo(novoDebito);
                    dao.escolherSaldo(cliente);
                    JOptionPane.showMessageDialog(view,"Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                double taxa = 0.05;
                double novaTaxa = debito * taxa;
                double valorTotal = debito + novaTaxa;
                double novoDebito = saldo - valorTotal;
                if(saldo < novoDebito){
                    JOptionPane.showMessageDialog(view,"Operação Inválida",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    cliente.setSaldo(novoDebito);
                    dao.escolherSaldo(cliente);
                    JOptionPane.showMessageDialog(view,"Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,"Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
