// 3. (Tarefa 4) Crie uma classe para representar um Ponto3D, com atributos e
// métodos (x, y, z, cor, intensidade). Crie os métodos gets e sets. Crie os
// seguintes métodos:
// a. public double caluclaDistancia(Ponto3D p) -> recebe como parâmetro
// um ponto 3D, e retorna a distância entre o objeto específico e o ponto.
// b. public static void main(String args[]) -> Criar uma nova classe chamada
// UsaPonto3D e um método principal que faz testes utlizando a função
// calculaDistancia
package Exercicio_03;

public class UsaPonto3D {
    public static void main(String[] args){
        Ponto3D pontoA = new Ponto3D(1, 2, 3,"branco", 3);
        Ponto3D pontoB = new Ponto3D(4, 5, 6, "preto", 2);
        
        double distancia = pontoA.calculaDistancia(pontoB);

        System.out.println("A distancia entre o ponto A e o ponto B é: " + distancia);

    }
}
