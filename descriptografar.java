
import java.util.Scanner;

class Descriptografar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a mensagem criptografada:");
        String mensagem = scanner.nextLine();

        for (int chave = 0; chave < 26; chave++) {
            String resultado = descriptografar(chave, mensagem);
            System.out.println("Chave: " + chave);
            System.out.println("Mensagem descriptografada: " + resultado);
            System.out.println("A mensagem está correta? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Mensagem descriptografada corretamente!");
                break;
            }
        }
    }

    public static String descriptografar(int chave, String mensagem) {
        StringBuilder resultado = new StringBuilder();

        for (char c : mensagem.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                resultado.append((char) ((c - base - chave + 26) % 26 + base));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();   
    }
}