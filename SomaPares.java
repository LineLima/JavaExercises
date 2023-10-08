// 3. (Tarefa 3) Faça uma classe executável que dado um conjunto de 20 elementos numéricos,
// informe a soma de todos os números pares. Faça a validação de dados inválidos informando
// o usuário, e fazendo-o repetir a digitação.

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int somaPares = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            boolean entradaValida = false;

            while (!entradaValida) {
                if (scanner.hasNextInt()) {
                    vetor[i] = scanner.nextInt();
                    entradaValida = true;
                } else {
                    System.out.println("Valor inválido. Por favor, informe um número válido.");
                    scanner.next();  
                }
            }

            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        scanner.close();
    }
}
