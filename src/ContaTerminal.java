
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = 0; 
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = 0;
        saldo = scanner.nextDouble();
        scanner.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";


        System.out.println(mensagem);
    }
}
