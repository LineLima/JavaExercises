package Exercicio_03;

public class Programador extends Funcionario {
    public Programador(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double getBonus() {
        return 0.8 * getSalario(); 
    }
}

