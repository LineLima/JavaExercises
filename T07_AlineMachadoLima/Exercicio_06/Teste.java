package Exercicio_06;

public class Teste {
    public static void main(String[] args) {
        try {
            Gerente gerente = new Gerente("João", "123", 5000.0, 4);
        } catch (TamanhoEquipeInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            Diretor diretor = new Diretor("Maria", "456", 8000.0, 1);
        } catch (NumDepartamentosInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

