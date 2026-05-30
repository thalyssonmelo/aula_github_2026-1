import java.util.Scanner;

public class ClienteService {
    
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
}