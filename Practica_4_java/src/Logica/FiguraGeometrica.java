
package Logica;


// Clase para calcular el área de diferentes figuras geométricas
public class FiguraGeometrica {

    // Método para calcular el área de un círculo (A = pi * r^2)
    public double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    // Método para calcular el área de un rectángulo (A = base * altura)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Método para calcular el área de un triángulo rectángulo (A = (base * altura) / 2)
    public double calcularArea(double base, double altura, boolean esTriangulo) {
        if (esTriangulo) {
            return (base * altura) / 2;
        }
        return 0;
    }

    // Método para calcular el área de un trapecio (A = ((baseMayor + baseMenor) * altura) / 2)
    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // Método para calcular el área de un pentágono regular (A = (5 * lado * apotema) / 2)
    public double calcularArea(double lado, double apotema, String penta) {
        if (penta=="si") {
           return (5 * lado * apotema) / 2;
        }
           return 0;
       
    }

    public static void main(String[] args) {
        FiguraGeometrica fg = new FiguraGeometrica();

        // Calcular el área de un círculo con radio 5
        double areaCirculo = fg.calcularArea(5);
        System.out.println("Área del círculo: " + areaCirculo);

        // Calcular el área de un rectángulo con base 4 y altura 6
        double areaRectangulo = fg.calcularArea(4, 6);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        // Calcular el área de un triángulo rectángulo con base 4 y altura 6
        double areaTriangulo = fg.calcularArea(4, 6, true);
        System.out.println("Área del triángulo rectángulo: " + areaTriangulo);

        // Calcular el área de un trapecio con base mayor 8, base menor 4 y altura 5
        double areaTrapecio = fg.calcularArea(8, 4, 5);
        System.out.println("Área del trapecio: " + areaTrapecio);

        // Calcular el área de un pentágono regular con lado 6 y apotema 4
        double areaPentagono = fg.calcularArea(6, 4,"si");
        System.out.println("Área del pentágono: " + areaPentagono);
    }
}
