
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
    
    public ControllerDebitoClienteValor (DebitarClienteValor view){
        this.view = view;
    }
    
    public void debitarClienteDebito(){
        Cliente cliente = new Cliente(null, null, null, null, 
            Double.parseDouble(view.getValorCienteDebitarEntrada().getText()));
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            ResultSet res = dao.consultar(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Debito Realizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                String cpf = res.getString("cpf");
                String tipoConta = res.getString("tipo conta");
                String nome = res.getString("nome");
                String senha = res.getString("senha");
                Double valorConta = res.getDouble("valor Conta");
//                DebitarClienteConta viewDebitarClienteConta = new DebitarClienteConta(new Cliente(cpf, tipoConta, nome, senha, valorConta));
//                viewDebitarClienteConta.setVisible(true);
//                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,"Debito Não Realizado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
