
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.DebitarCliente;
import view.InicioCliente;
import model.Cliente;

public class ControllerInicioCliente {
    private InicioCliente view;
    private Cliente cliente;

    public ControllerInicioCliente(InicioCliente view, Cliente cliente) {
        this.view = view;
        this.cliente = cliente;
    }
    
}
