// 11. (Tarefa 3) Construa um programa que calcule o determinante de uma matriz 3 x 3
// fornecida pelo usuário;

import java.util.Scanner;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] matrix = new double[3][3];
        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double determinant = calculateDeterminant(matrix);

        System.out.println("O determinante da matriz é: " + determinant);
        scanner.close();
    }

    public static double calculateDeterminant(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("A matriz deve ser 3x3.");
        }

        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[0][2];
        double d = matrix[1][0];
        double e = matrix[1][1];
        double f = matrix[1][2];
        double g = matrix[2][0];
        double h = matrix[2][1];
        double i = matrix[2][2];

        return (a * (e * i - f * h)) - (b * (d * i - f * g)) + (c * (d * h - e * g));
    }
}
