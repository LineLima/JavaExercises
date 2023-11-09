package Exercicio_03;

public class SistemaRH {
    public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Matrícula: " + funcionario.getMatricula());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Bônus: " + funcionario.getBonus());
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Diretor("Diretor1", "D001", 10000, 3),
            new Gerente("Gerente1", "G001", 5000, 10),
            new Analista("Analista1", "A001", 3000),
            new Programador("Programador1", "P001", 2000),
            new AuxiliarLimpeza("Limpeza1", "L001", 1000)
        };

        imprimeRelatorio(funcionarios);
    }
}
