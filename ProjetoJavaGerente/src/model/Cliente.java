
package model;

public class Cliente extends Pessoa{
    
    protected String cpf, tipoConta;
    protected double saldo;

    public Cliente() {
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, double saldo) {
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public Cliente(String cpf, String tipoConta, double saldo, String nome,
            String senha) {
        super(nome, senha);
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", tipoConta=" + tipoConta +
                ", saldo=" + saldo + '}' + "Pessoa{" + "nome=" + nome +
                ", senha=" + senha + '}';
    }
    
}
