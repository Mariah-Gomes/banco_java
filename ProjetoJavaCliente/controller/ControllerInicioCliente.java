
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.DebitarCliente;
import view.InicioCliente;
import model.Cliente;
import view.DepositarCliente;
import view.ExibirExtratoCliente;
import view.ExibirSaldoCliente;

public class ControllerInicioCliente {
    private InicioCliente view;

    public ControllerInicioCliente(InicioCliente view) {
        this.view = view;
    }
    
    public void debitarCliente(){
        DebitarCliente viewDebitarCliente = new DebitarCliente();
        viewDebitarCliente.setVisible(true);
    }
    
    public void depositarCliente(){
        DepositarCliente viewDepositarCliente = new DepositarCliente();
        viewDepositarCliente.setVisible(true);
    }
    
    public void exibirExtratoCliente(){
        ExibirExtratoCliente viewExibirExtratoCliente = new ExibirExtratoCliente();
        viewExibirExtratoCliente.setVisible(true);
    }
    
    public void exibirSaldoCliente(){
        ExibirSaldoCliente viewExibirSaldoCliente = new ExibirSaldoCliente();
        viewExibirSaldoCliente.setVisible(true);
    }
}
