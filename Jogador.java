public class Jogador {
    private String nome;
    private double saldo;
    private int idade;

    public Jogador(String nome, double saldo, int idade) {
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
    }

    public boolean apostar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void receberPremio(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}