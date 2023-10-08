// 9. (Tarefa 3) Faça um programa que leia uma frase e informe se ela é um palíndromo ou não.
// Uma frase é um palíndromo quando pode ser lida tanto da forma usual, quanto de trás para
// frente. O programa deve ignorar maiúsculas e minúsculas na avaliação. Insira as frases sem
// acentuação;
//  Dica: será necessário verificar os métodos disponíveis na classe String;
//  "Socorram-me, subi no ônibus em Marrocos”
//  "A Rita, sobre vovô, verbos atira."
//  "Olé! Maracujá, caju, caramelo."

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String input = scanner.nextLine();

        String limpaInput = input.replaceAll("[^a-zA-Z]","").toLowerCase();

        String inputReverso = new StringBuilder(limpaInput).reverse().toString();

        if (limpaInput.equals(inputReverso)){
            System.out.println("A frase digitada é um palindromo");
        } else {
            System.out.println("A frase digitada não é um palindromo");
        }
          
        scanner.close();
    }   
}
