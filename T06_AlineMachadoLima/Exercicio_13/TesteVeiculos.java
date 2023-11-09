package Exercicio_13;

import java.util.Scanner;

public class TesteVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos veículos deseja informar? ");
        int quantidadeVeiculos = scanner.nextInt();
        Veiculo[] veiculos = new Veiculo[quantidadeVeiculos];

        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println("Informe os dados do veículo " + (i + 1) + ":");
            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.print("Cor: ");
            String cor = scanner.next();
            System.out.print("Tipo de veículo (1 - Terrestre, 2 - Aéreo, 3 - Aquático): ");
            int tipoVeiculo = scanner.nextInt();

            switch (tipoVeiculo) {
                case 1:
                    veiculos[i] = new VeiculoTerrestre(modelo, cor);
                    break;
                case 2:
                    veiculos[i] = new VeiculoAereo(modelo, cor);
                    break;
                case 3:
                    veiculos[i] = new VeiculoAquatico(modelo, cor);
                    break;
                default:
                    System.out.println("Tipo de veículo inválido.");
                    i--;  
                    break;
            }
        }

        for (Veiculo veiculo : veiculos) {
            veiculo.andar();
        }
    }
}

