
package model;
import view.DebitarClienteValor;


public class Salario extends TiposDeConta{

    public Salario() {
    }

    public Salario(double taxa, double limite) {
        super(taxa, limite);
    }
    
    public void calculoTaxaDebitoSalario(){
        taxa = 0.05;
//        double valorTaxa = Double.parseDouble(get.valorCienteDebitarEntrada()) * taxa;
//        if (valorTaxa > limite){
//            System.out.println("Não foi possível realizar a operação");
//        }
//        else{
//            limite = limite - valorTaxa;
//        }
    }
}
