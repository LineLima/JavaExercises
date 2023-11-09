package Exercicio_13;

import java.util.Scanner;

public abstract class Veiculo {
    private String modelo;
    private String cor;

    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public abstract void andar();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

