
package controller;
import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.ExcluirGerente;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.LoginGerente;

public class ControllerExcluirGerente {
    
    private ExcluirGerente view;

    public ControllerExcluirGerente(ExcluirGerente view) {
        this.view = view;
    }
    
    public void excluirGerente(){
        Gerente gerente = new Gerente(view.getTxtEntradaLoginExcluir().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            ResultSet res = dao.consultarGerenteLogin(gerente);
            if(res.next()){
                dao.removerGerente(gerente);
                JOptionPane.showMessageDialog(view, "Gerente Excluído", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,"Gerente não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
