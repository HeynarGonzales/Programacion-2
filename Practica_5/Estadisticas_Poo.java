import java.util.Scanner;

class Estadisticas {

    // Atributo tipo vector
    private double[] numeros;

    // Constructor 
    public Estadisticas(double[] numeros) {
        this.numeros = numeros;
    }

    // promedioooo
    public double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    //desviación eestándar
    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // arreglo para almacenar los 10 nomeros
        double[] numeros = new double[10];

        // Llenar con datos de la practica 1.9 2.5 3.7 2 1 6 3 4 5 2
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Estadisticas stats = new Estadisticas(numeros);

        double prom = stats.promedio();
        double desv = stats.desviacion();

        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("La desviación estándar es: %.5f\n", desv);

        scanner.close();
    }
}
