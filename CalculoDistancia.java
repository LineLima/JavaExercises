/*Construa um programa que leia do teclado dois pontos em um
plano (x,y) e informe a distância entre eles.*/

package javaapplication5;

import java.util.Scanner;

public class CalculoDistancia {
    private double x1, y1, x2, y2;
    
    public CalculoDistancia(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double calcularDistancia(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();
        System.out.print("Digite a coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        scanner.close();

        CalculoDistancia calculadora = new CalculoDistancia(x1, y1, x2, y2);
        double distancia = calculadora.calcularDistancia();

        System.out.println("A distância entre os dois pontos é: " + distancia);
    }
}








