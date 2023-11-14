package Exercicio_03;

public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Os lados do retângulo não podem ser negativos.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
