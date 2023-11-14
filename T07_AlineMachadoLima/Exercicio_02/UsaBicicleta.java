
public class UsaBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();

        try {
            bicicleta.setVelocidade(120); 
        } catch (VelocidadeException e) {
            System.out.println("Exceção de velocidade: " + e.getMessage());
        }

        try {
            bicicleta.setRPM(-10); 
        } catch (RPMException e) {
            System.out.println("Exceção de RPM: " + e.getMessage());
        }

        try {
            bicicleta.setMarcha(25); 
        } catch (MarchaException e) {
            System.out.println("Exceção de marcha: " + e.getMessage());
        }

        bicicleta.printStates();
    }
}
