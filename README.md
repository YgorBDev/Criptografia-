# 🔐 Projeto de Criptografia em Java

Este projeto em Java implementa um sistema simples de **criptografia e descriptografia** baseado na cifra de César. O usuário pode criptografar mensagens com uma chave aleatória e tentar descriptografá-las manualmente testando todas as possibilidades (força bruta).

## 📁 Arquivos do Projeto

- `Criptografia.java`: Classe principal com o menu de interação.
- `criptografar.java`: Classe com a lógica de criptografia da mensagem.
- `descriptografar.java`: Classe com a lógica de descriptografia por força bruta.

---

## 🚀 Como executar

### Pré-requisitos

- JDK instalado (Java 8+)

### Compilação

```bash
javac Criptografia.java criptografar.java descriptografar.java
```

### Execução

```bash
java Criptografia
```

---

## 📋 Funcionalidades

1. **Criptografar** uma mensagem com uma chave aleatória de 1 a 25.
2. **Descriptografar** uma mensagem tentando todas as possíveis chaves e pedindo ao usuário confirmar quando a mensagem estiver correta.
3. **Sair** do programa.

---

## 🛠 Exemplo de uso

```plaintext
1 - Criptografar
2 - Descriptografar
3 - Sair
```

Ao escolher "1", o usuário digita uma mensagem e recebe como saída a mensagem criptografada.

Ao escolher "2", o usuário digita a mensagem criptografada e o programa testa todas as 26 chaves até o usuário reconhecer a mensagem original.

---

## 📌 Observações

- A criptografia ignora espaços e preserva letras maiúsculas e minúsculas.
- Este projeto é ideal para fins educacionais e entendimento básico de criptografia clássica.

---

## 👨‍💻 Autor

- Feito por Ygor

---
