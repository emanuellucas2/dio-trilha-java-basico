import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
            
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.print("Por favor, digite o seu Nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.print("Por favor, digite o Saldo: ");
            double saldo = scanner.nextDouble();
            
            String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
            System.out.println(mensagem);
            scanner.close();
            
        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, certifique-se de que os valores numéricos estão corretos e use ponto como separador decimal.");
        }
    }
}
