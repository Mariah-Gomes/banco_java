
package controller;

import view.MenuGerente;
import view.CadastrarCliente;
import view.ExcluirCliente;
import view.CriarConta;
// Exibir contas
import view.ExibirSaldo;

public class ControllerPaginasMenuGerente {
    
    private MenuGerente view;

    public ControllerPaginasMenuGerente(MenuGerente view) {
        this.view = view;
    }
    
    public void entrarCadastrarCliente(){
        CadastrarCliente viewCadastrarCliente = new CadastrarCliente();
        viewCadastrarCliente.setVisible(true);
        view.setVisible(false);
    }
    
    public void entrarExcluirCliente(){
        ExcluirCliente viewExcluirCliente = new ExcluirCliente();
        viewExcluirCliente.setVisible(true);
        view.setVisible(false);
    }
    
    public void entrarCriarConta(){
        CriarConta viewCriarConta = new CriarConta();
        viewCriarConta.setVisible(true);
        view.setVisible(false);
    }
    
    // Exibir contas
    
    public void entrarExibirSaldo(){
        ExibirSaldo viewExibirSaldo = new ExibirSaldo();
        viewExibirSaldo.setVisible(true);
        view.setVisible(false);
    }
    
}
