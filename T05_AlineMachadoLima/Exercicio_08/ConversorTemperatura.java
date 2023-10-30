
// 8. (Tarefa 5) Implemente uma classe contendo apenas métodos estáticos
// capazes de realizar todas as conversões de temperatura possíveis entre as
// unidades Celsius, Farenheit e Kelvin. São conhecidas as seguintes
// relações de conversão: F = 9*C/5 + 32 e K = C + 273. Demonstre a
// utilização do objeto. Utilize, neste programa, uma estrutura de controle
// switch para identificar a conversão solicitada pelo usuário;


package Exercicio_08;

import java.util.Scanner;

public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius) {
        return 9 * celsius / 5 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        double celsius = fahrenheitParaCelsius(fahrenheit);
        return celsiusParaKelvin(celsius);
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        double celsius = kelvinParaCelsius(kelvin);
        return celsiusParaFahrenheit(celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Fahrenheit para Kelvin");
        System.out.println("6 - Kelvin para Fahrenheit");

        int escolha = scanner.nextInt();
        double temperaturaOriginal;

        if (escolha >= 1 && escolha <= 6) {
            System.out.print("Informe a temperatura: ");
            temperaturaOriginal = scanner.nextDouble();

            double temperaturaConvertida;

            switch (escolha) {
                case 1:
                    temperaturaConvertida = celsiusParaFahrenheit(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "°C = " + temperaturaConvertida + "°F");
                    break;
                case 2:
                    temperaturaConvertida = fahrenheitParaCelsius(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "°F = " + temperaturaConvertida + "°C");
                    break;
                case 3:
                    temperaturaConvertida = celsiusParaKelvin(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "°C = " + temperaturaConvertida + "K");
                    break;
                case 4:
                    temperaturaConvertida = kelvinParaCelsius(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "K = " + temperaturaConvertida + "°C");
                    break;
                case 5:
                    temperaturaConvertida = fahrenheitParaKelvin(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "°F = " + temperaturaConvertida + "K");
                    break;
                case 6:
                    temperaturaConvertida = kelvinParaFahrenheit(temperaturaOriginal);
                    System.out.println(temperaturaOriginal + "K = " + temperaturaConvertida + "°F");
                    break;
            }
        } else {
            System.out.println("Escolha inválida");
        }
    }
}
