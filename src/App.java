import Pacote2.Cliente;
import Pacote2.Mecanico;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente clt = new Cliente();
        Mecanico mco = new Mecanico();

        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */



        System.out.println("Qual é o nome do cliente? ");
        System.out.println("O nome do cliente é: " + Cliente.getNome(sc.nextLine()));

        System.out.println("\nQual é o modelo do carro do cliente? ");
        System.out.println("O modelo do carro do cliente é: " + Cliente.getModeloCarro(sc.nextLine()));



        System.out.println("\nQual é o nome do mecânico que irá fazer a manutenção? ");
        System.out.println("O nome do mecânico é: " + Mecanico.getNome(sc.nextLine()));

        System.out.println("\nQuanto vai ficar o orçamento da manutenção do carro do cliente?");
        System.out.println("O orçamento vai ficar: " + Mecanico.getOrcamento(sc.nextLine()));
    }
}
