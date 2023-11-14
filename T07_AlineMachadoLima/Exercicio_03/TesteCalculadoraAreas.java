package Exercicio_03;

public class TesteCalculadoraAreas {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[1]; 

        try {
            figuras[0] = new Retangulo(-4, 5);

            double somaAreas = CalculadoraAreas.somarAreas(figuras);

            System.out.println("A soma das áreas é: " + somaAreas);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
