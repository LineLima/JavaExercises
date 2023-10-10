public class Pessoa{
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void fazAniversario(){
        idade++;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

}