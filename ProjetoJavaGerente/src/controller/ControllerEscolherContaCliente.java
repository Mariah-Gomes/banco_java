
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.EscolherConta;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.ValorInicial;

public class ControllerEscolherContaCliente {
    
    private EscolherConta view;
    private String cpf;
    
    public ControllerEscolherContaCliente(EscolherConta view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void contaPoupanca(){
        Cliente cliente = new Cliente(cpf, "Poupança", 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Poupança Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
    public void contaCorrente(){
        Cliente cliente = new Cliente(cpf, "Corrente", 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Corrente Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
    public void contaSalario(){
        Cliente cliente = new Cliente(cpf, "Salário", 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Salário Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
