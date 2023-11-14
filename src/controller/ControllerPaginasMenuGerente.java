
package controller;

import view.MenuGerente;
import view.CadastrarCliente;
import view.ExcluirCliente;
import view.CriarConta;
import view.ExibirContas;
import view.ExibirSaldo;

public class ControllerPaginasMenuGerente {
    
    private MenuGerente view;

    public ControllerPaginasMenuGerente(MenuGerente view) {
        this.view = view;
    }
    
    public void entrarCadastrarCliente(){
        CadastrarCliente viewCadastrarCliente = new CadastrarCliente();
        viewCadastrarCliente.setVisible(true);
    }
    
    public void entrarExcluirCliente(){
        ExcluirCliente viewExcluirCliente = new ExcluirCliente();
        viewExcluirCliente.setVisible(true);
    }
    
    public void entrarCriarConta(){
        CriarConta viewCriarConta = new CriarConta();
        viewCriarConta.setVisible(true);
    }
    
    // Exibir contas
    public void entrarExibirContas(){
        ExibirContas viewExibirContas = new ExibirContas();
        viewExibirContas.setVisible(true);
    }
    
    public void entrarExibirSaldo(){
        ExibirSaldo viewExibirSaldo = new ExibirSaldo();
        viewExibirSaldo.setVisible(true);
    }
    
}
