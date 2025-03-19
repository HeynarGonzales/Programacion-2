import java.util.Scanner;

public class EcuacionCuadratica {

    // discriminante
    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // primera raízzz
    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    // segunda raízx
    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double raiz1 = getRaiz1(a, b, discriminante);
            double raiz2 = getRaiz2(a, b, discriminante);
            System.out.println("Las raíces de la ecuación son: ");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = getRaiz1(a, b, discriminante);
            System.out.println("La ecuación tiene una raíz doble: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        scanner.close();
    }
}


