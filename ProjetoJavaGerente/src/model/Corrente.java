
package model;

public class Corrente extends TipoConta{

    public Corrente() {
    }

    public Corrente(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    public String corrente(){
        return "Corrente";
    }
    
}
