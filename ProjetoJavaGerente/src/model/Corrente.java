
package model;

public class Corrente extends TipoConta{

    public Corrente() {
    }

    public Corrente(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    // Função para retornar o nome da conta.
    public String corrente(){
        return "Corrente";
    }
    
}
