// 12. (Tarefa 3) Escreva um programa que calcule a soma das diagonais principal e
// secundária. O programa deve perguntar ao usuário a dimensão da matriz. Baseado na
// dimensão da matriz o programa deve pedir ao usuário para preencher os valores da matriz
// (faça um método estático que receba a referência de uma matriz e a preencha). Com a matriz
// preenchida faça outro método estático que calcule a soma das diagonais. Imprima o
// resultado.

import java.util.Scanner;

public class SomaDiagonais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz (n x n): ");
        int dimensao = scanner.nextInt();

        int[][] matriz = new int[dimensao][dimensao];

        preencherMatriz(matriz);

        int somaDiagonais = calcularSomaDiagonais(matriz);

        System.out.println("A soma das diagonais principal e secundária é: " + somaDiagonais);
        scanner.close();
    }

    public static void preencherMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static int calcularSomaDiagonais(int[][] matriz) {
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        return somaDiagonalPrincipal + somaDiagonalSecundaria;
    }
}
