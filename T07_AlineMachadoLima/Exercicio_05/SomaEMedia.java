package Exercicio_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double soma = 0;

        System.out.println("Informe os números na sequência solicitada.");
        System.out.println("Para sair, digite 'S'.");

        while (true) {
            try {
                System.out.print("Numero " + (count + 1) + "=");
                String input = scanner.next();

                if (input.equalsIgnoreCase("S")) {
                    break; 
                }

                double numero = Double.parseDouble(input);
                soma += numero;
                count++;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Erro de entrada.");
                System.out.println(scanner.next() + " não é um numérico válido. Tente novamente ou digite 'S' para sair.");
            }
        }

        if (count > 0) {
            double media = soma / count;
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}

