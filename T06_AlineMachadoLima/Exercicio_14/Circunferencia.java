package Exercicio_14;

public class Circunferencia extends FiguraGeometrica {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

