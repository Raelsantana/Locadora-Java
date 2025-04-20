package locadora;

public class Carro extends Veiculo{

    private int quantPortas;

    public Carro(String modelo, String marca, int ano, int valorAluguel, int quantPortas) {
        super(modelo, marca, ano, valorAluguel);
        this.quantPortas = quantPortas;

    }

    public int verificarPortas(){
        return quantPortas;
    }
}
