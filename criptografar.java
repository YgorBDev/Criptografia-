
class criptografar {

public static String criptografar(String mensagem, int chave) {
    StringBuilder resultado = new StringBuilder();
    
    for (int i = 0; i < mensagem.length(); i++) {
        char c = mensagem.charAt(i);
        
    
        if (c == ' ') {
            resultado.append(' ');
        } else if (Character.isLetter(c)) {
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            int originalPos = c - base;
            int novaPos = (originalPos + chave) % 26;
            char novoChar = (char) (base + novaPos);
            resultado.append(novoChar);
        }
    }
    
    return resultado.toString();
}
}
