import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome e sobrenome !");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo para realizar o saque");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."); 
    

    }
}
