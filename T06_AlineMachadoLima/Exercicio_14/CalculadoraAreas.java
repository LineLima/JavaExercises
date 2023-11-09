package Exercicio_14;

public class CalculadoraAreas {
    public static double somarAreas(FiguraGeometrica[] figuras) {
        double soma = 0;
        for (FiguraGeometrica figura : figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }
}

