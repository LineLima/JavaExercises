package Exercicio_04;

public class Pessoa {
    protected String nome;
    protected String matricula;
    protected String curso;
    protected int periodo;
    protected String endereco;

    public Pessoa(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.endereco = "";
    }


    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getEndereco() {
        return endereco;
    }
}

