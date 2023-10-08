/* Escreva um programa que tenha como entrada do usuário, através do
teclado, um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1, 2, 3, 5,
8, 13, 21, ...) até que o número da série seja maior que o número fornecido pelo
usuário. */

package javaapplication5;

import java.util.Scanner;

public class SerieFibonacci {
    private int limite;

    public SerieFibonacci(int limite) {
        this.limite = limite;
    }

    public void calcularEImprimirSerie() {
        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Série de Fibonacci até " + limite + ":");
        System.out.print(numeroAnterior + ", " + numeroAtual);
        
        while (numeroAtual + numeroAnterior <= limite) {
            int proximoNumero = numeroAnterior + numeroAtual;
            System.out.print(", " + proximoNumero);
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int limite = scanner.nextInt();

        SerieFibonacci fibonacci = new SerieFibonacci(limite);
        fibonacci.calcularEImprimirSerie();

        scanner.close();
    }
}

