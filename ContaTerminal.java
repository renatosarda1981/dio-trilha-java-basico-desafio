import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Double saldoConta = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco da DIO!");
        System.out.println("Você está no canal de consulta de saldo, vamos precisar das informações a seguir para continuar.");


        System.out.println("Por favor, digite o número da sua agência: ");
            int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua conta: ");
             int numeroConta = scanner.nextInt();

        
        System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

        System.out.println("Agora digite o seu sobrenome: ");
            String sobrenome = scanner.next();

        //Imprimindo dados Obtidos pelo usuario

        System.out.println("Olá, " + nome + "  " + sobrenome + ". Obrigado pela confiança em escolher o nosso Banco DIO, ");
        System.out.println("Sua agência é  " + numeroAgencia + ", conta número " + numeroConta + ".");
        System.out.println("Seu saldo é de R$ " + saldoConta + " e está disponivel para saque! ");

    }
}
