package Exercicio_13;

public class VeiculoTerrestre extends Veiculo {
    public VeiculoTerrestre(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void andar() {
        System.out.println("Veículo terrestre andando.");
    }
}

