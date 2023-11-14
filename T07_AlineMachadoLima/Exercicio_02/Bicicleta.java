public class Bicicleta {
    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;

    
    public Bicicleta() {
    }

    public void mudarCadencia(int novoValor) {
        cadencia = novoValor;
    }

    public void setVelocidade(int novoValor) throws VelocidadeException {
        if (novoValor < 0 || novoValor > 100) {
            throw new VelocidadeException("Velocidade inválida: " + novoValor);
        }
        velocidade = novoValor;
    }

    public void setRPM(int novoValor) throws RPMException {
        if (novoValor < 0) {
            throw new RPMException("RPM inválido: " + novoValor);
        }
    }

    public void setMarcha(int novoValor) throws MarchaException {
        if (novoValor < 0 || novoValor > 24) {
            throw new MarchaException("Marcha inválida: " + novoValor);
        }
        marcha = novoValor;
    }

    public void aumentarVelocidade(int incremento) {
        velocidade = velocidade + incremento;
    }

    public void aplicarFreios(int decremento) {
        velocidade = velocidade - decremento;
    }

    public void printStates() {
        System.out.println("cadencia=" + cadencia + " velocidade=" + velocidade + " marcha=" + marcha);
    }
}

class VelocidadeException extends Exception {
    public VelocidadeException(String mensagem) {
        super(mensagem);
    }
}

class RPMException extends Exception {
    public RPMException(String mensagem) {
        super(mensagem);
    }
}

class MarchaException extends Exception {
    public MarchaException(String mensagem) {
        super(mensagem);
    }
}
