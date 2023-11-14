package Exercicio_06;

public class Gerente extends Funcionario {
    private int numPessoasGerenciadas;

    public Gerente(String nome, String matricula, double salario, int numPessoasGerenciadas)
            throws TamanhoEquipeInsuficienteException {
        super(nome, matricula, salario);
        if (numPessoasGerenciadas < 5) {
            throw new TamanhoEquipeInsuficienteException("Um Gerente deve ter uma equipe com pelo menos 5 pessoas.");
        }
        this.numPessoasGerenciadas = numPessoasGerenciadas;
    }

    @Override
    public double getBonus() {
        return 2 * getSalario() + 100.0 * numPessoasGerenciadas;
    }

    public void setNumPessoasGerenciadas(int numPessoasGerenciadas)
            throws TamanhoEquipeInsuficienteException {
        if (numPessoasGerenciadas < 5) {
            throw new TamanhoEquipeInsuficienteException("Um Gerente deve ter uma equipe com pelo menos 5 pessoas.");
        }
        this.numPessoasGerenciadas = numPessoasGerenciadas;
    }
}
