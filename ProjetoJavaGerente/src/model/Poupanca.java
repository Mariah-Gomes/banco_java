
package model;

public class Poupanca extends TipoConta{

    public Poupanca() {
    }

    public Poupanca(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    public String poupanca(){
        return "Poupança";
    }
    
}
