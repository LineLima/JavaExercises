package Exercicio_04;

import java.util.Arrays;

public class Professor extends Pessoa {
    private String[] disciplinasMinistradas;

    public Professor(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasMinistradas) {
        super(nome, matricula, curso, periodo, idade, quantidadeDisciplinasMinistradas);
        this.disciplinasMinistradas = new String[quantidadeDisciplinasMinistradas];
    }

    public void adicionarDisciplinaMinistrada(String disciplina) {
        for (int i = 0; i < disciplinasMinistradas.length; i++) {
            if (disciplinasMinistradas[i] == null) {
                disciplinasMinistradas[i] = disciplina;
                break;
            }
        }
    }

    public String[] getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public String imprime() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------------------------------\n");
        sb.append("Nome do Professor: ").append(getNome()).append("\n");
        sb.append("Matricula: ").append(getMatricula()).append("\n");
        sb.append("Curso: ").append(getCurso()).append("\n");
        sb.append("Periodo: ").append(getPeriodo()).append("\n");
        sb.append("Disciplinas Ministradas: ").append(Arrays.toString(disciplinasMinistradas)).append("\n");
        sb.append("-----------------------------------------------------------------\n");

        return sb.toString();
    }
}

