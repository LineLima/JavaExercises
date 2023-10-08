// 6. (Tarefa 3) Escreva um programa que leia do teclado 7 valores reais correspondentes ao
// índice pluviométrico diário de uma semana. Após a leitura, o programa deve determinar o
// índice pluviométrico médio, máximo e mínimo com o respectivo dia da ocorrência;

import java.util.Scanner;

public class IndicePluviometricoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaIndice = 0;
        double indiceMinimo = Double.MAX_VALUE; 
        double indiceMaximo = Double.MIN_VALUE; 
        double[] indiceDiario = new double[7];
        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado", "Domingo"};
        String diaMaximo = "";
        String diaMinimo = "";

        System.out.println("Digite 7 valores para o índice diário pluviométrico correspondente a cada dia:");
        for (int i = 0; i < 7; i++) {
            System.out.println(diasSemana[i] + " :");
            indiceDiario[i] = scanner.nextDouble();
            somaIndice += indiceDiario[i];

            if (indiceDiario[i] > indiceMaximo) {
                indiceMaximo = indiceDiario[i];
                diaMaximo = diasSemana[i];
            }
            if (indiceDiario[i] < indiceMinimo) {
                indiceMinimo = indiceDiario[i];
                diaMinimo = diasSemana[i];
            }
        }

        double indiceMedio = somaIndice / 7;

        System.out.println("Índice pluviométrico médio: " + indiceMedio);
        System.out.println("O índice pluviométrico máximo foi de " + indiceMaximo + " ocorrido em " + diaMaximo);
        System.out.println("O índice pluviométrico mínimo foi de " + indiceMinimo + " ocorrido em " + diaMinimo);

        scanner.close();
    }
}
