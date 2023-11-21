package Exercicio_04;

public class Disciplina {
    private String nome;
    private Professor professorResponsavel;
    private Aluno[] alunosMatriculados;
    private int quantidadeAlunosMatriculados;

    public Disciplina(String nome, Professor professorResponsavel, int quantidadeMaxAlunos) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
        this.alunosMatriculados = new Aluno[quantidadeMaxAlunos];
        this.quantidadeAlunosMatriculados = 0;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public String matricularAluno(Aluno aluno) {
        if (quantidadeAlunosMatriculados < alunosMatriculados.length) {
            alunosMatriculados[quantidadeAlunosMatriculados++] = aluno;
            return "Aluno matriculado na disciplina \"" + nome + "\".";
        } else {
            return "Limite de alunos atingido. Não foi possível matricular mais alunos.";
        }
    }

    public String cancelarMatricula(Aluno aluno) {
        int index = indexOfAluno(aluno);
        if (index != -1) {
            for (int i = index; i < quantidadeAlunosMatriculados - 1; i++) {
                alunosMatriculados[i] = alunosMatriculados[i + 1];
            }
            alunosMatriculados[--quantidadeAlunosMatriculados] = null; 
            return "Cancelamento da matrícula do aluno " + aluno.getNome() + " na disciplina " + nome + " executado com sucesso.";
        } else {
            return "Aluno " + aluno.getNome() + " não está matriculado na disciplina " + nome + ", portanto não é possível cancelar esta matrícula.";
        }
    }

    private int indexOfAluno(Aluno aluno) {
        for (int i = 0; i < quantidadeAlunosMatriculados; i++) {
            if (alunosMatriculados[i].equals(aluno)) {
                return i;
            }
        }
        return -1; 
    }

    public String imprime() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------------------------------\n");
        sb.append("Disciplina: ").append(nome).append("\n");
        sb.append("Professor Responsável: ").append(professorResponsavel.getNome()).append("\n");
        sb.append("Alunos Matriculados: ");
        for (int i = 0; i < quantidadeAlunosMatriculados; i++) {
            sb.append(alunosMatriculados[i].getNome()).append("; ");
        }
        sb.append("\n-----------------------------------------------------------------\n");

        return sb.toString();
    }
}
