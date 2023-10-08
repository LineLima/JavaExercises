/*2. (Tarefa 3) Construa um programa que seja capaz de efetuar a média de todos os argumentos
 inteiros ou reais recebidos do teclado e imprimi-los. Argumentos inválidos devem ser desconsiderados 
 (Imprimir uma mensagem para cada valor inválido.), sem provocar a
 exibição de exceções (Exiba uma mensagem para o usuário pedindo a ele que informe
novamente o valor). O usuário deve digitar S quando desejar encerrar a entrada de dados; */



import java.util.Scanner;

public class MediaArgumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double quantidade = 0;

        System.out.println("Digite valores inteiros ou reais (digite 's' para encerrar):");
        while (true) {
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("s")) {
                break;
            }

            if (isNumeroValido(entrada)) {
                double valor = Double.parseDouble(entrada);
                soma += valor;
                quantidade++;
            } else {
                System.out.println("Valor inválido. Por favor, informe um valor válido.");
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A média dos valores digitados é: " + media);
        } else {
            System.out.println("Nenhum valor válido foi informado.");
        }

        scanner.close();
    }

    public static boolean isNumeroValido(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
