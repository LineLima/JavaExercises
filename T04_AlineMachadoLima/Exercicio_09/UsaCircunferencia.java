// 9. (Tarefa 4) Crie uma classe Circunferencia, que armazene o valor do raio e
// seja capaz de informar sua área. Crie uma classe UsaCircunferencia para
// testar objetos da classe Circunferencia


package Exercicio_09;


public class UsaCircunferencia {
    public static void main(String[] args){
        Circunferencia circuloA = new Circunferencia(5.0);
        Circunferencia circuloB = new Circunferencia(4);

        double areaA = circuloA.calcularArea();
        double areaB = circuloB.calcularArea();

        System.out.println("Area do circulo A: " + areaA);
        System.out.println("Area do circulo B: " + areaB);
        
    }
}
