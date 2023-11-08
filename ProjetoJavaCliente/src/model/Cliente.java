
package model;

public class Cliente {
    private String cpf;
    private String tipoConta;
    private String nome;
    private String senha;
    private double valorConta;

    public Cliente() {
    }

    public Cliente(String cpf, String tipoConta, String nome, String senha, double valorConta) {
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.nome = nome;
        this.senha = senha;
        this.valorConta = valorConta;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", tipoConta=" + tipoConta + ", nome=" + nome + ", senha=" + senha + ", valorConta=" + valorConta + '}';
    }
    
}
