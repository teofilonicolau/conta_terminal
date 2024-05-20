import java.util.Scanner;

/**
 * Esta classe permite que o usuário insira informações sobre uma conta bancsria via terminal
 * e exibe uma mensagem com as informações inseridas.
 */
public class ContaTerminal {

    /**
     * Metodo principal para executar o programa.
     *
     * @param args os argumentos de linha de comando (nao utilizados neste programa)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com as informaços inseridas
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close(); // Fechar o Scanner apos o uso
    }
}
