import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis que irão armazenar os dados fornecidos pelo usuário
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        
        // Limpa o buffer de entrada para ler uma string corretamente após ler um inteiro
        scanner.nextLine();
        
        // Solicita a agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();
        
        // Solicita o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        
        // Solicita o saldo da conta
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        
        // Exibe a mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
                           "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + 
                           saldo + " já está disponível para saque.");
        
        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
