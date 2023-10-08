// 7. (Tarefa 3) Escreva um programa com os seguintes passos: 1) Peça ao usuário que informe
// quantos funcionários existem na empresa. 2) Instancie um array de strings e um array de
// doubles com o tamanho informado. 3) Peça ao usuário que informe o nome e o salário de
// cada funcionário e armazene o nome no array de strings e o salário no array de doubles. 4)
// Calcule a média salarial da empresa. 5) Imprima a lista de nomes/salários que estão acima
// da média salarial. Obs.: Faça o tratamento das entradas de dados. Se o usuário informar um
// salário inválido, peça para ele informar novamente. Imprima os salários com duas casas
// decimais. Os nomes devem conter ao menos 3 caracteres.

import java.util.Scanner;

public class MediaSalarialEmpresa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos funcionários existem na empresa: ");
        int funcionarios = scanner.nextInt();

        while(funcionarios <= 0){
            System.out.println("Numero de funcionarios deve ser maior que zero");
            funcionarios = scanner.nextInt();
        }

        String[] nomes = new String[funcionarios];
        Double[] salarios = new Double[funcionarios];

        for (int i = 0; i < funcionarios; i++){
            System.out.println("Digite o nome do funcionário: ");
            nomes[i] = scanner.next();

            while(nomes[i].length() < 3){
                System.out.println("Nome deve ter mais que 3 caracteres, digite novamente: ");
                nomes[i] = scanner.next();
            }

            System.out.println("Digite o salario do funcionario: ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Valor de salário inválido. Tente novamente.");
                System.out.print("Informe o salário do funcionário " + (i + 1) + ": ");
                scanner.next();
            }

            salarios[i] = scanner.nextDouble();
        }

        double somaSalario = 0;
        for (int i = 0; i < funcionarios; i++){
            somaSalario += salarios[i];
        }
        double mediaSalarios = somaSalario/funcionarios;
        System.out.println("A media salarial da empresa é: " + mediaSalarios);

        System.out.println("Funcionarios com o salario acima da media salarial: ");
        for (int i = 0; i < funcionarios; i++){
            if (salarios[i] > mediaSalarios){
                System.out.printf("%s: R$ %.2f%n", nomes[i], salarios[i]);
            }
        }
     
        scanner.close();
    }
    
}
