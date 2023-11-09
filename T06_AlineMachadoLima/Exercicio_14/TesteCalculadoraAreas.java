package Exercicio_14;

public class TesteCalculadoraAreas {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Retangulo(4, 5);
        figuras[1] = new Triangulo(3, 7);
        figuras[2] = new Circunferencia(2);

        double somaAreas = CalculadoraAreas.somarAreas(figuras);

        System.out.println("A soma das áreas é: " + somaAreas);
    }
}

