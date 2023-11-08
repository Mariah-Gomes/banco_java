
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.CadastrarCliente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerCadastroCliente {
    
    private CadastrarCliente view;

    public ControllerCadastroCliente(CadastrarCliente view) {
        this.view = view;
    }
    
    public void salvarCliente(){
        String nome = view.getTxtEntradaNomeCadastrar().getText();
        String cpf = view.getTxtEntradaCPFCadastrar().getText();
        double valorInicial = Double.parseDouble
        (view.getTxtEntradaValorInicialCadastrar().getText());
        String senha = view.getTxtEntradaSenhaCadastrar().getText();
        Cliente cliente = new Cliente(cpf, null, valorInicial,
                nome, senha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.inserirCliente(cliente);
            JOptionPane.showMessageDialog(view,
                    "Cliente Cadastrado","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
