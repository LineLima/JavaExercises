package Exercicio_13;

public class VeiculoAereo extends Veiculo {
    public VeiculoAereo(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void andar() {
        System.out.println("Veículo aéreo voando.");
    }
}

