
package controller;

import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.LoginGerente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.MenuGerente;

public class ControllerLoginGerente {
    
    private LoginGerente view;

    public ControllerLoginGerente(LoginGerente view) {
        this.view = view;
    }
    
    public void loginGerente(){
        Gerente gerente = new Gerente(view.getTxtEntradaLogin().getText(), 
                null, view.getTxtEntradaSenha().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            ResultSet res = dao.consultarGerente(gerente);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                String nome = res.getString("nome");
                String login = res.getString("login");
                String senha = res.getString("senha");
                MenuGerente viewGerente = new MenuGerente(new Gerente(login, nome, senha));
                viewGerente.setVisible(true);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,"Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
