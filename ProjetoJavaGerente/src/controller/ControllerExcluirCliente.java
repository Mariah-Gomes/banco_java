
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExcluirCliente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerExcluirCliente {
    
    private ExcluirCliente view;
    private Cliente cliente;

    public ControllerExcluirCliente(ExcluirCliente view, Cliente cliente) {
        this.view = view;
        this.cliente = cliente;
    }
    
    public void removerCliente(){
        String cpf = cliente.getCpf();
        int option = JOptionPane.showConfirmDialog(view,
                "Deseja realmente excluir?",
                    "Aviso", JOptionPane.YES_NO_OPTION);
        if(option != 1){
            Conexao conexao = new Conexao();
            try{
                Connection conn = conexao.getConnection();
                ClienteDAO dao = new ClienteDAO(conn);
                dao.removerCliente(cliente);
                JOptionPane.showMessageDialog(view,"Cliente removido com sucesso",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,"Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
