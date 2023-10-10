// 2. (Tarefa 4) Escreva a estrutura de uma classe (atributos e métodos) para
// representar uma Pessoa (nome, idade e endereço):
// a. Compile a classe;
// b. Crie uma outra classe que utilize um objeto Pessoa. Leia informações de
// nome, idade e endereço, e mostre todos os dados e a idade da pessoa. O
// programa deve usar os métodos do objeto.
// c. Acrescente dois métodos:
//  fazAniversario(): que incrementa a idade da pessoa
//  imprime(): Que imprime de forma legível todos os atributos da pessoa
// d. Altere o método main (que utiliza a classe pessoa) para que instancie
// uma pessoa, utilize algumas vezes o método fazAniversario e imprima os
// atributos do objeto pessoa.


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        System.out.println("Dados da pessoa: ");
        pessoa.imprime();

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("Dados com idade modificada: ");
        pessoa.imprime();

        scanner.close();

    }
    
}
