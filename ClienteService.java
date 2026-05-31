import java.util.Scanner;

public class ClienteService {
    private final Scanner scanner;

    public ClienteService(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente createCliente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine()); 
        scanner.close();

        return new Cliente(nome, cpf, email, saldo);
    }

    public void realizarSaque(Cliente cliente) {
        System.out.print("Valor do saque: ");
        double valor = Double.parseDouble(scanner.nextLine());
        boolean ok = cliente.sacar(valor);
        if (ok) {
            System.out.println("Saque realizado. Saldo atual: R$" + String.format("%.2f", cliente.getSaldo()));
        } else {
            System.out.println("Saque recusado. Verifique valor e saldo.");
        }
    }

    public void realizarDeposito(Cliente cliente) {
    System.out.print("Valor do depósito: ");
    double valor = Double.parseDouble(scanner.nextLine());

    boolean ok = cliente.depositar(valor);

    if (ok) {
        System.out.println("Depósito realizado. Saldo atual: R$" +
                String.format("%.2f", cliente.getSaldo()));
    } else {
        System.out.println("Valor inválido.");
    }
    }
}