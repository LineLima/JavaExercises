/*Construa um programa que leia os coeficientes de uma equação
do segundo grau do teclado e mostre os valores de x da equação;*/

package javaapplication5;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    private double a, b, c;
    
    public EquacaoSegundoGrau(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double calcularDelta(){
        return (b * b) - 4 * a * c;
    }
    
    public void calcularRaizes(){
        double delta = calcularDelta();
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação tem uma raiz real: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        scanner.close();

      
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
        equacao.calcularRaizes();
    }
}
