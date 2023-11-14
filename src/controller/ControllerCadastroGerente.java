
package controller;

import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.CadastroGerente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.LoginGerente;

public class ControllerCadastroGerente {
    
    private CadastroGerente view;

    public ControllerCadastroGerente(CadastroGerente view) {
        this.view = view;
    }
    
    public void salvarGerente(){
        String nome = view.getTxtEntradaNomeCadastroGerente().getText();
        String login = view.getTxtEntradaLoginCadastroGerente().getText();
        String senha = view.getTxtEntradaSenhaCadastroGerente().getText();
        Gerente gerente = new Gerente(nome, login, senha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.inserirGerente(gerente);
            JOptionPane.showMessageDialog(view,
                    "Gerente Cadastrado","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
