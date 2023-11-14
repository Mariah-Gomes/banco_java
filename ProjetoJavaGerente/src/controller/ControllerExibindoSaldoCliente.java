
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExibirSaldoExibindo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerExibindoSaldoCliente {
    
    private ExibirSaldoExibindo view;
    private String cpf;

    public ControllerExibindoSaldoCliente(ExibirSaldoExibindo view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void exibirSaldo(){
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            double saldoCliente = dao.consultarSaldoCliente(cliente);
            view.getTxtSaidaExibirSaldo().setText(String.valueOf(saldoCliente));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }

}
