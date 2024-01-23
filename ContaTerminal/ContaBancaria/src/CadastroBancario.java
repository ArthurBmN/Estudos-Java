import java.util.Locale;
import java.util.Scanner;
public class CadastroBancario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println ("Digite seu nome completo");
        String nomeCompleto = scanner.next();

        System.out.println ("Digite seu CPF");
        String CPF = scanner.next();

        System.out.println ("Digite sua data de nascimento");
        String dataDeNascimento = scanner.next();

        scanner.close();

        System.out.println("Confirma os dados abaixo?");
        System.out.println("Seu nome é " + nomeCompleto);
        System.out.println("Seu cpf é " + CPF);
        System.out.println("Nasceu no dia " + dataDeNascimento);
    }
}
