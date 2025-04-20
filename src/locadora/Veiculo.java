package locadora;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private boolean disponivel;
    private int valorAluguel;

    public Veiculo(String modelo, String marca, int ano, int valorAluguel){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorAluguel = valorAluguel;
        this.disponivel = true;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public int getValorAluguel(){
        return valorAluguel;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String toString(){
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", disponivel=" + disponivel +
                '}';

    }


}

