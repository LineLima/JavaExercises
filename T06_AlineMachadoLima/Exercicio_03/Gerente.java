package Exercicio_03;

public class Gerente extends Funcionario {
    private int numPessoasGerenciadas;

    public Gerente(String nome, String matricula, double salario, int numPessoasGerenciadas) {
        super(nome, matricula, salario);
        this.numPessoasGerenciadas = numPessoasGerenciadas;
    }

    @Override
    public double getBonus() {
        return 2 * getSalario() + 100.0 * numPessoasGerenciadas;
    }
}
