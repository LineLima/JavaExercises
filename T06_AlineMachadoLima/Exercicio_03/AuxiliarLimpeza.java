package Exercicio_03;

public class AuxiliarLimpeza extends Funcionario {
    public AuxiliarLimpeza(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double getBonus() {
        return 0.5 * getSalario();
    }
}
