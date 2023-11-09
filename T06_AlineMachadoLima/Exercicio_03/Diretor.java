package Exercicio_03;

public class Diretor extends Funcionario {
    private int numDepartamentos;

    public Diretor(String nome, String matricula, double salario, int numDepartamentos) {
        super(nome, matricula, salario);
        this.numDepartamentos = numDepartamentos;
    }

    @Override
    public double getBonus() {
        return 4 * getSalario() + 3000.0 * numDepartamentos;
    }
}
