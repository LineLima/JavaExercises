// 13. (Tarefa 3)Faça um programa que calcule o desvio padrão de um determinado número
// de amostras. O número de amostras deve ser pedido ao usuário no início do programa.
// Utilize array para armazenar as amostras. Os valores das amostras devem ser digitadas pelo
// usuário, uma a uma, como números decimais.


import java.util.Scanner;

public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de amostras: ");
        int numAmostras = scanner.nextInt();
        
        double[] amostras = new double[numAmostras];
        
        for (int i = 0; i < numAmostras; i++) {
            System.out.print("Digite a amostra " + (i + 1) + ": ");
            amostras[i] = scanner.nextDouble();
        }
        
        double media = calcularMedia(amostras);
        double desvioPadrao = calcularDesvioPadrao(amostras, media);
        
        System.out.println("A média das amostras é: " + media);
        System.out.println("O desvio padrão das amostras é: " + desvioPadrao);
    }
    
    public static double calcularMedia(double[] amostras) {
        double soma = 0;
        for (double amostra : amostras) {
            soma += amostra;
        }
        return soma / amostras.length;
    }
    
    public static double calcularDesvioPadrao(double[] amostras, double media) {
        double somaDiferencasQuadradas = 0;
        for (double amostra : amostras) {
            double diferenca = amostra - media;
            somaDiferencasQuadradas += diferenca * diferenca;
        }
        double variancia = somaDiferencasQuadradas / amostras.length;
        return Math.sqrt(variancia);
    }
}

