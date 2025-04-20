package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome;
    private List<Veiculo> veiculos;
    private boolean disponivel;

    public Locadora(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
        this.disponivel = true;
    }

    public String getNome(){
        return nome;
    }

    public void AdicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }


    public void alugar(Veiculo veiculo, Cliente cliente){
        if(veiculo.isDisponivel() && cliente.getSaldo() >= veiculo.getValorAluguel()){
            this.veiculos.remove(veiculo);
            System.out.println("A " + getNome() + " agradece ao nosso cliente "+ cliente.getNome()+" pela preferência. " + "O Veiculo "+ veiculo.getModelo() + " foi alugado com sucesso.");
            cliente.debitoAlugar(veiculo);
            this.disponivel = false;

        }else if(cliente.getSaldo() < veiculo.getValorAluguel()){
            System.out.println("Você não possui saldo suficiente para completar essa transação.");
        }

        else{
            System.out.println("O veiculo " + veiculo.getModelo() + " não está disponivel no momento." );
        }
    }

    public void devolverVeiculo(Veiculo veiculo, Cliente cliente){
        if (this.disponivel == false){
            System.out.println("Olá " + cliente.getNome() + ", o veiculo foi devolvido com sucesso.");
            veiculos.add(veiculo);
            this.disponivel = true;

        }else{
            System.out.println("Não é possivel devolver o veiculo.");
        }
    }
}