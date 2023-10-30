// 2. (Tarefa 5) Escreva a estrutura de uma classe (atributos e métodos) para
// representar um aluno (nome, matricula, curso, período,
// disciplinasMatriculadas(array de String) e endereço):
// a. Compile a classe;
// b. Crie um construtor para essa classe com a seguinte assinatura:
// public Aluno(String nome, String matricula, String curso, int periodo, int idade,
// int quantidadeDisciplinasPermitidadas)
// Onde a quantidadeDisciplinasPermitidadas representa a quantidade de
// disciplinas que o aluno pode se matricular. Deve ser utilizada para
// redimensionar o array de Strings.
// c. Acrescente três métodos:
//  String fazMatricula(String disciplina): inclui uma disciplina no array de
// Strings. Se o aluno já ultrapassou a quantidade de disciplinas que
// pode se matricular, então o sistema retorna para este método uma
// string informando: “Quantidade de disciplinas excedida. O limite de
// disciplinas para este aluno é de 2 disciplina(s). Se desejar, cancele a
// matrícula de uma das disciplinas e faça a nova matrícula.”
// Se o aluno não puder ser matriculado em nenhuma disciplina
// (tamanho do array=0), então o método deve retornar: “Este aluno não
// pode ser matriculado em nenhuma disciplina, por favor, fale com a
// secretaria.”
// Se foi matriculado com sucesso a seguinte String é retornada:
// “Matrícula na disciplina “LPOO” executada.”
//  String cancelarMatricula(String disciplina): exclui a disciplina do array
// de Strings. Se o aluno não estiver matriculado na disciplina, o método
// deve retornar: “Aluno não está matriculado na disciplina LPOO,
// portanto não é possível cancelar esta matrícula.”. Se o aluno
// realmente estiver matriculado na disciplina, então o método deve
// retornar “Cancelamento da matrícula da disciplina LPOO executado
// com sucesso.”
//  String imprime(): Método que retorna uma String de forma legível com
// todos os atributos de aluno e as disciplinas matriculadas no seguinte
// formato:
// -----------------------------------------------------------------
// Nome do Aluno: Rafael Romualdo Wandresen
// Matricula: GRR20130101
// Curso: TADS
// Periodo: 4
// Disciplinas Matriculadas: Gestão de Projetos; LPOO
// -----------------------------------------------------------------
// d. Crie uma outra classe (SistemaAcademico) que utilize objetos do tipo
// Aluno. Nessa classe instancie um array de Alunos que armazene os
// alunos criados. Crie um menu com as seguintes opções: 1 – Cadastrar
// Aluno, 2 – Excluir aluno por nome, 3 – Listar Alunos, 4 – Matricular Aluno
// em Disciplina, 5 – Cancelar Matrícula, 6 – Imprimir lista Alunos e
// Disciplinas Matriculadas. Cada um destes itens do menu deve ter um
// método associado com os seguintes métodos. Criar todos os métodos
// estáticos:
// 1. public static void cadastrarAluno(Aluno aluno)
// 2. public static void excluirAlunoPorNome(String nomeAluno)
// 3. public static Aluno[] listarAlunos()
// 4. public static String matricularAlunoEmDisciplina(Aluno aluno,
// String disciplina). Onde o retorno informa o que ocorreu com a
// matricula do aluno, conforme especificado no método
// fazMatricula.
// 5. public static String cancelarMatricula(Aluno aluno, String
// disciplina)
// 6. public static String imprimirListaDeAlunoseDisciplinas ()
// e. Quando o sistema iniciar deve pedir ao usuário para informar a
// quantidade de alunos que serão cadastrados. Com essa informação
// dimensione o array.
// f. Quando o usuário optar pela opção 4, se for a primeira disciplina do
// aluno, o sistema deve perguntar em quantas disciplinas o aluno deve ser
// matriculado. Com essa informação dimensione o array de Strings.


import java.util.Scanner;

public class SistemaAcademico {
    private static Aluno[] alunos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos a serem cadastrados: ");
        int quantidadeAlunos = scanner.nextInt();
        alunos = new Aluno[quantidadeAlunos];

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1-Cadastrar Aluno");
            System.out.println("2-Excluir aluno por nome");
            System.out.println("3-Listar Alunos");
            System.out.println("4-Matricular Aluno em Disciplina");
            System.out.println("5-Cancelar Matrícula");
            System.out.println("6-Imprimir lista Alunos e Disciplinas Matriculadas");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    System.out.print("Informe o nome do aluno a ser excluído: ");
                    String nomeAluno = scanner.nextLine();
                    excluirAlunoPorNome(nomeAluno);
                    break;
                case 3:
                    listarAlunos();
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

    public static void cadastrarAluno() {
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

    public static void excluirAlunoPorNome(String nomeAluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nomeAluno)) {
                alunos[i] = null;
                System.out.println("Aluno excluído com sucesso.");
                break;
            }
        }
    }

    public static void listarAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno.imprime());
                System.out.println("------");
            }
        }
    }

    public static void matricularAlunoEmDisciplina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno para matrícula: ");
        String nomeAluno = scanner.nextLine();
        Aluno alunoParaMatricula = null;

        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equals(nomeAluno)) {
                alunoParaMatricula = aluno;
                break;
            }
        }

        if (alunoParaMatricula != null) {
            System.out.print("Informe o nome da disciplina: ");
            String disciplina = scanner.nextLine();
            String resultado = alunoParaMatricula.fazMatricula(disciplina);
            System.out.println(resultado);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void cancelarMatricula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno para cancelamento de matrícula: ");
        String nomeAluno = scanner.nextLine();
        Aluno alunoParaCancelamento = null;

        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equals(nomeAluno)) {
                alunoParaCancelamento = aluno;
                break;
            }
        }

        if (alunoParaCancelamento != null) {
            System.out.print("Informe o nome da disciplina a ser cancelada: ");
            String disciplina = scanner.nextLine();
            String resultado = alunoParaCancelamento.cancelarMatricula(disciplina);
            System.out.println(resultado);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void imprimirListaDeAlunosEhDisciplinas() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno.imprime());
                System.out.println("---");
            }
        }
    }
}

