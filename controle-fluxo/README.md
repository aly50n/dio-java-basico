# DIO - Trilha Java Básico
[www.dio.me](https://www.dio.me)

## Autores
- Gleyson Sampaio

## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de **Controle de Fluxo** codificando o seguinte cenário:

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros. Com esses dois números, você deverá obter a quantidade de interações (usando um loop `for`) e realizar a impressão no console (`System.out.print`) dos números incrementados.

### Exemplo:
Se você passar os números 12 e 30, o programa deverá fazer uma interação com 18 ocorrências para imprimir os números, por exemplo:
"Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

Se o primeiro parâmetro for **MAIOR** que o segundo, você deverá lançar a exceção customizada chamada `ParametrosInvalidosException` com a mensagem:
"O segundo parâmetro deve ser maior que o primeiro"

### Passos para o Desafio:
1. Crie o projeto **DesafioControleFluxo**.
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do programa.
3. Crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

### Código Base:

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
```
### Classe de Exceção:
```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
```
Instruções:
Use Scanner para capturar os parâmetros do usuário.
Lance a exceção ParametrosInvalidosException se o primeiro parâmetro for maior que o segundo.
Utilize o loop for para imprimir os números de 1 até a diferença entre os dois parâmetros.