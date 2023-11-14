
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ValorInicial;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerValorInicialCliente {
    
    private ValorInicial view;
    private String cpf;

    public ControllerValorInicialCliente(ValorInicial view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void valorInicial(){
        Cliente cliente = new Cliente(cpf, null,
                Double.parseDouble(view.getTxtEntradaValorInicialCriar().getText()),
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherSaldo(cliente);
            JOptionPane.showMessageDialog(view,
                    "Saldo Aberto","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
