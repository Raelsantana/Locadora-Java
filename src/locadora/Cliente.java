package locadora;

public class Cliente {
    private String nome;
    private int saldo;

    public Cliente(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public int getSaldo(){
        return saldo;
    }
    public void depositar(int valor){
        this.saldo += valor;
    }
    public void debitoAlugar(Veiculo veiculo){
        this.saldo -= veiculo.getValorAluguel();
    }
}
