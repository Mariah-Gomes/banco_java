
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.ExibirSaldo;
import view.ExibirSaldoExibindo;

public class ControllerExibirSaldoCliente {
    
    private ExibirSaldo view;

    public ControllerExibirSaldoCliente(ExibirSaldo view) {
        this.view = view;
    }
    
    public void entrarExibirSaldo(){
        String cpf = view.getTxtEntradaCPFExibir().getText();
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            ResultSet res = dao.consultarCliente(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view,
                        "CPF permitido", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                ExibirSaldoExibindo viewExibirSaldo = new ExibirSaldoExibindo(cliente);
                ControllerExibindoSaldoCliente controllerExibindoSaldo = 
                        new ControllerExibindoSaldoCliente(viewExibirSaldo, cpf);
                viewExibirSaldo.setVisible(true);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,"CPF não existente", "Erro", JOptionPane.ERROR_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
