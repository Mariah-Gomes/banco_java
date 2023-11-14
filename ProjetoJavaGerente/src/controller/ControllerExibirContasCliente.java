
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExibirContas;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerExibirContasCliente {
    
    private ExibirContas view;

    public ControllerExibirContasCliente(ExibirContas view) {
        this.view = view;
    }
    
    public void exibirContas(){
        ArrayList<Cliente> clientesComConta = new ArrayList<>();
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            clientesComConta = dao.consultarContasCliente();
            if (!clientesComConta.isEmpty()) {
                StringBuilder textoClientes = new StringBuilder();
                for(Cliente cliente : clientesComConta){
                    textoClientes.append("Nome: ").append(cliente.getNome()).append("\n");
                    textoClientes.append("CPF: ").append(cliente.getCpf()).append("\n");
                    textoClientes.append("Tipo de Conta: ").append(cliente.getTipoConta()).append("\n");
                    textoClientes.append("Saldo: ").append(cliente.getSaldo()).append("\n");
                    textoClientes.append("Senha: ").append(cliente.getSenha()).append("\n\n");
                }
                view.getTxtSaidaExibirContas().setText(textoClientes.toString());
                JOptionPane.showMessageDialog(view,
                        "Contas consultadas com sucesso", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view,
                        "Nenhuma conta encontrada", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
