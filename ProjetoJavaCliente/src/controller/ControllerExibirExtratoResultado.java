
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.ExibirExtratoClienteResultado;
import view.ExibirSaldoClienteResultado;


public class ControllerExibirExtratoResultado {
    private ExibirExtratoClienteResultado view;
    private String cpf;

    public ControllerExibirExtratoResultado(ExibirExtratoClienteResultado view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void exibirExtrato(){
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            double saldoCliente = dao.consultarSaldoCliente(cliente);
            view.getTxtSaidaExibirContas().setText(String.valueOf(saldoCliente));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}

