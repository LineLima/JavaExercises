package Exercicio_04;

import java.util.Scanner;

public class SistemaAcademico {
    private static Aluno[] alunos;
    private static Professor[] professores;
    private static Disciplina[] disciplinas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos a serem cadastrados: ");
        int quantidadeAlunos = scanner.nextInt();
        alunos = new Aluno[quantidadeAlunos];

        System.out.print("Informe a quantidade de professores a serem cadastrados: ");
        int quantidadeProfessores = scanner.nextInt();
        professores = new Professor[quantidadeProfessores];

        System.out.print("Informe a quantidade de disciplinas a serem cadastradas: ");
        int quantidadeDisciplinas = scanner.nextInt();
        disciplinas = new Disciplina[quantidadeDisciplinas];

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarDisciplina();
                    break;
                case 4:
                    matricularAlunoEmDisciplina();
                    break;
                case 5:
                    cancelarMatricula();
                    break;
                case 6:
                    imprimirListaDeAlunosEhDisciplinas();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1-Cadastrar Aluno");
        System.out.println("2-Cadastrar Professor");
        System.out.println("3-Cadastrar Disciplina");
        System.out.println("4-Matricular Aluno em Disciplina");
        System.out.println("5-Cancelar Matrícula");
        System.out.println("6-Imprimir lista Alunos e Disciplinas Matriculadas");
        System.out.println("0-Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < alunos.length; i++) {
        if (alunos[i] == null) {
            System.out.print("Informe o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Informe a matrícula do aluno: ");
            String matricula = scanner.nextLine();
            System.out.print("Informe o curso do aluno: ");
            String curso = scanner.nextLine();
            System.out.print("Informe o período do aluno: ");
            int periodo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe a idade do aluno: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe a quantidade de disciplinas permitidas: ");
            int quantidadeDisciplinasPermitidas = scanner.nextInt();
            scanner.nextLine();

            alunos[i] = new Aluno(nome, matricula, curso, periodo, idade, quantidadeDisciplinasPermitidas);
            System.out.println("Aluno cadastrado com sucesso.");
            break;
        }
    }
    }

    private static void cadastrarProfessor() {
        Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < professores.length; i++) {
        if (professores[i] == null) {
            System.out.print("Informe o nome do professor: ");
            String nome = scanner.nextLine();
            System.out.print("Informe a matrícula do professor: ");
            String matricula = scanner.nextLine();
            System.out.print("Informe o curso do professor: ");
            String curso = scanner.nextLine();
            System.out.print("Informe o período do professor: ");
            int periodo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe a idade do professor: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe a quantidade de disciplinas ministradas: ");
            int quantidadeDisciplinasMinistradas = scanner.nextInt();
            scanner.nextLine();

            professores[i] = new Professor(nome, matricula, curso, periodo, idade, quantidadeDisciplinasMinistradas);
            System.out.println("Professor cadastrado com sucesso.");
            break;
        }
    }
    }

    private static void cadastrarDisciplina() {
        Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < disciplinas.length; i++) {
        if (disciplinas[i] == null) {
            System.out.print("Informe o nome da disciplina: ");
            String nomeDisciplina = scanner.nextLine();
            System.out.print("Informe o nome do professor responsável: ");
            String nomeProfessor = scanner.nextLine();
            Professor professorResponsavel = obterProfessorPeloNome(nomeProfessor);

            System.out.print("Informe a quantidade máxima de alunos para a disciplina: ");
            int quantidadeMaxAlunos = scanner.nextInt();
            scanner.nextLine();

            disciplinas[i] = new Disciplina(nomeDisciplina, professorResponsavel, quantidadeMaxAlunos);
            System.out.println("Disciplina cadastrada com sucesso.");
            break;
        }
    }
    }

    private static Professor obterProfessorPeloNome(String nomeProfessor) {
        for (Professor professor : professores) {
            if (professor != null && professor.getNome().equals(nomeProfessor)) {
                return professor;
            }
        }
        System.out.println("Professor não encontrado. Cadastre o professor primeiro.");
        return null;
    }

    private static void matricularAlunoEmDisciplina() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o nome do aluno para matrícula: ");
    String nomeAluno = scanner.nextLine();
    Aluno alunoParaMatricula = obterAlunoPeloNome(nomeAluno);

    if (alunoParaMatricula != null) {
        System.out.print("Informe o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        Disciplina disciplina = obterDisciplinaPeloNome(nomeDisciplina);

        if (disciplina != null) {
            String resultado = disciplina.matricularAluno(alunoParaMatricula);
            System.out.println(resultado);
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    } else {
        System.out.println("Aluno não encontrado.");
    }
}

private static Aluno obterAlunoPeloNome(String nomeAluno) {
    for (Aluno aluno : alunos) {
        if (aluno != null && aluno.getNome().equals(nomeAluno)) {
            return aluno;
        }
    }
    System.out.println("Aluno não encontrado.");
    return null;
}

private static Disciplina obterDisciplinaPeloNome(String nomeDisciplina) {
    for (Disciplina disciplina : disciplinas) {
        if (disciplina != null && disciplina.getNome().equals(nomeDisciplina)) {
            return disciplina;
        }
    }
    System.out.println("Disciplina não encontrada.");
    return null;
}

private static void cancelarMatricula() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o nome do aluno para cancelamento de matrícula: ");
    String nomeAluno = scanner.nextLine();
    Aluno alunoParaCancelamento = obterAlunoPeloNome(nomeAluno);

    if (alunoParaCancelamento != null) {
        System.out.print("Informe o nome da disciplina a ser cancelada: ");
        String nomeDisciplina = scanner.nextLine();
        Disciplina disciplina = obterDisciplinaPeloNome(nomeDisciplina);

        if (disciplina != null) {
            String resultado = disciplina.cancelarMatricula(alunoParaCancelamento);
            System.out.println(resultado);
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    } else {
        System.out.println("Aluno não encontrado.");
    }
}

private static void imprimirListaDeAlunosEhDisciplinas() {
    for (Aluno aluno : alunos) {
        if (aluno != null) {
            System.out.println(aluno.imprime());
            System.out.println("---");
        }
    }

    for (Disciplina disciplina : disciplinas) {
        if (disciplina != null) {
            System.out.println(disciplina.imprime());
            System.out.println("---");
        }
    }
}
}