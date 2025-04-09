
import java.util.Random;
import java.util.Scanner;

public class Criptografia { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.println("3 - Sair");
            escolha = scanner.nextInt();
            System.out.println(" ");
        switch (escolha) {
            case 1:
                scanner.nextLine(); 
                System.out.println("Digite a mensagem que deseja criptografar:");
                String mensagem = scanner.nextLine();

                Random random = new Random();
                int chave = random.nextInt(25) + 1;

                String mensagemCriptografada = criptografar.criptografar(mensagem, chave);
        
                System.out.println("Mensagem criptografada: " + mensagemCriptografada);
                System.out.println(" ");
                break;

            case 2:
                scanner.nextLine(); 
                System.out.println("Digite a mensagem criptografada:");
                String mensagem1 = scanner.nextLine();
    
                for (int chave1 = 0; chave1 < 26; chave1++) {
                    String resultado = Descriptografar.descriptografar(chave1, mensagem1);

                    System.out.println("Chave: " + chave1);
                    System.out.println("Mensagem descriptografada: " + resultado);
                    System.out.println("A mensagem está correta? (s/n)");
                    String resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        System.out.println("Mensagem descriptografada corretamente!");
                        break;
                    }
                }
                System.out.println(" ");
                break;
            case 3:
                System.out.println("Saindo...");
                System.out.println(" ");
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.println(" ");
        } 
    }while (escolha!=3);
     scanner.close();
    }
}
