import java.util.Scanner;

public class Estadisticas {

    // promedio
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    //  desviación estándar
    public static double desviacion(double[] numeros, double promedio) {
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        // Llenar con datos de la practica  1.9 2.5 3.7 2 1 6 3 4 5 2
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double prom = promedio(numeros);

        double desv = desviacion(numeros, prom);

        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("La desviación estándar es: %.5f\n", desv);

        scanner.close();
    }
}
