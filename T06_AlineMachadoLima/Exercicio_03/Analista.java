package Exercicio_03;

public class Analista extends Funcionario {
    public Analista(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double getBonus() {
        return getSalario(); 
    }
}