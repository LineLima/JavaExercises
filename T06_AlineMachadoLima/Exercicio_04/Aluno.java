package Exercicio_04;

public class Aluno extends Pessoa {
    private String[] disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas) {
        super(nome, matricula, curso, periodo, idade, quantidadeDisciplinasPermitidas);
        this.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidas];
    }

    public String fazMatricula(String disciplina) {
        if (disciplinasMatriculadas.length == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }

        for (int i = 0; i < disciplinasMatriculadas.length; i++) {
            if (disciplinasMatriculadas[i] == null) {
                disciplinasMatriculadas[i] = disciplina;
                return "Matrícula na disciplina \"" + disciplina + "\" executada.";
            }
        }

        return "Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de " + disciplinasMatriculadas.length + " disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
    }

    public String cancelarMatricula(String disciplina) {
        for (int i = 0; i < disciplinasMatriculadas.length; i++) {
            if (disciplinasMatriculadas[i] != null && disciplinasMatriculadas[i].equals(disciplina)) {
                disciplinasMatriculadas[i] = null;
                return "Cancelamento da matrícula da disciplina \"" + disciplina + "\" executado com sucesso.";
            }
        }
        return "Aluno não está matriculado na disciplina " + disciplina + ", portanto não é possível cancelar esta matrícula.";
    }

    public String imprime() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------------------------------\n");
        sb.append("Nome do Aluno: ").append(getNome()).append("\n");
        sb.append("Matricula: ").append(getMatricula()).append("\n");
        sb.append("Curso: ").append(getCurso()).append("\n");
        sb.append("Periodo: ").append(getPeriodo()).append("\n");
        sb.append("Disciplinas Matriculadas: ");
        for (String disciplina : disciplinasMatriculadas) {
            if (disciplina != null) {
                sb.append(disciplina).append("; ");
            }
        }
        sb.append("\n-----------------------------------------------------------------\n");

        return sb.toString();
    }
}
