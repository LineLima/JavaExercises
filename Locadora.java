/*Faça uma classe executável que dados a quantidade de DVDs
que uma vídeo locadora possui e o valor que ela cobra por cada aluguel,
informe */

package javaapplication5;

public class Locadora {
    
    public static void main(String[] args){
        //quantidade de dvds e aluguel aleatórios
        int quantidade = 200;
        double valorAluguel = 5;
        
        //faturamento anual se dá através do aluguel de 1/3 dos dvds multiplicado por 12 meses
        double faturamentoAnual = (quantidade/3) * valorAluguel * 12;
        
        //valor ganho com multas é 10% do valor do aluguel, 10% das fitas alugadas.
        double ganhoMultasMensal = (quantidade/3) * (0.10 * valorAluguel) * 0.10;
        
        //formatação de saída
        String faturamentoAnualFormatado = String.format("R$ %.2f", faturamentoAnual);
        String ganhoMultasMensalFormatado = String.format("R$ %.2f", ganhoMultasMensal);
        
        System.out.println("Faturamento anual: " + faturamentoAnualFormatado);
        System.out.println("Ganho mensal com multas: " + ganhoMultasMensalFormatado);
    }
}
