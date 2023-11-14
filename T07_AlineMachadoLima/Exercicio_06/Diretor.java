package Exercicio_06;

public class Diretor extends Funcionario {
    private int numDepartamentos;

    public Diretor(String nome, String matricula, double salario, int numDepartamentos)
            throws NumDepartamentosInsuficienteException {
        super(nome, matricula, salario);
        if (numDepartamentos < 2) {
            throw new NumDepartamentosInsuficienteException("Um Diretor deve dirigir no mínimo 2 departamentos.");
        }
        this.numDepartamentos = numDepartamentos;
    }

    @Override
    public double getBonus() {
        return 4 * getSalario() + 3000.0 * numDepartamentos;
    }
}
