/* Implemente um programa que calcule o bônus anual de um funcionário
de uma empresa.*/

package javaapplication5;

import java.util.Scanner;

public class CalculoBonusFuncionario {
    private String cargo;
    private double salario;
    private double bonusAnual;
    
    public CalculoBonusFuncionario(String cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
        calcularBonus();
    }
    
    private void calcularBonus(){
         if (cargo.equalsIgnoreCase("Diretor")) {
            System.out.print("Digite a quantidade de departamentos gerenciados: ");
            Scanner scanner = new Scanner(System.in);
            int qtdDepartamentos = scanner.nextInt();
            scanner.close();
            bonusAnual = 4 * salario + 3000.0 * qtdDepartamentos;
        } else if (cargo.equalsIgnoreCase("Gerente")) {
            System.out.print("Digite a quantidade de pessoas gerenciadas: ");
            Scanner scanner = new Scanner(System.in);
            int qtdPessoasGerenciadas = scanner.nextInt();
            scanner.close();
            bonusAnual = 2 * salario + 100.0 * qtdPessoasGerenciadas;
        } else if (cargo.equalsIgnoreCase("Analista")) {
            bonusAnual = salario;
        } else if (cargo.equalsIgnoreCase("Programador")) {
            bonusAnual = 0.8 * salario;
        } else if (cargo.equalsIgnoreCase("Auxiliar de Limpeza")) {
            bonusAnual = 0.5 * salario;
        } else {
            System.out.println("Cargo não reconhecido. Bônus anual não calculado.");
        }
    }
    
     public void exibirBonusAnual() {
        System.out.println("O bônus anual do funcionário é: R$ " + bonusAnual);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();
        System.out.print("Digite o salário atual do funcionário: ");
        double salario = scanner.nextDouble();

        CalculoBonusFuncionario funcionario = new CalculoBonusFuncionario(cargo, salario);
        funcionario.exibirBonusAnual();

        scanner.close();
    }
}
