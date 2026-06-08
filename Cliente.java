public class Cliente {
    
    private String nome;
    private String cpf;
    private String email;
    private double saldo;

    public Cliente(String nome, String cpf, String email, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        if (valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
    if (valor <= 0) {
        return false;
    }

    saldo += valor;
    return true;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Email: %s | Saldo: R$%.2f",
                nome, cpf, email, saldo);
    }
}