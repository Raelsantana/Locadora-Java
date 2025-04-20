package locadora;

public class Main {
    public static void main(String[] args) {

        Locadora locSempre = new Locadora("LocSempre");
        Cliente cliente1 = new Cliente("Rael", 1980);
        Cliente cliente2 = new Cliente("José Carlos", 90);

        Veiculo v1 = new Veiculo("Gol", "Volks", 2015, 1000);

        locSempre.AdicionarVeiculo(v1);
        locSempre.alugar(v1, cliente1);
        System.out.println(cliente1.getSaldo()+"R$");
        cliente1.depositar(500);
        System.out.println(cliente1.getSaldo()+"R$");

        locSempre.devolverVeiculo(v1, cliente1);
        locSempre.devolverVeiculo(v1, cliente1);
        locSempre.alugar(v1, cliente1);
        locSempre.devolverVeiculo(v1, cliente1);

        System.out.println("fim dos testes com a instancia 'Rael'");
        locSempre.alugar(v1, cliente2);
        System.out.println(v1.toString());

    }


}
