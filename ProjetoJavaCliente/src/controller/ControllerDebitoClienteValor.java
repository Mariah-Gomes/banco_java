
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
    
    public void debitar(){
        Double novoDebito = Double.parseDouble(view.getValorCienteDebitarEntrada().getText());
        Cliente cliente = new Cliente("", "","","",novoDebito);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.debitar(cliente);
            JOptionPane.showMessageDialog(view,"Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,"Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
