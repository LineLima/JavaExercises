/* Faça uma classe executável que dados a distância percorrida (em
Km) e o tempo gasto em uma viagem (em horas), informe a velocidade
média do carro, sabendo que Velocidade = S / T (variação de distância /
variação do tempo). Imprima o valor com duas casas decimais. */

package javaapplication5;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância (em quilômetros): ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Digite o tempo (em horas): ");
        double horas = scanner.nextDouble();
        
        double velocidadeMedia = distancia / horas;
        
        String velocidadeFormatada = String.format("%.2f", velocidadeMedia);
        
        System.out.println("A velocidade média é: " + velocidadeFormatada + " km/h");
        
        scanner.close();
    }
}
