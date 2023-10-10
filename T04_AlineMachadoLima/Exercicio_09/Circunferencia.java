// 9. (Tarefa 4) Crie uma classe Circunferencia, que armazene o valor do raio e
// seja capaz de informar sua área. Crie uma classe UsaCircunferencia para
// testar objetos da classe Circunferencia

package Exercicio_09;

public class Circunferencia {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
