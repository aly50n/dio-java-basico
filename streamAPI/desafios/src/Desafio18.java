/*Desafio 18 - Verifique se todos os números da lista são iguais:
* Utilizando a Stream API, verifique se todos os números da lista são 
* iguais e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosNumerosIguais = numeros.stream()
                .distinct()
                .toList()
                .size() == 1;

        if (todosNumerosIguais) {
            System.out.println("Todos os números da lista são iguais!");
        } else {
            System.out.println("Há números diferentes na lista!");
        }

    }
}
