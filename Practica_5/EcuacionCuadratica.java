import java.util.Scanner;

public class EcuacionCuadratica {

    // discriminante
    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // primera ra�zzz
    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    // segunda ra�zx
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
            System.out.println("Las ra�ces de la ecuaci�n son: ");
            System.out.println("Ra�z 1: " + raiz1);
            System.out.println("Ra�z 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = getRaiz1(a, b, discriminante);
            System.out.println("La ecuaci�n tiene una ra�z doble: " + raiz);
        } else {
            System.out.println("La ecuaci�n no tiene ra�ces reales.");
        }

        scanner.close();
    }
}


