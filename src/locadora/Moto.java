package locadora;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String modelo, String marca, int ano, int valorAluguel, int cilindrada){
        super(modelo, marca, ano, valorAluguel);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

}
