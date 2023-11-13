
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExcluirCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerExcluirCliente {
    
    private ExcluirCliente view;

    public ControllerExcluirCliente(ExcluirCliente view) {
        this.view = view;
    }

    public void excluirCliente(){
        Cliente cliente = new Cliente(view.getTxtEntradaCPFExcluir().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            ResultSet res = dao.consultarCliente(cliente);
            if(res.next()){
                dao.removerCliente(cliente);
                JOptionPane.showMessageDialog(view, "Cliente Excluído", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,"Cliente não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
